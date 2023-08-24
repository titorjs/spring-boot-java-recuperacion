package com.recuperacion.pokeapi.controllers;

import com.recuperacion.pokeapi.client.PokeApiClient;
import com.recuperacion.pokeapi.models.PokemonDescription;
import com.recuperacion.pokeapi.models.PokemonModel;
import com.recuperacion.pokeapi.models.PokemonWeaknesses;
import com.recuperacion.pokeapi.models.ResultInfo;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GenerateData {
    private PokemonModel pokemonModel;
    private PokeApiClient pokeApiClient;

    public GenerateData(PokemonModel pokemonModel, PokeApiClient pokeApiClient) {
        this.pokeApiClient = pokeApiClient;

    }

    public Optional<String> getInformation() {
        if (pokemonModel != null){
            ResultInfo.ResultInfoBuilder resultInfoBuilder = ResultInfo.builder();
            resultInfoBuilder.name(pokemonModel.getName());
            resultInfoBuilder.height(pokemonModel.getHeight());
            resultInfoBuilder.weight(pokemonModel.getWeight());

            String description = pokeApiClient.getPokemonDescription(pokemonModel.getName())
                    .getFlavor_text_entries().stream()
                    .filter(texto -> "es".equals(texto.getLanguage().get(0).getName()))
                    .findFirst().get().getFlavor_text();

            resultInfoBuilder.description(description);

            String types = pokemonModel.getTypes().stream()
                    .map(type -> type.getName()).reduce((String, text) -> text + "\t").get();

            resultInfoBuilder.type(types);

            HashSet<String> weak = new HashSet<>();
            List<PokemonWeaknesses> provicional =  pokemonModel.getTypes().stream().map(type -> pokeApiClient.getTypeWeaknesses(type.getName())).collect(Collectors.toList());
            provicional.stream().
                    forEach(weakList -> weakList.getDamage_relations().getDouble_damage_from().stream()
                            .forEach(weakness -> weak.add(weakness.getName())));

            String weaknesses = weak.stream().reduce((String, weakness) -> weakness + "\t").orElse("No Weaknesses");

            resultInfoBuilder.weaknesses(weaknesses);


            String basePoint = pokemonModel.getStats().stream()
                    .map(stat -> stat.getStat().getName() + ": " + "*".repeat(stat.getBase_stat() / 10))
                    .reduce((String, value) -> "\t\t" + value + "\n").orElse("Error :/");

            resultInfoBuilder.basePoint(basePoint);

            return Optional.of(resultInfoBuilder.build().toString());
        }
        return Optional.empty();
    }
}
