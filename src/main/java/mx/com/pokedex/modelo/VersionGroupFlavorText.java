/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import mx.com.pokedex.modelo.versiongroups.VersionGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class VersionGroupFlavorText {

    @JsonProperty("text")
    private String text;

    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
