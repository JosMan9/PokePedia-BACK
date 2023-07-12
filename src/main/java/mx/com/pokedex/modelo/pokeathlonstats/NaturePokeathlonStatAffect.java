/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokeathlonstats;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.nature.Nature;

/**
 *
 * @author Manuel
 */
public class NaturePokeathlonStatAffect {
    
    @JsonProperty("max_change")
    private Integer max_change;
    
    @JsonProperty("nature")
    private NamedAPIResource<Nature> nature;

    public Integer getMax_change() {
        return max_change;
    }

    public void setMax_change(Integer max_change) {
        this.max_change = max_change;
    }

    public NamedAPIResource<Nature> getNature() {
        return nature;
    }

    public void setNature(NamedAPIResource<Nature> nature) {
        this.nature = nature;
    }
    
    
}
