/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class MoveStatAffectSets {

    @JsonProperty("increase")
    private List<MoveStatAffect> increase;

    @JsonProperty("decrease")
    private List<MoveStatAffect> decrease;

    public List<MoveStatAffect> getIncrease() {
        return increase;
    }

    public void setIncrease(List<MoveStatAffect> increase) {
        this.increase = increase;
    }

    public List<MoveStatAffect> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<MoveStatAffect> decrease) {
        this.decrease = decrease;
    }
}
