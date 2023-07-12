/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.palparkareas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Name;


/**
 *
 * @author Manuel
 */
public class PalParkArea {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("names")
    private List<Name> pokemon_species;

   @JsonProperty("pokemon_encounters")
   private List<PalParkEncounterSpecies> pokemon_encounters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(List<Name> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

    public List<PalParkEncounterSpecies> getPokemon_encounters() {
        return pokemon_encounters;
    }

    public void setPokemon_encounters(List<PalParkEncounterSpecies> pokemon_encounters) {
        this.pokemon_encounters = pokemon_encounters;
    }
   
   

}
