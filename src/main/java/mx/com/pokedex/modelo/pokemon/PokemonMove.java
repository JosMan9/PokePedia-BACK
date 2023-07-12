/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.moves.Move;

/**
 *
 * @author Manuel
 */
public class PokemonMove {

    @JsonProperty("move")
    private NamedAPIResource<Move> move;

    @JsonProperty("version_group_details")
    private List<PokemonMoveVersion> version_group_details;

    public NamedAPIResource<Move> getMove() {
        return move;
    }

    public void setMove(NamedAPIResource<Move> move) {
        this.move = move;
    }

    public List<PokemonMoveVersion> getVersion_group_details() {
        return version_group_details;
    }

    public void setVersion_group_details(List<PokemonMoveVersion> version_group_details) {
        this.version_group_details = version_group_details;
    }

}
