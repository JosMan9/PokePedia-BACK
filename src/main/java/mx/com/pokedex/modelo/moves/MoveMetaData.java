/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import mx.com.pokedex.modelo.movecategories.MoveCategory;
import mx.com.pokedex.modelo.movealiments.MoveAliment;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class MoveMetaData {

    @JsonProperty("aliment")
    private NamedAPIResource<MoveAliment> aliment;

    @JsonProperty("category")
    private NamedAPIResource<MoveCategory> category;

    @JsonProperty("min_hits")
    private Integer min_hits;

    @JsonProperty("max_hits")
    private Integer max_hits;

    @JsonProperty("min_turns")
    private Integer min_turns;

    @JsonProperty("max_turns")
    private Integer max_turns;

    @JsonProperty("drain")
    private Integer drain;

    @JsonProperty("healing")
    private Integer healing;

    @JsonProperty("crit_rate")
    private Integer crit_rate;

    @JsonProperty("aliment_chance")
    private Integer aliment_chance;

    @JsonProperty("flinch_chance")
    private Integer flinch_chance;

    @JsonProperty("stat_chance")
    private Integer stat_chance;

    public NamedAPIResource<MoveAliment> getAliment() {
        return aliment;
    }

    public void setAliment(NamedAPIResource<MoveAliment> aliment) {
        this.aliment = aliment;
    }

    public NamedAPIResource<MoveCategory> getCategory() {
        return category;
    }

    public void setCategory(NamedAPIResource<MoveCategory> category) {
        this.category = category;
    }

    public Integer getMin_hits() {
        return min_hits;
    }

    public void setMin_hits(Integer min_hits) {
        this.min_hits = min_hits;
    }

    public Integer getMax_hits() {
        return max_hits;
    }

    public void setMax_hits(Integer max_hits) {
        this.max_hits = max_hits;
    }

    public Integer getMin_turns() {
        return min_turns;
    }

    public void setMin_turns(Integer min_turns) {
        this.min_turns = min_turns;
    }

    public Integer getMax_turns() {
        return max_turns;
    }

    public void setMax_turns(Integer max_turns) {
        this.max_turns = max_turns;
    }

    public Integer getDrain() {
        return drain;
    }

    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public Integer getCrit_rate() {
        return crit_rate;
    }

    public void setCrit_rate(Integer crit_rate) {
        this.crit_rate = crit_rate;
    }

    public Integer getAliment_chance() {
        return aliment_chance;
    }

    public void setAliment_chance(Integer aliment_chance) {
        this.aliment_chance = aliment_chance;
    }

    public Integer getFlinch_chance() {
        return flinch_chance;
    }

    public void setFlinch_chance(Integer flinch_chance) {
        this.flinch_chance = flinch_chance;
    }

    public Integer getStat_chance() {
        return stat_chance;
    }

    public void setStat_chance(Integer stat_chance) {
        this.stat_chance = stat_chance;
    }

}
