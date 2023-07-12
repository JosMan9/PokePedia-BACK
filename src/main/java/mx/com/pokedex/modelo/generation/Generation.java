/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.abilities.Ability;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.moves.Move;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.pokemonspecies.PokemonSpecies;
import mx.com.pokedex.modelo.regions.Region;
import mx.com.pokedex.modelo.types.Type;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class Generation implements PokeApiResource, Localizable {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("abilities")
    private List<NamedAPIResource<Ability>> abilities;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("main_region")
    private NamedAPIResource<Region> main_region;
    
    @JsonProperty("moves")
    private List<NamedAPIResource<Move>> moves;
    
    @JsonProperty("pokemon_species")
    private List<NamedAPIResource<PokemonSpecies>> pokemon_species;
    
    @JsonProperty("types")
    private List<NamedAPIResource<Type>> types;
    
    @JsonProperty("version_groups")
    private List<NamedAPIResource<VersionGroup>> version_groups;

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

    public List<NamedAPIResource<Ability>> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<NamedAPIResource<Ability>> abilities) {
        this.abilities = abilities;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NamedAPIResource<Region> getMain_region() {
        return main_region;
    }

    public void setMain_region(NamedAPIResource<Region> main_region) {
        this.main_region = main_region;
    }

    public List<NamedAPIResource<Move>> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedAPIResource<Move>> moves) {
        this.moves = moves;
    }

    public List<NamedAPIResource<PokemonSpecies>> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(List<NamedAPIResource<PokemonSpecies>> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

    public List<NamedAPIResource<Type>> getTypes() {
        return types;
    }

    public void setTypes(List<NamedAPIResource<Type>> types) {
        this.types = types;
    }

    public List<NamedAPIResource<VersionGroup>> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(List<NamedAPIResource<VersionGroup>> version_groups) {
        this.version_groups = version_groups;
    }
    
    
}
