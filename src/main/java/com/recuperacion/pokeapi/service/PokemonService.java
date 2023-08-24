package com.recuperacion.pokeapi.service;

import com.recuperacion.pokeapi.models.ResulBasico;
import com.recuperacion.pokeapi.models.ResultInfo;

import java.util.Optional;

public interface PokemonService {
    Optional<String> getInfoPokemon(String name);
    Optional<String> getInfoPokemonLanguage(String name, String language);
    Optional<ResulBasico> getInfoBasico(String name);
}
