/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import mx.com.pokedex.modelo.version.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class VersionEncounterDetail {

    @JsonProperty("version")
    private NamedAPIResource<Version> version;

    @JsonProperty("max_chance")
    private Integer max_chance;

    @JsonProperty("encounter_details")
    private List<Encounter> encounter_details;

    public NamedAPIResource<Version> getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource<Version> version) {
        this.version = version;
    }

    public Integer getMax_chance() {
        return max_chance;
    }

    public void setMax_chance(Integer max_chance) {
        this.max_chance = max_chance;
    }

    public List<Encounter> getEncounter_details() {
        return encounter_details;
    }

    public void setEncounter_details(List<Encounter> encounter_details) {
        this.encounter_details = encounter_details;
    }

}
