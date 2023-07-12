/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.movealiments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;
import mx.com.pokedex.modelo.moves.Move;

/**
 *
 * @author Manuel
 */
public class MoveAliment implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("moves")
    private List<NamedAPIResource<Move>> moves;

    @JsonProperty("names")
    private List<Name> names;

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

    public List<NamedAPIResource<Move>> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedAPIResource<Move>> moves) {
        this.moves = moves;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

}
