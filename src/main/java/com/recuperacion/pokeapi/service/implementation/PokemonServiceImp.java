package com.recuperacion.pokeapi.service.implementation;

import com.recuperacion.pokeapi.client.PokeApiClient;
import com.recuperacion.pokeapi.controllers.GenerateData;
import com.recuperacion.pokeapi.controllers.PokeApiController;
import com.recuperacion.pokeapi.models.PokemonBasico;
import com.recuperacion.pokeapi.models.PokemonModel;
import com.recuperacion.pokeapi.models.ResulBasico;
import com.recuperacion.pokeapi.models.ResultInfo;
import com.recuperacion.pokeapi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonServiceImp implements PokemonService {

    @Autowired
    private PokeApiClient pokeApiClient;

    @Override
    public Optional<ResultInfo> getInfoPokemon(String name) {
        PokemonModel pokemonModel = pokeApiClient.getPokemon(name);
        GenerateData generateData = new GenerateData(pokemonModel, pokeApiClient);
        return generateData.getInformation();
    }

    @Override
    public Optional<ResulBasico> getInfoBasico(String name) {
        PokemonBasico pokemonBasico = pokeApiClient.getPokemonBasico(name);
        if (pokemonBasico != null){
            ResulBasico.ResulBasicoBuilder result = ResulBasico.builder();

            result.name(pokemonBasico.getName());
            result.weight(pokemonBasico.getWeight());
            result.height(pokemonBasico.getHeight());

            return Optional.of(result.build());
        }
        return Optional.empty();
    }


}
