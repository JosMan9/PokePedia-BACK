/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ContestComboDetail {

    @JsonProperty("use_before")
    private List<Move> use_before;

    @JsonProperty("use_after")
    private List<Move> use_after;

    public List<Move> getUse_before() {
        return use_before;
    }

    public void setUse_before(List<Move> use_before) {
        this.use_before = use_before;
    }

    public List<Move> getUse_after() {
        return use_after;
    }

    public void setUse_after(List<Move> use_after) {
        this.use_after = use_after;
    }

}
