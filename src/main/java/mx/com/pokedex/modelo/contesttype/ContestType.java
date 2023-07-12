/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.contesttype;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.berryflavors.BerryFlavor;

/**
 *
 * @author Manuel
 */
public class ContestType implements PokeApiResource {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("berry_flavor")
    private NamedAPIResource<BerryFlavor> berry_flavor;

    @JsonProperty("names")
    private List<ContestName> names;

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

    public NamedAPIResource<BerryFlavor> getBerry_flavor() {
        return berry_flavor;
    }

    public void setBerry_flavor(NamedAPIResource<BerryFlavor> berry_flavor) {
        this.berry_flavor = berry_flavor;
    }

    public List<ContestName> getNames() {
        return names;
    }

    public void setNames(List<ContestName> names) {
        this.names = names;
    }
    
    

}
