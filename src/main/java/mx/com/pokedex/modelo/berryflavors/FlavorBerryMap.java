/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.berryflavors;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.berries.Berry;

/**
 *
 * @author Manuel
 */
public class FlavorBerryMap {
    
    @JsonProperty("potency")
    private Integer potency;
    
    @JsonProperty("berry")
    private NamedAPIResource<Berry> berry;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedAPIResource<Berry> getBerry() {
        return berry;
    }

    public void setBerry(NamedAPIResource<Berry> berry) {
        this.berry = berry;
    }
    
    
}
