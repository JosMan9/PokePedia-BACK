/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.evolutionchains;

import mx.com.pokedex.modelo.item.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.evolutiontriggers.EvolutionTrigger;
import mx.com.pokedex.modelo.locations.Location;
import mx.com.pokedex.modelo.moves.Move;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;
import mx.com.pokedex.modelo.types.Type;

/**
 *
 * @author Manuel
 */
public class EvolutionDetail {

    @JsonProperty("item")
    private NamedAPIResource<Item> item;

    @JsonProperty("trigger")
    private NamedAPIResource<EvolutionTrigger> trigger;

    @JsonProperty("gender")
    private Integer gender;

    @JsonProperty("held_item")
    private NamedAPIResource<Item> held_item;

    @JsonProperty("known_move")
    private NamedAPIResource<Move> known_move;

    @JsonProperty("known_move_type")
    private NamedAPIResource<Type> known_move_type;

    @JsonProperty("location")
    private NamedAPIResource<Location> location;

    @JsonProperty("min_level")
    private Integer min_level;

    @JsonProperty("min_hapiness")
    private Integer min_hapiness;

    @JsonProperty("min_beauty")
    private Integer min_beauty;

    @JsonProperty("min_affection")
    private Integer min_affection;

    @JsonProperty("needs_overworld_rain")
    private Boolean needs_overworld_rain;

    @JsonProperty("party_species")
    private NamedAPIResource<PokemonSpecies> party_species;

    @JsonProperty("party_type")
    private NamedAPIResource<Type> party_type;

    @JsonProperty("relative_physical_stats")
    private Integer relative_physical_stats;

    @JsonProperty("time_of_day")
    private String time_of_day;

    @JsonProperty("trade_species")
    private NamedAPIResource<PokemonSpecies> trade_species;

    @JsonProperty("turn_upside_down")
    private Boolean turn_upside_down;

    public NamedAPIResource<Item> getItem() {
        return item;
    }

    public void setItem(NamedAPIResource<Item> item) {
        this.item = item;
    }

    public NamedAPIResource<EvolutionTrigger> getTrigger() {
        return trigger;
    }

    public void setTrigger(NamedAPIResource<EvolutionTrigger> trigger) {
        this.trigger = trigger;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public NamedAPIResource<Item> getHeld_item() {
        return held_item;
    }

    public void setHeld_item(NamedAPIResource<Item> held_item) {
        this.held_item = held_item;
    }

    public NamedAPIResource<Move> getKnown_move() {
        return known_move;
    }

    public void setKnown_move(NamedAPIResource<Move> known_move) {
        this.known_move = known_move;
    }

    public NamedAPIResource<Type> getKnown_move_type() {
        return known_move_type;
    }

    public void setKnown_move_type(NamedAPIResource<Type> known_move_type) {
        this.known_move_type = known_move_type;
    }

    public NamedAPIResource<Location> getLocation() {
        return location;
    }

    public void setLocation(NamedAPIResource<Location> location) {
        this.location = location;
    }

    public Integer getMin_level() {
        return min_level;
    }

    public void setMin_level(Integer min_level) {
        this.min_level = min_level;
    }

    public Integer getMin_hapiness() {
        return min_hapiness;
    }

    public void setMin_hapiness(Integer min_hapiness) {
        this.min_hapiness = min_hapiness;
    }

    public Integer getMin_beauty() {
        return min_beauty;
    }

    public void setMin_beauty(Integer min_beauty) {
        this.min_beauty = min_beauty;
    }

    public Integer getMin_affection() {
        return min_affection;
    }

    public void setMin_affection(Integer min_affection) {
        this.min_affection = min_affection;
    }

    public Boolean getNeeds_overworld_rain() {
        return needs_overworld_rain;
    }

    public void setNeeds_overworld_rain(Boolean needs_overworld_rain) {
        this.needs_overworld_rain = needs_overworld_rain;
    }

    public NamedAPIResource<PokemonSpecies> getParty_species() {
        return party_species;
    }

    public void setParty_species(NamedAPIResource<PokemonSpecies> party_species) {
        this.party_species = party_species;
    }

    public NamedAPIResource<Type> getParty_type() {
        return party_type;
    }

    public void setParty_type(NamedAPIResource<Type> party_type) {
        this.party_type = party_type;
    }

    public Integer getRelative_physical_stats() {
        return relative_physical_stats;
    }

    public void setRelative_physical_stats(Integer relative_physical_stats) {
        this.relative_physical_stats = relative_physical_stats;
    }

    public String getTime_of_day() {
        return time_of_day;
    }

    public void setTime_of_day(String time_of_day) {
        this.time_of_day = time_of_day;
    }

    public NamedAPIResource<PokemonSpecies> getTrade_species() {
        return trade_species;
    }

    public void setTrade_species(NamedAPIResource<PokemonSpecies> trade_species) {
        this.trade_species = trade_species;
    }

    public Boolean getTurn_upside_down() {
        return turn_upside_down;
    }

    public void setTurn_upside_down(Boolean turn_upside_down) {
        this.turn_upside_down = turn_upside_down;
    }

}
