/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.locationareas;

import mx.com.pokedex.modelo.locations.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class LocationArea implements PokeApiResource, Localizable {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("game_index")
    private Integer game_index;
    
    @JsonProperty("encounter_method_rates")
    private List<EncounterMethodRate> encounter_method_rates;
    
    @JsonProperty("location")
    private NamedAPIResource<Location> location;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("pokemon_encounters")
    private List<PokemonEncounter> pokemon_encounters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public List<EncounterMethodRate> getEncounter_method_rates() {
        return encounter_method_rates;
    }

    public void setEncounter_method_rates(List<EncounterMethodRate> encounter_method_rates) {
        this.encounter_method_rates = encounter_method_rates;
    }

    public NamedAPIResource<Location> getLocation() {
        return location;
    }

    public void setLocation(NamedAPIResource<Location> location) {
        this.location = location;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PokemonEncounter> getPokemon_encounters() {
        return pokemon_encounters;
    }

    public void setPokemon_encounters(List<PokemonEncounter> pokemon_encounters) {
        this.pokemon_encounters = pokemon_encounters;
    }
    
    
}
