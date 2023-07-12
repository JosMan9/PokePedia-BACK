/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.stats;

import mx.com.pokedex.modelo.characteristics.Characteristic;
import mx.com.pokedex.modelo.movedamageclass.MoveDamageClass;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.ApiResource;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class Stat implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("game_index")
    private Integer game_index;

    @JsonProperty("is_battle_only")
    private Boolean is_battle_only;

    @JsonProperty("affecting_moves")
    private MoveStatAffectSets affecting_moves;

    @JsonProperty("affecting_natures")
    private NatureStatAffectSets affecting_natures;

    @JsonProperty("characteristics")
    private List<ApiResource<Characteristic>> characteristics;

    @JsonProperty("move_damage_class")
    private NamedAPIResource<MoveDamageClass> move_damage_class;

    @JsonProperty("names")
    private List<Name> names;

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

    public Integer getGame_index() {
        return game_index;
    }

    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    public Boolean getIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(Boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public MoveStatAffectSets getAffecting_moves() {
        return affecting_moves;
    }

    public void setAffecting_moves(MoveStatAffectSets affecting_moves) {
        this.affecting_moves = affecting_moves;
    }

    public NatureStatAffectSets getAffecting_natures() {
        return affecting_natures;
    }

    public void setAffecting_natures(NatureStatAffectSets affecting_natures) {
        this.affecting_natures = affecting_natures;
    }

    public List<ApiResource<Characteristic>> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<ApiResource<Characteristic>> characteristics) {
        this.characteristics = characteristics;
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

}
