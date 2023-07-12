/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonhabitats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class PokemonHabitat implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("pokemon_species")
    private NamedAPIResource<PokemonSpecies> pokemon_species;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NamedAPIResource<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(NamedAPIResource<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

}
