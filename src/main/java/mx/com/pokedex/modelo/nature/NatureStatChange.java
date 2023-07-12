/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokeathlonstats.PokeathlonStat;

/**
 *
 * @author Manuel
 */
public class NatureStatChange {
    
    @JsonProperty("max_change")
    private Integer max_change;
    
    @JsonProperty("pokeathlon_stat")
    private NamedAPIResource<PokeathlonStat> pokeathlon_stat;

    public Integer getMax_change() {
        return max_change;
    }

    public void setMax_change(Integer max_change) {
        this.max_change = max_change;
    }

    public NamedAPIResource<PokeathlonStat> getPokeathlon_stat() {
        return pokeathlon_stat;
    }

    public void setPokeathlon_stat(NamedAPIResource<PokeathlonStat> pokeathlon_stat) {
        this.pokeathlon_stat = pokeathlon_stat;
    }
    
    
}
