/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.contesttype;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.Language;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class ContestName {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("color")
    private String color;
    
    @JsonProperty("language")
    private NamedAPIResource<Language> language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NamedAPIResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedAPIResource<Language> language) {
        this.language = language;
    }
    
    
}
