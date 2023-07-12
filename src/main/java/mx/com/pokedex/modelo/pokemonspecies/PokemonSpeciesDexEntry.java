/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonspecies;

import mx.com.pokedex.modelo.pokedexes.Pokedex;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class PokemonSpeciesDexEntry {
    @JsonProperty("entry_number")
    private Integer entry_number;
    
    @JsonProperty("pokedex")
    private NamedAPIResource<Pokedex> pokedex;

    public Integer getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(Integer entry_number) {
        this.entry_number = entry_number;
    }

    public NamedAPIResource<Pokedex> getPokedex() {
        return pokedex;
    }

    public void setPokedex(NamedAPIResource<Pokedex> pokedex) {
        this.pokedex = pokedex;
    }
    
    
}
