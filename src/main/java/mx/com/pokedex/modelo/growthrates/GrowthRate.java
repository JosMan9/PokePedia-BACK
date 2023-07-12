/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.growthrates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Description;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class GrowthRate implements PokeApiResource {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("formula")
    private String formula;
    
    @JsonProperty("descriptions")
    private List<Description> descriptions;
    
    @JsonProperty("levels")
    private List<GrowthRateExperienceLevel> levels;
    
    @JsonProperty("pokemon_species")
    private List<NamedAPIResource<PokemonSpecies>> pokemon_species;

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

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<GrowthRateExperienceLevel> levels) {
        this.levels = levels;
    }

    public List<NamedAPIResource<PokemonSpecies>> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(List<NamedAPIResource<PokemonSpecies>> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }
    
    
}
