/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.version.Version;

/**
 *
 * @author Manuel
 */
public class PokemonHeldItemVersion {

    @JsonProperty("version")
    private NamedAPIResource<Version> version;

    @JsonProperty("rarity")
    private Integer rarity;

    public NamedAPIResource<Version> getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource<Version> version) {
        this.version = version;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

}
