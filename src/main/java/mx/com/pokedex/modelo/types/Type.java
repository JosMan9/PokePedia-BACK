/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.types;

import mx.com.pokedex.modelo.movedamageclass.MoveDamageClass;
import mx.com.pokedex.modelo.moves.Move;
import mx.com.pokedex.modelo.generation.Generation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.GenerationGameIndex;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class Type implements PokeApiResource, Localizable {
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("damage_relations")
    private TypeRelations damage_relations;
    
    @JsonProperty("past_damage_relations")
    private List<TypeRelationPast> past_damage_relations;
    
    @JsonProperty("game_indices")
    private List<GenerationGameIndex> game_indices;
    
    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;
    
    @JsonProperty("move_damage_class")
    private NamedAPIResource<MoveDamageClass> move_damage_class;
    
    @JsonProperty("names")
    private List<Name> names;
    
    @JsonProperty("pokemon")
    private List<TypePokemon> pokemon;
    
    @JsonProperty("moves")
    private List<NamedAPIResource<Move>> moves;

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

    public TypeRelations getDamage_relations() {
        return damage_relations;
    }

    public void setDamage_relations(TypeRelations damage_relations) {
        this.damage_relations = damage_relations;
    }

    public List<TypeRelationPast> getPast_damage_relations() {
        return past_damage_relations;
    }

    public void setPast_damage_relations(List<TypeRelationPast> past_damage_relations) {
        this.past_damage_relations = past_damage_relations;
    }

    public List<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }

    public NamedAPIResource<MoveDamageClass> getMove_damage_class() {
        return move_damage_class;
    }

    public void setMove_damage_class(NamedAPIResource<MoveDamageClass> move_damage_class) {
        this.move_damage_class = move_damage_class;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<TypePokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<TypePokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<NamedAPIResource<Move>> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedAPIResource<Move>> moves) {
        this.moves = moves;
    }
    
    
}
