/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.regions;

import mx.com.pokedex.modelo.locations.Location;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;
import mx.com.pokedex.modelo.pokedexes.Pokedex;
import mx.com.pokedex.modelo.generation.Generation;
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
public class Region implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("locations")
    private List<NamedAPIResource<Location>> locations;

    @JsonProperty("name")
    private String name;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("main_generation")
    private NamedAPIResource<Generation> main_generation;

    @JsonProperty("pokedex")
    private List<NamedAPIResource<Pokedex>> pokedexes;

    @JsonProperty("version_groups")
    private List<NamedAPIResource<VersionGroup>> version_groups;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<NamedAPIResource<Location>> getLocations() {
        return locations;
    }

    public void setLocations(List<NamedAPIResource<Location>> locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NamedAPIResource<Generation> getMain_generation() {
        return main_generation;
    }

    public void setMain_generation(NamedAPIResource<Generation> main_generation) {
        this.main_generation = main_generation;
    }

    public List<NamedAPIResource<Pokedex>> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<NamedAPIResource<Pokedex>> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public List<NamedAPIResource<VersionGroup>> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(List<NamedAPIResource<VersionGroup>> version_groups) {
        this.version_groups = version_groups;
    }

}
