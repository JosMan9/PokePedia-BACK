/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokeathlonstats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class PokeathlonStat implements PokeApiResource, Localizable{
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("affecting_natures")
    private NaturePokeathlonStatAffectSets affecting_natures;

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

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NaturePokeathlonStatAffectSets getAffecting_natures() {
        return affecting_natures;
    }

    public void setAffecting_natures(NaturePokeathlonStatAffectSets affecting_natures) {
        this.affecting_natures = affecting_natures;
    }
    
    
}
