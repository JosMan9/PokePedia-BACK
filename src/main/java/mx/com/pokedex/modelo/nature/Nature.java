/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.stats.Stat;
import mx.com.pokedex.modelo.berryflavors.BerryFlavor;

/**
 *
 * @author Manuel
 */
public class Nature implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("decreased_stat")
    private NamedAPIResource<Stat> decreased_stat;

    @JsonProperty("increased_stat")
    private NamedAPIResource<Stat> increased_stat;

    @JsonProperty("hates_flavor")
    private NamedAPIResource<BerryFlavor> hates_flavor;

    @JsonProperty("likes_flavor")
    private NamedAPIResource<BerryFlavor> likes_flavor;

    @JsonProperty("pokeathlon_stat_changes")
    private List<NatureStatChange> pokeathlon_stat_changes;

    @JsonProperty("move_battle_style_preferences")
    private List<MoveBattleStylePreference> move_battle_style_preferences;

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

    public NamedAPIResource<Stat> getDecreased_stat() {
        return decreased_stat;
    }

    public void setDecreased_stat(NamedAPIResource<Stat> decreased_stat) {
        this.decreased_stat = decreased_stat;
    }

    public NamedAPIResource<Stat> getIncreased_stat() {
        return increased_stat;
    }

    public void setIncreased_stat(NamedAPIResource<Stat> increased_stat) {
        this.increased_stat = increased_stat;
    }

    public NamedAPIResource<BerryFlavor> getHates_flavor() {
        return hates_flavor;
    }

    public void setHates_flavor(NamedAPIResource<BerryFlavor> hates_flavor) {
        this.hates_flavor = hates_flavor;
    }

    public NamedAPIResource<BerryFlavor> getLikes_flavor() {
        return likes_flavor;
    }

    public void setLikes_flavor(NamedAPIResource<BerryFlavor> likes_flavor) {
        this.likes_flavor = likes_flavor;
    }

    public List<NatureStatChange> getPokeathlon_stat_changes() {
        return pokeathlon_stat_changes;
    }

    public void setPokeathlon_stat_changes(List<NatureStatChange> pokeathlon_stat_changes) {
        this.pokeathlon_stat_changes = pokeathlon_stat_changes;
    }

    public List<MoveBattleStylePreference> getMove_battle_style_preferences() {
        return move_battle_style_preferences;
    }

    public void setMove_battle_style_preferences(List<MoveBattleStylePreference> move_battle_style_preferences) {
        this.move_battle_style_preferences = move_battle_style_preferences;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

}
