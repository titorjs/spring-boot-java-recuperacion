package com.recuperacion.pokeapi.client;

import com.recuperacion.pokeapi.models.PokemonBasico;
import com.recuperacion.pokeapi.models.PokemonDescription;
import com.recuperacion.pokeapi.models.PokemonModel;
import com.recuperacion.pokeapi.models.PokemonWeaknesses;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "pokeApi", url="https://pokeapi.co/api/v2")
public interface PokeApiClient {
    @GetMapping("/pokemon/{name}")
    public PokemonModel getPokemon(@PathVariable String name);

    @GetMapping("/pokemon/{name}")
    public PokemonBasico getPokemonBasico(@PathVariable String name);

    @GetMapping("/pokemon-species/{name}/")
    public PokemonDescription getPokemonDescription(@PathVariable String id);

    @GetMapping("/type/{name}/")
    public PokemonWeaknesses getTypeWeaknesses(@PathVariable String name);


}
