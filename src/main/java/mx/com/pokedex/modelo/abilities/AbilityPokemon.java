/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.abilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemon.Pokemon;

/**
 *
 * @author Manuel
 */
public class AbilityPokemon {
    
    @JsonProperty("is_hidden")
    private Boolean is_hidden;
    
    @JsonProperty("slot")
    private Integer slot;
    
    @JsonProperty("pokemon")
    private NamedAPIResource<Pokemon> pokemon;

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedAPIResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedAPIResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    
    
}
