/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.locations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.GenerationGameIndex;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.locationareas.LocationArea;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.regions.Region;

/**
 *
 * @author Manuel
 */
public class Location implements PokeApiResource, Localizable {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("region")
    private NamedAPIResource<Region> region;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("game_indices")
    private List<GenerationGameIndex> game_indices;
    
    @JsonProperty("areas")
    private List<NamedAPIResource<LocationArea>> areas;

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

    public NamedAPIResource<Region> getRegion() {
        return region;
    }

    public void setRegion(NamedAPIResource<Region> region) {
        this.region = region;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public List<NamedAPIResource<LocationArea>> getAreas() {
        return areas;
    }

    public void setAreas(List<NamedAPIResource<LocationArea>> areas) {
        this.areas = areas;
    }

    
}
