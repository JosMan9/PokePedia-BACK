/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.abilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Effect;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class AbilityEffectChange {
    
    @JsonProperty("effect_entries")
    private List<Effect> effect_entries;
    
    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    public List<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }
    
    
}
