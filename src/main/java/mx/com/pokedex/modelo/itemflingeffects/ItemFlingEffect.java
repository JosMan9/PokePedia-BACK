/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.itemflingeffects;

import mx.com.pokedex.modelo.item.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Effect;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class ItemFlingEffect implements PokeApiResource {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("effect_entries")
    private List<Effect> effect_entries;

    @JsonProperty("items")
    private List<NamedAPIResource<Item>> items;

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

    public List<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<NamedAPIResource<Item>> getItems() {
        return items;
    }

    public void setItems(List<NamedAPIResource<Item>> items) {
        this.items = items;
    }

}
