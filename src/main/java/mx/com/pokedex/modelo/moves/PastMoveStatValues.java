/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.types.Type;
import mx.com.pokedex.modelo.VerboseEffect;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class PastMoveStatValues {

    @JsonProperty("accuracy")
    private Integer accuracy;

    @JsonProperty("effect_chance")
    private Integer effect_chance;

    @JsonProperty("power")
    private Integer power;

    @JsonProperty("pp")
    private Integer pp;

    @JsonProperty("effect_entries")
    private List<VerboseEffect> effect_entries;

    @JsonProperty("type")
    private NamedAPIResource<Type> type;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

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

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public List<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public NamedAPIResource<Type> getType() {
        return type;
    }

    public void setType(NamedAPIResource<Type> type) {
        this.type = type;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

}
