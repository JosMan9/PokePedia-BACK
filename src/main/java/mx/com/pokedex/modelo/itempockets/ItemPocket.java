/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.itempockets;

import mx.com.pokedex.modelo.itemcategories.ItemCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class ItemPocket implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("categories")
    private NamedAPIResource<ItemCategory> categories;

    @JsonProperty("names")
    private List<Name> names;

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

    public NamedAPIResource<ItemCategory> getCategories() {
        return categories;
    }

    public void setCategories(NamedAPIResource<ItemCategory> categories) {
        this.categories = categories;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

}
