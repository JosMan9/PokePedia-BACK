/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.evolutionchains;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;

/**
 *
 * @author Manuel
 */
public class ChainLink {

    @JsonProperty("is_baby")
    private Boolean is_baby;

    @JsonProperty("species")
    private NamedAPIResource<PokemonSpecies> species;

    @JsonProperty("evolution_details")
    private List<EvolutionDetail> evolution_details;

    @JsonProperty("evolves_to")
    private List<ChainLink> evoles_to;

    public Boolean getIs_baby() {
        return is_baby;
    }

    public void setIs_baby(Boolean is_baby) {
        this.is_baby = is_baby;
    }

    public NamedAPIResource<PokemonSpecies> getSpecies() {
        return species;
    }

    public void setSpecies(NamedAPIResource<PokemonSpecies> species) {
        this.species = species;
    }

    public List<EvolutionDetail> getEvolution_details() {
        return evolution_details;
    }

    public void setEvolution_details(List<EvolutionDetail> evolution_details) {
        this.evolution_details = evolution_details;
    }

    public List<ChainLink> getEvoles_to() {
        return evoles_to;
    }

    public void setEvoles_to(List<ChainLink> evoles_to) {
        this.evoles_to = evoles_to;
    }

}
