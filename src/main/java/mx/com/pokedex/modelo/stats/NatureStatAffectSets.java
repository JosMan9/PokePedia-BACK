/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.nature.Nature;

/**
 *
 * @author Manuel
 */
public class NatureStatAffectSets {

    @JsonProperty("increase")
    private List<Nature> increase;

    @JsonProperty("decrease")
    private List<Nature> decrease;

    public List<Nature> getIncrease() {
        return increase;
    }

    public void setIncrease(List<Nature> increase) {
        this.increase = increase;
    }

    public List<Nature> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<Nature> decrease) {
        this.decrease = decrease;
    }

}
