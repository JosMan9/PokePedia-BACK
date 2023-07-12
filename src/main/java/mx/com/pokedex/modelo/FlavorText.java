/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import mx.com.pokedex.modelo.version.Version;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class FlavorText {

    @JsonProperty("flavor_text")
    private String flavor_text;

    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    @JsonProperty("version")
    private NamedAPIResource<Version> version;

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

    public NamedAPIResource<Version> getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource<Version> version) {
        this.version = version;
    }

}
