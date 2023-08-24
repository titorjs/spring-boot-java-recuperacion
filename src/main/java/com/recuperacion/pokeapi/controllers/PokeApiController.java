package com.recuperacion.pokeapi.controllers;

import com.recuperacion.pokeapi.client.PokeApiClient;
import com.recuperacion.pokeapi.models.PokemonModel;
import com.recuperacion.pokeapi.models.ResulBasico;
import com.recuperacion.pokeapi.models.ResultInfo;
import com.recuperacion.pokeapi.service.PokemonService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PokeApiController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/infoPoke/{name}")
    public ResponseEntity<String> getPokeInfo(@PathVariable String name){

        Optional<String> optionalResult = pokemonService.getInfoPokemon(name);
        if (optionalResult.isPresent()) {
            return ResponseEntity.ok(optionalResult.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/prueba/{name}")
    public ResponseEntity<ResulBasico> getPokeBasico(@PathVariable String name){
        Optional<ResulBasico> optionalResult = pokemonService.getInfoBasico(name);
        if (optionalResult.isPresent()) {
            return ResponseEntity.ok(optionalResult.get());
        }
        return ResponseEntity.notFound().build();
    }
}
