/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.item.Item;

/**
 *
 * @author Manuel
 */
public class PokemonHeldItem {
    
    @JsonProperty("item")
    private NamedAPIResource<Item> item;
    
    @JsonProperty("version_details")
    private List<PokemonHeldItemVersion> version_details;

    public NamedAPIResource<Item> getItem() {
        return item;
    }

    public void setItem(NamedAPIResource<Item> item) {
        this.item = item;
    }

    public List<PokemonHeldItemVersion> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<PokemonHeldItemVersion> version_details) {
        this.version_details = version_details;
    }
    
    
}
