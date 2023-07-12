/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.stats.Stat;

/**
 *
 * @author Manuel
 */
public class PokemonStat {

    @JsonProperty("stat")
    private NamedAPIResource<Stat> stat;

    @JsonProperty("effort")
    private Integer effort;

    @JsonProperty("base_stat")
    private Integer base_stat;

    public NamedAPIResource<Stat> getStat() {
        return stat;
    }

    public void setStat(NamedAPIResource<Stat> stat) {
        this.stat = stat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public Integer getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(Integer base_stat) {
        this.base_stat = base_stat;
    }

}
