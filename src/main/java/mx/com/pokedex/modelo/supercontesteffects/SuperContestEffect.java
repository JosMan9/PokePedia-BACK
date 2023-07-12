/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.supercontesteffects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.FlavorText;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.moves.Move;

/**
 *
 * @author Manuel
 */
public class SuperContestEffect {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("appeal")
    private Integer appeal;
    
    @JsonProperty("flavor_text_entries")
    private List<FlavorText> flavor_text_entries;
    
    @JsonProperty("moves")
    private List<NamedAPIResource<Move>> moves;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppeal() {
        return appeal;
    }

    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }

    public List<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<NamedAPIResource<Move>> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedAPIResource<Move>> moves) {
        this.moves = moves;
    }
    
    
}
