/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class PokemonSpeciesGender {
    
    @JsonProperty("rate")
    private Integer rate;
    
    @JsonProperty("pokemon_species")
    private NamedAPIResource<PokemonSpecies> pokemon_species;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedAPIResource<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(NamedAPIResource<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }
    
    
}
