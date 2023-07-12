/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.version.Version;

/**
 *
 * @author Manuel
 */
public class VersionGameIndex {
    
    @JsonProperty("game_index")
    private Integer game_index;
    
    @JsonProperty("version")
    private NamedAPIResource<Version> version;

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public NamedAPIResource<Version> getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource<Version> version) {
        this.version = version;
    }
    
    
}
