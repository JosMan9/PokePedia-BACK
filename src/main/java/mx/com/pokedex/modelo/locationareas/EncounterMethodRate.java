/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.locationareas;

import mx.com.pokedex.modelo.encountersmethods.EncounterMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class EncounterMethodRate {
    @JsonProperty("encounter_method")
    private NamedAPIResource<EncounterMethod> encounter_method;
    
    @JsonProperty("version_details")
    private List<EncounterVersionDetails> version_details;

    public NamedAPIResource<EncounterMethod> getEncounter_method() {
        return encounter_method;
    }

    public void setEncounter_method(NamedAPIResource<EncounterMethod> encounter_method) {
        this.encounter_method = encounter_method;
    }

    public List<EncounterVersionDetails> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<EncounterVersionDetails> version_details) {
        this.version_details = version_details;
    }
    
    
}
