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
public class Description {
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NamedAPIResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource<Language> language) {
        this.language = language;
    }
    
    
}
