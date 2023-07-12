/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.generation.Generation;

/**
 *
 * @author Manuel
 */
public class PokemonTypePast {
    
    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;
    
    @JsonProperty("types")
    private List<PokemonType> types;
}
