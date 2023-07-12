/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokedexes;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Description;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.regions.Region;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class Pokedex implements PokeApiResource, Localizable {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("is_main_series")
    private Boolean is_main_series;
    
    @JsonProperty("descriptions")
    private List<Description> descriptions;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("pokemon_entries")
    private List<PokemonEntry> pokemon_entries;
    
    @JsonProperty("region")
    private NamedAPIResource<Region> region;
    
    @JsonProperty("version_groups")
    private List<NamedAPIResource<VersionGroup>> version_groups;

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

    public Boolean getIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(Boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PokemonEntry> getPokemon_entries() {
        return pokemon_entries;
    }

    public void setPokemon_entries(List<PokemonEntry> pokemon_entries) {
        this.pokemon_entries = pokemon_entries;
    }

    public NamedAPIResource<Region> getRegion() {
        return region;
    }

    public void setRegion(NamedAPIResource<Region> region) {
        this.region = region;
    }

    public List<NamedAPIResource<VersionGroup>> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(List<NamedAPIResource<VersionGroup>> version_groups) {
        this.version_groups = version_groups;
    }
    
    
    
    
}
