/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.ApiResource;
import mx.com.pokedex.modelo.evolutionchains.EvolutionChain;
import mx.com.pokedex.modelo.GenerationGameIndex;
import mx.com.pokedex.modelo.itemattributes.ItemAttribute;
import mx.com.pokedex.modelo.itemcategories.ItemCategory;
import mx.com.pokedex.modelo.itemflingeffects.ItemFlingEffect;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.MachineVersionDetail;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.VerboseEffect;
import mx.com.pokedex.modelo.VersionGroupFlavorText;

/**
 *
 * @author Manuel
 */
public class Item implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cost")
    private Integer cost;

    @JsonProperty("fling_power")
    private Integer fling_power;

    @JsonProperty("fling_effect")
    private NamedAPIResource<ItemFlingEffect> fling_effect;

    @JsonProperty("attributes")
    private List<ItemAttribute> attributes;

    @JsonProperty("category")
    private NamedAPIResource<ItemCategory> category;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effect_entries;

    @JsonProperty("flavor_text_entries")
    private List<VersionGroupFlavorText> flavor_text_entries;

    @JsonProperty("game_indices")
    private List<GenerationGameIndex> game_indices;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("sprites")
    private ItemSprites sprites;

    @JsonProperty("held_by_pokemon")
    private List<ItemHolderPokemon> held_by_pokemon;

    @JsonProperty("baby_trigger_for")
    private ApiResource<EvolutionChain> baby_trigger_for;

    @JsonProperty("machines")
    private List<MachineVersionDetail> machines;

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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getFling_power() {
        return fling_power;
    }

    public void setFling_power(Integer fling_power) {
        this.fling_power = fling_power;
    }

    public NamedAPIResource<ItemFlingEffect> getFling_effect() {
        return fling_effect;
    }

    public void setFling_effect(NamedAPIResource<ItemFlingEffect> fling_effect) {
        this.fling_effect = fling_effect;
    }

    public List<ItemAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ItemAttribute> attributes) {
        this.attributes = attributes;
    }

    public NamedAPIResource<ItemCategory> getCategory() {
        return category;
    }

    public void setCategory(NamedAPIResource<ItemCategory> category) {
        this.category = category;
    }

    public List<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<VersionGroupFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<VersionGroupFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public ItemSprites getSprites() {
        return sprites;
    }

    public void setSprites(ItemSprites sprites) {
        this.sprites = sprites;
    }

    public List<ItemHolderPokemon> getHeld_by_pokemon() {
        return held_by_pokemon;
    }

    public void setHeld_by_pokemon(List<ItemHolderPokemon> held_by_pokemon) {
        this.held_by_pokemon = held_by_pokemon;
    }

    public ApiResource<EvolutionChain> getBaby_trigger_for() {
        return baby_trigger_for;
    }

    public void setBaby_trigger_for(ApiResource<EvolutionChain> baby_trigger_for) {
        this.baby_trigger_for = baby_trigger_for;
    }

    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }

}
