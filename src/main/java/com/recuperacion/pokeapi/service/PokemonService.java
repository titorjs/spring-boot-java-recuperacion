package com.recuperacion.pokeapi.service;

import com.recuperacion.pokeapi.models.ResulBasico;

import java.util.Optional;

public interface PokemonService {
    Optional<String> getInfoPokemon(String name);
    Optional<ResulBasico> getInfoBasico(String name);
}
