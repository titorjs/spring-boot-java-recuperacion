package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PokemonWeaknesses {

    private DamageRelations damage_relations;

    @Setter
    @Getter
    public static class DamageRelations{
        private List<DoubleDamage> double_damage_from;
    }

    @Setter
    @Getter
    public static class DoubleDamage{
        private String name;
    }
}
