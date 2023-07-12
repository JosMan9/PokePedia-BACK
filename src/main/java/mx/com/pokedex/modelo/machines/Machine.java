/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.machines;

import mx.com.pokedex.modelo.versiongroups.VersionGroup;
import mx.com.pokedex.modelo.item.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.moves.Move;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class Machine {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("item")
    private NamedAPIResource<Item> item;

    @JsonProperty("move")
    private NamedAPIResource<Move> move;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamedAPIResource<Item> getItem() {
        return item;
    }

    public void setItem(NamedAPIResource<Item> item) {
        this.item = item;
    }

    public NamedAPIResource<Move> getMove() {
        return move;
    }

    public void setMove(NamedAPIResource<Move> move) {
        this.move = move;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

}
