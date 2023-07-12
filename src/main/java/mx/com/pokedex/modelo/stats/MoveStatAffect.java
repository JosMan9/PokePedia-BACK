/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.moves.Move;

/**
 *
 * @author Manuel
 */
public class MoveStatAffect {
    
    @JsonProperty("change")
    private Integer change;
    
    @JsonProperty("move")
    private NamedAPIResource<Move> move;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedAPIResource<Move> getMove() {
        return move;
    }

    public void setMove(NamedAPIResource<Move> move) {
        this.move = move;
    }
    
    
}
