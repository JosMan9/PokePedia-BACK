/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.abilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.VerboseEffect;
import mx.com.pokedex.modelo.generation.Generation;

/**
 *
 * @author Manuel
 */
public class Ability implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("is_main_series")
    private Boolean is_main_series;

    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effect_entries;

    @JsonProperty("effect_changes")
    private List<AbilityEffectChange> effect_changes;

    @JsonProperty("flavor_text_entries")
    private List<AbilityFlavorText> flavor_text_entries;

    @JsonProperty("pokemon")
    private List<AbilityPokemon> pokemon;

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

    public Boolean getIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(Boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public List<AbilityFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<AbilityFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<AbilityPokemon> pokemon) {
        this.pokemon = pokemon;
    }

}
