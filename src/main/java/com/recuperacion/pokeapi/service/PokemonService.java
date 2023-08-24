package com.recuperacion.pokeapi.service;

import com.recuperacion.pokeapi.models.ResulBasico;
import com.recuperacion.pokeapi.models.ResultInfo;

import java.util.Optional;

public interface PokemonService {
    Optional<ResultInfo> getInfoPokemon(String name);
    Optional<ResulBasico> getInfoBasico(String name);
}
