/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonspecies;

import mx.com.pokedex.modelo.pokemon.Pokemon;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class PokemonSpeciesVariety {
    @JsonProperty("is_default")
    private Boolean is_default;
    
    @JsonProperty("pokemon")
    private NamedAPIResource<Pokemon> pokemon;

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public NamedAPIResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedAPIResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    
    
}
