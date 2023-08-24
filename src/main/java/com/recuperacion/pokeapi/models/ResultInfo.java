package com.recuperacion.pokeapi.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResultInfo {

    private String name;
    private Integer height;
    private Integer weight;
    private String description;
    private String type;
    private String weaknesses;
    private String basePoint;

    public static class ResultInfoBuilder{
        @Override
        public String toString() {
            return  "1. Name: " + name + "\n" +
                    "2. Height: " + (((float)height)*0.1) + "\n" +
                    "3. Weight: " + (((float)weight)*0.1) + "\n" +
                    "4. Description: " + description + "\n" +
                    "5. Type: " + type + "\n" +
                    "6. Weaknesses: " + weaknesses + "\n" +
                    "7. Base Point\n" +
                    basePoint ;
        }
    }
}
