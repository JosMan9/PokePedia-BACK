/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.generation.Generation;

/**
 *
 * @author Manuel
 */
public class GenerationGameIndex {
    
    @JsonProperty("game_index")
    private Integer game_index;
    
    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }
    
    
}
