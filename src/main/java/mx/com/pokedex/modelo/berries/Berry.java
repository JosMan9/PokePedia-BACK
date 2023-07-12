/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.berries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.berryFirmnesses.BerryFirmness;
import mx.com.pokedex.modelo.item.Item;
import mx.com.pokedex.modelo.types.Type;

/**
 *
 * @author Manuel
 */
public class Berry implements PokeApiResource {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("growth_time")
    private Integer growth_time;
    
    @JsonProperty("max_harvest")
    private Integer max_harvest;
    
    @JsonProperty("natural_gift_power")
    private Integer natural_gift_power;
    
    @JsonProperty("size")
    private Integer size;
    
    @JsonProperty("smoothness")
    private Integer smoothness;
    
    @JsonProperty("soil_dryness")
    private Integer soil_dryness;
    
    @JsonProperty("firmness")
    private NamedAPIResource<BerryFirmness> firmness;
    
    @JsonProperty("flavors")
    private List<BerryFlavorMap> flavors;
    
    @JsonProperty("item")
    private NamedAPIResource<Item> item;
    
    @JsonProperty("natural_gift_type")
    private NamedAPIResource<Type> natural_gift_type;

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

    public Integer getGrowth_time() {
        return growth_time;
    }

    public void setGrowth_time(Integer growth_time) {
        this.growth_time = growth_time;
    }

    public Integer getMax_harvest() {
        return max_harvest;
    }

    public void setMax_harvest(Integer max_harvest) {
        this.max_harvest = max_harvest;
    }

    public Integer getNatural_gift_power() {
        return natural_gift_power;
    }

    public void setNatural_gift_power(Integer natural_gift_power) {
        this.natural_gift_power = natural_gift_power;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    public Integer getSoil_dryness() {
        return soil_dryness;
    }

    public void setSoil_dryness(Integer soil_dryness) {
        this.soil_dryness = soil_dryness;
    }

    public NamedAPIResource<BerryFirmness> getFirmness() {
        return firmness;
    }

    public void setFirmness(NamedAPIResource<BerryFirmness> firmness) {
        this.firmness = firmness;
    }

    public List<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<BerryFlavorMap> flavors) {
        this.flavors = flavors;
    }

    public NamedAPIResource<Item> getItem() {
        return item;
    }

    public void setItem(NamedAPIResource<Item> item) {
        this.item = item;
    }

    public NamedAPIResource<Type> getNatural_gift_type() {
        return natural_gift_type;
    }

    public void setNatural_gift_type(NamedAPIResource<Type> natural_gift_type) {
        this.natural_gift_type = natural_gift_type;
    }
    
    
}
