/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class Gender implements PokeApiResource {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("pokemon_species_details")
    private List<PokemonSpeciesGender> pokemon_species_details;
    
    @JsonProperty("required_for_evolution")
    private List<NamedAPIResource<PokemonSpecies>> required_for_evolution;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonSpeciesGender> getPokemon_species_details() {
        return pokemon_species_details;
    }

    public void setPokemon_species_details(List<PokemonSpeciesGender> pokemon_species_details) {
        this.pokemon_species_details = pokemon_species_details;
    }

    public List<NamedAPIResource<PokemonSpecies>> getRequired_for_evolution() {
        return required_for_evolution;
    }

    public void setRequired_for_evolution(List<NamedAPIResource<PokemonSpecies>> required_for_evolution) {
        this.required_for_evolution = required_for_evolution;
    }
    
    
    
}
