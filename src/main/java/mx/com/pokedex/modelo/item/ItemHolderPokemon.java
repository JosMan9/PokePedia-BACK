/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemon.Pokemon;

/**
 *
 * @author Manuel
 */
public class ItemHolderPokemon {

    @JsonProperty("pokemon")
    private NamedAPIResource<Pokemon> pokemon;

    @JsonProperty("version_detals")
    private List<ItemHolderPokemonVersionDetail> version_details;

    public NamedAPIResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedAPIResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<ItemHolderPokemonVersionDetail> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<ItemHolderPokemonVersionDetail> version_details) {
        this.version_details = version_details;
    }

}
