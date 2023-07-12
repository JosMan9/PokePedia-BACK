/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.stats.Stat;

/**
 *
 * @author Manuel
 */
public class MoveStatChange {

    @JsonProperty("change")
    private Integer change;

    @JsonProperty("stat")
    private NamedAPIResource<Stat> stat;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedAPIResource<Stat> getStat() {
        return stat;
    }

    public void setStat(NamedAPIResource<Stat> stat) {
        this.stat = stat;
    }

}
