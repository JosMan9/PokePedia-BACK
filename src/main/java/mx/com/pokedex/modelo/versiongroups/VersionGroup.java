/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.versiongroups;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.generation.Generation;
import mx.com.pokedex.modelo.movelearnmethod.MoveLearnMethod;
import mx.com.pokedex.modelo.pokedexes.Pokedex;
import mx.com.pokedex.modelo.regions.Region;
import mx.com.pokedex.modelo.version.Version;

/**
 *
 * @author Manuel
 */
public class VersionGroup implements PokeApiResource {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("order")
    private Integer order;
    
    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;
    
    @JsonProperty("move_learn_methods")
    private List<NamedAPIResource<MoveLearnMethod>> move_learn_methods;
    
    @JsonProperty("pokedexes")
    private List<NamedAPIResource<Pokedex>> pokedexes;
    
    @JsonProperty("regions")
    private List<NamedAPIResource<Region>> regions;
    
    @JsonProperty("versions")
    private List<NamedAPIResource<Version>> versions;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }

    public List<NamedAPIResource<MoveLearnMethod>> getMove_learn_methods() {
        return move_learn_methods;
    }

    public void setMove_learn_methods(List<NamedAPIResource<MoveLearnMethod>> move_learn_methods) {
        this.move_learn_methods = move_learn_methods;
    }

    public List<NamedAPIResource<Pokedex>> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<NamedAPIResource<Pokedex>> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public List<NamedAPIResource<Region>> getRegions() {
        return regions;
    }

    public void setRegions(List<NamedAPIResource<Region>> regions) {
        this.regions = regions;
    }

    public List<NamedAPIResource<Version>> getVersions() {
        return versions;
    }

    public void setVersions(List<NamedAPIResource<Version>> versions) {
        this.versions = versions;
    }
    
    
}
