package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PokemonModel {

    private String name;
    private Integer height;
    private Integer weight;
    private List<Type> types;
    private List<Stat> stats;

    @Builder
    @Getter
    public static class Type{
        private String name;
    }

    @Builder
    @Getter
    public static class Stat{
        private Integer base_stat;
        private StatName stat;
    }

    @Builder
    @Getter
    public static class StatName{
        private String name;
    }
}
