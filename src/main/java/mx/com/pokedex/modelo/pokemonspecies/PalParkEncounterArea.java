/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.palparkareas.PalParkArea;

/**
 *
 * @author Manuel
 */
public class PalParkEncounterArea {

    @JsonProperty("base_score")
    private Integer base_score;

    @JsonProperty("rate")
    private Integer rate;

    @JsonProperty("area")
    private NamedAPIResource<PalParkArea> area;

    public Integer getBase_score() {
        return base_score;
    }

    public void setBase_score(Integer base_score) {
        this.base_score = base_score;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedAPIResource<PalParkArea> getArea() {
        return area;
    }

    public void setArea(NamedAPIResource<PalParkArea> area) {
        this.area = area;
    }

}
