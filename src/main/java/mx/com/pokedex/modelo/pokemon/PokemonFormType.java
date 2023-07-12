/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.types.Type;

/**
 *
 * @author Manuel
 */
public class PokemonFormType {

    @JsonProperty("slot")
    private Integer slot;

    @JsonProperty("type")
    private NamedAPIResource<Type> type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedAPIResource<Type> getType() {
        return type;
    }

    public void setType(NamedAPIResource<Type> type) {
        this.type = type;
    }

}
