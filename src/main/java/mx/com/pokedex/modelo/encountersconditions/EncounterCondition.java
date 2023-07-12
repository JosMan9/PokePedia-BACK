/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.encountersconditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.encountersconditionvalue.EncounterConditionValue;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class EncounterCondition implements PokeApiResource, Localizable {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("values")
    private List<NamedAPIResource<EncounterConditionValue>> values;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedAPIResource<EncounterConditionValue>> getValues() {
        return values;
    }

    public void setValues(List<NamedAPIResource<EncounterConditionValue>> values) {
        this.values = values;
    }
    
    
}
