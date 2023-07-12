/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class VerboseEffect {

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("short_effect")
    private String short_effect;

    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getShort_effect() {
        return short_effect;
    }

    public void setShort_effect(String short_effect) {
        this.short_effect = short_effect;
    }

    public NamedAPIResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource<Language> language) {
        this.language = language;
    }

}
