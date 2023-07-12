/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonshapes;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.Language;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class AwesomeName {

    @JsonProperty("awesome_name")
    private String awesome_name;

    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    public String getAwesome_name() {
        return awesome_name;
    }

    public void setAwesome_name(String awesome_name) {
        this.awesome_name = awesome_name;
    }

    public NamedAPIResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource<Language> language) {
        this.language = language;
    }

}
