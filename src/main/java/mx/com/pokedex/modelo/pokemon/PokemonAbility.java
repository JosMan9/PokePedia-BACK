/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import mx.com.pokedex.modelo.abilities.Ability;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class PokemonAbility {

    @JsonProperty("is_hidden")
    private Boolean is_hidden;

    @JsonProperty("slot")
    private Integer slot;

    @JsonProperty("ability")
    private NamedAPIResource<Ability> ability;

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedAPIResource<Ability> getAbility() {
        return ability;
    }

    public void setAbility(NamedAPIResource<Ability> ability) {
        this.ability = ability;
    }

}
