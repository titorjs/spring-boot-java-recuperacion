package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResulBasico {

    private String name;
    private Integer height;
    private Integer weight;

    public static class ResulBasicoBuilder{
        @Override
        public String toString() {
            return "ResulBasicoBuilder{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
}
