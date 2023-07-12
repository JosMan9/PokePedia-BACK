/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import mx.com.pokedex.modelo.movetargets.MoveTarget;
import mx.com.pokedex.modelo.abilities.AbilityEffectChange;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.ApiResource;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.MachineVersionDetail;
import mx.com.pokedex.modelo.movedamageclass.MoveDamageClass;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemon.Pokemon;
import mx.com.pokedex.modelo.types.Type;
import mx.com.pokedex.modelo.VerboseEffect;
import mx.com.pokedex.modelo.contesteffects.ContestEffect;
import mx.com.pokedex.modelo.contesttype.ContestType;
import mx.com.pokedex.modelo.generation.Generation;
import mx.com.pokedex.modelo.supercontesteffects.SuperContestEffect;

/**
 *
 * @author Manuel
 */
public class Move implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("accuracy")
    private Integer accuracy;

    @JsonProperty("effect_chance")
    private Integer effect_chance;

    @JsonProperty("pp")
    private Integer pp;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("power")
    private Integer power;

    @JsonProperty("contest_combos")
    private ContestCombosSets contest_combos;

    @JsonProperty("contest_type")
    private NamedAPIResource<ContestType> contest_type;

    @JsonProperty("contest_effect")
    private ApiResource<ContestEffect> contest_effect;

    @JsonProperty("damage_class")
    private NamedAPIResource<MoveDamageClass> damage_class;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effect_entries;

    @JsonProperty("effect_changes")
    private List<AbilityEffectChange> effect_changes;

    @JsonProperty("learned_by_pokemon")
    private List<NamedAPIResource<Pokemon>> learned_by_pokemon;

    @JsonProperty("flavor_text_entries")
    private List<MoveFlavorText> flavor_text_entries;

    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;

    @JsonProperty("machines")
    private List<MachineVersionDetail> machines;

    @JsonProperty("meta")
    private MoveMetaData meta;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("past_values")
    private List<PastMoveStatValues> past_values;

    @JsonProperty("stat_changes")
    private List<MoveStatChange> stat_changes;

    @JsonProperty("super_contest_effect")
    private ApiResource<SuperContestEffect> super_contest_effect;

    @JsonProperty("target")
    private NamedAPIResource<MoveTarget> target;

    @JsonProperty("type")
    private NamedAPIResource<Type> type;

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

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getEffect_chance() {
        return effect_chance;
    }

    public void setEffect_chance(Integer effect_chance) {
        this.effect_chance = effect_chance;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public ContestCombosSets getContest_combos() {
        return contest_combos;
    }

    public void setContest_combos(ContestCombosSets contest_combos) {
        this.contest_combos = contest_combos;
    }

    public NamedAPIResource<ContestType> getContest_type() {
        return contest_type;
    }

    public void setContest_type(NamedAPIResource<ContestType> contest_type) {
        this.contest_type = contest_type;
    }

    public ApiResource<ContestEffect> getContest_effect() {
        return contest_effect;
    }

    public void setContest_effect(ApiResource<ContestEffect> contest_effect) {
        this.contest_effect = contest_effect;
    }

    public NamedAPIResource<MoveDamageClass> getDamage_class() {
        return damage_class;
    }

    public void setDamage_class(NamedAPIResource<MoveDamageClass> damage_class) {
        this.damage_class = damage_class;
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

    public List<NamedAPIResource<Pokemon>> getLearned_by_pokemon() {
        return learned_by_pokemon;
    }

    public void setLearned_by_pokemon(List<NamedAPIResource<Pokemon>> learned_by_pokemon) {
        this.learned_by_pokemon = learned_by_pokemon;
    }

    public List<MoveFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<MoveFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }

    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }

    public MoveMetaData getMeta() {
        return meta;
    }

    public void setMeta(MoveMetaData meta) {
        this.meta = meta;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PastMoveStatValues> getPast_values() {
        return past_values;
    }

    public void setPast_values(List<PastMoveStatValues> past_values) {
        this.past_values = past_values;
    }

    public List<MoveStatChange> getStat_changes() {
        return stat_changes;
    }

    public void setStat_changes(List<MoveStatChange> stat_changes) {
        this.stat_changes = stat_changes;
    }

    public ApiResource<SuperContestEffect> getSuper_contest_effect() {
        return super_contest_effect;
    }

    public void setSuper_contest_effect(ApiResource<SuperContestEffect> super_contest_effect) {
        this.super_contest_effect = super_contest_effect;
    }

    public NamedAPIResource<MoveTarget> getTarget() {
        return target;
    }

    public void setTarget(NamedAPIResource<MoveTarget> target) {
        this.target = target;
    }

    public NamedAPIResource<Type> getType() {
        return type;
    }

    public void setType(NamedAPIResource<Type> type) {
        this.type = type;
    }

}
