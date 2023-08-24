package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PokemonDescription {

    private List<Texts> flavor_text_entries;

    @Setter
    @Getter
    public static class Texts {
        private String flavor_text;
        private Language language;
    }

    @Setter
    @Getter
    public static class Language{
        private String name;
    }
}
