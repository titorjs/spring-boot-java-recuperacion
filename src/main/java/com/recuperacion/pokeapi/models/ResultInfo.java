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

            int lineaPunteada = 30;

            //implementación del switch linea punteada

            return  "PokeDex\n" +
                    "-".repeat(lineaPunteada) + "\n" +
                    "1. Name: " + name + "\n" +
                    "2. Height: " + (String.format("%.1f", ((float)height)*0.1)) + " m\n" +
                    "3. Weight: " + (String.format("%.1f", ((float)weight)*0.1)) + " kg\n" +
                    "4. Description: " + description + "\n" +
                    "5. Type: " + type + "\n" +
                    "6. Weaknesses: " + weaknesses + "\n" +
                    "7. Base Point\n" + basePoint +
                    "-".repeat(lineaPunteada) + "\n";
        }
    }
}
