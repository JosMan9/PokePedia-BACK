/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.berries;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.berryflavors.BerryFlavor;

/**
 *
 * @author Manuel
 */
public class BerryFlavorMap {
    
    @JsonProperty("potency")
    private Integer potency;
    
    @JsonProperty("flavor")
    private NamedAPIResource<BerryFlavor> falvor;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedAPIResource<BerryFlavor> getFalvor() {
        return falvor;
    }

    public void setFalvor(NamedAPIResource<BerryFlavor> falvor) {
        this.falvor = falvor;
    }
    
    
}
