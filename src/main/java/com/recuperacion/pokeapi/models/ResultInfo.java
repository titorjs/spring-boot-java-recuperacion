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
            int lineaPunteada = mayorLongitudParams();
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

        public int mayorLongitudParams(){
            int max = 9 + name.length();

            int aux = 11 + (String.format("%.1f", ((float)height)*0.1)).length();
            if(max < aux){
                max = aux;
            }

            aux = 9 + (String.format("%.1f", ((float)weight)*0.1)).length();
            if(max < aux){
                max = aux;
            }

            aux = 9 + type.length();
            if(max < aux){
                max = aux;
            }

            aux = 15 + weaknesses.length();
            if(max < aux){
                max = aux;
            }

            return max;
        }
    }
}
