package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PokemonBasico {
    private String name;
    private Integer height;
    private Integer weight;
}
