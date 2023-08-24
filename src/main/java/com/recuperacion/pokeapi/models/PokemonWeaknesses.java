package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PokemonWeaknesses {
    private DamageRelations damage_relations;

    @Builder
    @Getter
    public static class DamageRelations{
        private List<DoubleDamage> double_damage_from;
    }

    @Builder
    @Getter
    public static class DoubleDamage{
        private String name;
    }
}
