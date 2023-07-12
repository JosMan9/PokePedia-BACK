/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.types;

import mx.com.pokedex.modelo.pokemon.Pokemon;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class TypePokemon {

    @JsonProperty("slot")
    private Integer slot;

    @JsonProperty("pokemon")
    private NamedAPIResource<Pokemon> pokemon;

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
