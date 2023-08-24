package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
public class PokemonModel {

    private String name;
    private Integer height;
    private Integer weight;
    private List<Type> types;
    private List<Stat> stats;

    @Setter
    @Getter
    public static class Type{
        private TypeName type;
    }

    @Setter
    @Getter
    public static class TypeName{
        private String name;
    }

    @Setter
    @Getter
    public static class Stat{
        private Integer base_stat;
        private StatName stat;
    }

    @Setter
    @Getter
    public static class StatName{
        private String name;
    }
}
