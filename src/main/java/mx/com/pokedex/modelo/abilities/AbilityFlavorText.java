/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.abilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.Language;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class AbilityFlavorText {

    @JsonProperty("flavor_text")
    private String flavor_text;

    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public NamedAPIResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource<Language> language) {
        this.language = language;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

}
