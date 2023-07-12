/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemonforms.PokemonForm;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;
import mx.com.pokedex.modelo.VersionGameIndex;

/**
 *
 * @author Manuel
 */
public class Pokemon implements PokeApiResource {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("base_experience")
    private Integer base_experience;
    
    @JsonProperty("height")
    private Integer height;
    
    @JsonProperty("is_default")
    private Boolean is_default;
    
    @JsonProperty("order")
    private Integer order;
    
    @JsonProperty("weight")
    private Integer weight;
    
    @JsonProperty("abilities")
    private List<PokemonAbility> abilities;
    
    @JsonProperty("forms")
    private List<NamedAPIResource<PokemonForm>> forms;
    
    @JsonProperty("game_indices")
    private List<VersionGameIndex> game_indices;
    
    @JsonProperty("held_items")
    private List<PokemonHeldItem> held_items;
    
    @JsonProperty("location_area_encounters")
    private String location_area_encounters;
    
    @JsonProperty("moves")
    private List<PokemonMove> moves;
    
    @JsonProperty("past_types")
    private List<PokemonTypePast> past_types;
    
    @JsonProperty("sprites")
    private PokemonSprites sprites;
    
    @JsonProperty("species")
    private NamedAPIResource<PokemonSpecies> species;
    
    @JsonProperty("stats")
    private List<PokemonStat> stats;
    
    @JsonProperty("types")
    private List<PokemonType> types;

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

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public List<NamedAPIResource<PokemonForm>> getForms() {
        return forms;
    }

    public void setForms(List<NamedAPIResource<PokemonForm>> forms) {
        this.forms = forms;
    }

    public List<VersionGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<VersionGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public List<PokemonHeldItem> getHeld_items() {
        return held_items;
    }

    public void setHeld_items(List<PokemonHeldItem> held_items) {
        this.held_items = held_items;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public List<PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    public List<PokemonTypePast> getPast_types() {
        return past_types;
    }

    public void setPast_types(List<PokemonTypePast> past_types) {
        this.past_types = past_types;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public NamedAPIResource<PokemonSpecies> getSpecies() {
        return species;
    }

    public void setSpecies(NamedAPIResource<PokemonSpecies> species) {
        this.species = species;
    }

    public List<PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<PokemonStat> stats) {
        this.stats = stats;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }
    
    
    
    
}
