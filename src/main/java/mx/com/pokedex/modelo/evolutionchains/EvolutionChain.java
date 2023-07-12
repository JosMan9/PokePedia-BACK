/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.evolutionchains;

import mx.com.pokedex.modelo.item.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class EvolutionChain {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("baby_trigger_item")
    private NamedAPIResource<Item> baby_trigger_item;

    @JsonProperty("chain")
    private ChainLink chain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamedAPIResource<Item> getBaby_trigger_item() {
        return baby_trigger_item;
    }

    public void setBaby_trigger_item(NamedAPIResource<Item> baby_trigger_item) {
        this.baby_trigger_item = baby_trigger_item;
    }

    public ChainLink getChain() {
        return chain;
    }

    public void setChain(ChainLink chain) {
        this.chain = chain;
    }

}
