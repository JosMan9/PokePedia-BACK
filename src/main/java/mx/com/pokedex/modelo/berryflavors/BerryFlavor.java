/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.berryflavors;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.contesttype.ContestType;

/**
 *
 * @author Manuel
 */
public class BerryFlavor implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("berries")
    private List<FlavorBerryMap> berries;

    @JsonProperty("contest_type")
    private NamedAPIResource<ContestType> contest_type;

    @JsonProperty("names")
    private List<Name> names;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FlavorBerryMap> getBerries() {
        return berries;
    }

    public void setBerries(List<FlavorBerryMap> berries) {
        this.berries = berries;
    }

    public NamedAPIResource<ContestType> getContest_type() {
        return contest_type;
    }

    public void setContest_type(NamedAPIResource<ContestType> contest_type) {
        this.contest_type = contest_type;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

}
