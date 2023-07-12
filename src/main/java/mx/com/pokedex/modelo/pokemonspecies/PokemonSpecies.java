/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonspecies;

import mx.com.pokedex.modelo.pokemonshapes.PokemonShape;
import mx.com.pokedex.modelo.pokemonhabitats.PokemonHabitat;
import mx.com.pokedex.modelo.pokemoncolors.PokemonColor;
import mx.com.pokedex.modelo.growthrates.GrowthRate;
import mx.com.pokedex.modelo.egggroups.EggGroup;
import mx.com.pokedex.modelo.generation.Generation;
import mx.com.pokedex.modelo.evolutionchains.EvolutionChain;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.ApiResource;
import mx.com.pokedex.modelo.Description;
import mx.com.pokedex.modelo.FlavorText;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class PokemonSpecies implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("order")
    private Integer order;

    @JsonProperty("gender_rate")
    private Integer gender_rate;

    @JsonProperty("capture_rate")
    private Integer capture_rate;

    @JsonProperty("base_hapiness")
    private Integer base_hapiness;

    @JsonProperty("is_baby")
    private Boolean is_baby;

    @JsonProperty("is_legendary")
    private Boolean is_legendary;

    @JsonProperty("is_mythical")
    private Boolean is_mythical;

    @JsonProperty("hatch_counter")
    private Integer hatch_counter;

    @JsonProperty("has_gender_differences")
    private Boolean has_gender_differences;

    @JsonProperty("forms_switchable")
    private Boolean forms_switchable;

    @JsonProperty("growth_rate")
    private NamedAPIResource<GrowthRate> growth_rate;

    @JsonProperty("pokedex_number")
    private List<PokemonSpeciesDexEntry> pokedex_number;

    @JsonProperty("egg_groups")
    private List<NamedAPIResource<EggGroup>> egg_groups;

    @JsonProperty("color")
    private NamedAPIResource<PokemonColor> color;

    @JsonProperty("shape")
    private NamedAPIResource<PokemonShape> shape;

    @JsonProperty("evolves_from_species")
    private NamedAPIResource<PokemonSpecies> evolves_from_species;

    @JsonProperty("evolution_chain")
    private ApiResource<EvolutionChain> evolution_chain;

    @JsonProperty("habitat")
    private NamedAPIResource<PokemonHabitat> habitat;

    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("pal_park_encounters")
    private List<PalParkEncounterArea> pal_park_encounters;

    @JsonProperty("flavor_text_entries")
    private List<FlavorText> flavor_text_entries;

    @JsonProperty("form_description")
    private List<Description> form_description;

    @JsonProperty("genera")
    private List<Genus> genera;

    @JsonProperty("varieties")
    private List<PokemonSpeciesVariety> varieties;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(Integer gender_rate) {
        this.gender_rate = gender_rate;
    }

    public Integer getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(Integer capture_rate) {
        this.capture_rate = capture_rate;
    }

    public Integer getBase_hapiness() {
        return base_hapiness;
    }

    public void setBase_hapiness(Integer base_hapiness) {
        this.base_hapiness = base_hapiness;
    }

    public Boolean getIs_baby() {
        return is_baby;
    }

    public void setIs_baby(Boolean is_baby) {
        this.is_baby = is_baby;
    }

    public Boolean getIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(Boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    public Boolean getIs_mythical() {
        return is_mythical;
    }

    public void setIs_mythical(Boolean is_mythical) {
        this.is_mythical = is_mythical;
    }

    public Integer getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(Integer hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public Boolean getHas_gender_differences() {
        return has_gender_differences;
    }

    public void setHas_gender_differences(Boolean has_gender_differences) {
        this.has_gender_differences = has_gender_differences;
    }

    public Boolean getForms_switchable() {
        return forms_switchable;
    }

    public void setForms_switchable(Boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }

    public NamedAPIResource<GrowthRate> getGrowth_rate() {
        return growth_rate;
    }

    public void setGrowth_rate(NamedAPIResource<GrowthRate> growth_rate) {
        this.growth_rate = growth_rate;
    }

    public List<PokemonSpeciesDexEntry> getPokedex_number() {
        return pokedex_number;
    }

    public void setPokedex_number(List<PokemonSpeciesDexEntry> pokedex_number) {
        this.pokedex_number = pokedex_number;
    }

    public List<NamedAPIResource<EggGroup>> getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(List<NamedAPIResource<EggGroup>> egg_groups) {
        this.egg_groups = egg_groups;
    }

    public NamedAPIResource<PokemonColor> getColor() {
        return color;
    }

    public void setColor(NamedAPIResource<PokemonColor> color) {
        this.color = color;
    }

    public NamedAPIResource<PokemonShape> getShape() {
        return shape;
    }

    public void setShape(NamedAPIResource<PokemonShape> shape) {
        this.shape = shape;
    }

    public NamedAPIResource<PokemonSpecies> getEvolves_from_species() {
        return evolves_from_species;
    }

    public void setEvolves_from_species(NamedAPIResource<PokemonSpecies> evolves_from_species) {
        this.evolves_from_species = evolves_from_species;
    }

    public ApiResource<EvolutionChain> getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(ApiResource<EvolutionChain> evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    public NamedAPIResource<PokemonHabitat> getHabitat() {
        return habitat;
    }

    public void setHabitat(NamedAPIResource<PokemonHabitat> habitat) {
        this.habitat = habitat;
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

    public List<PalParkEncounterArea> getPal_park_encounters() {
        return pal_park_encounters;
    }

    public void setPal_park_encounters(List<PalParkEncounterArea> pal_park_encounters) {
        this.pal_park_encounters = pal_park_encounters;
    }

    public List<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<Description> getForm_description() {
        return form_description;
    }

    public void setForm_description(List<Description> form_description) {
        this.form_description = form_description;
    }

    public List<Genus> getGenera() {
        return genera;
    }

    public void setGenera(List<Genus> genera) {
        this.genera = genera;
    }

    public List<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<PokemonSpeciesVariety> varieties) {
        this.varieties = varieties;
    }

}
