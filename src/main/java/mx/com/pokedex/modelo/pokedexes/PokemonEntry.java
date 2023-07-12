/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokedexes;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class PokemonEntry {

    @JsonProperty("entry_number")
    private Integer entry_number;

    @JsonProperty("pokemon_species")
    private NamedAPIResource<PokemonSpecies> pokemon_species;

    public Integer getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(Integer entry_number) {
        this.entry_number = entry_number;
    }

    public NamedAPIResource<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(NamedAPIResource<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

}
