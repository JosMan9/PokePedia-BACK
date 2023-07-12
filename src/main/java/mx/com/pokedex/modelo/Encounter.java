/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import mx.com.pokedex.modelo.encountersconditionvalue.EncounterConditionValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Encounter {
    @JsonProperty("min_level")
    private Integer min_level;
    
    @JsonProperty("max_level")
    private Integer max_level;
    
    @JsonProperty("condition_values")
    private List<NamedAPIResource<EncounterConditionValue>> condition_values;

    public Integer getMin_level() {
        return min_level;
    }

    public void setMin_level(Integer min_level) {
        this.min_level = min_level;
    }

    public Integer getMax_level() {
        return max_level;
    }

    public void setMax_level(Integer max_level) {
        this.max_level = max_level;
    }

    public List<NamedAPIResource<EncounterConditionValue>> getCondition_values() {
        return condition_values;
    }

    public void setCondition_values(List<NamedAPIResource<EncounterConditionValue>> condition_values) {
        this.condition_values = condition_values;
    }
    
    
}
