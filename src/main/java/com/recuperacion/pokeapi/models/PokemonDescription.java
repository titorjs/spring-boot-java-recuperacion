package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PokemonDescription {
    private List<Texto> flavor_text_entries;

    @Builder
    @Getter
    public static class Texto{
        private String flavor_text;
        private List<Language> language;
    }

    @Builder
    @Getter
    public static class Language{
        private String name;
    }
}
