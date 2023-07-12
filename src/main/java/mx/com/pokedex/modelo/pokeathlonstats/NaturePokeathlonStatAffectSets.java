/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokeathlonstats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class NaturePokeathlonStatAffectSets {
    
    @JsonProperty("increase")
    private List<NaturePokeathlonStatAffect> increase;
    
    @JsonProperty("decrease")
    private List<NaturePokeathlonStatAffect> decrease;

    public List<NaturePokeathlonStatAffect> getIncrease() {
        return increase;
    }

    public void setIncrease(List<NaturePokeathlonStatAffect> increase) {
        this.increase = increase;
    }

    public List<NaturePokeathlonStatAffect> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<NaturePokeathlonStatAffect> decrease) {
        this.decrease = decrease;
    }
    
    
}
