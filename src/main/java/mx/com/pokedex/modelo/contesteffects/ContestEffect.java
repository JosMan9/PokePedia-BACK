/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.contesteffects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Effect;
import mx.com.pokedex.modelo.FlavorText;

/**
 *
 * @author Manuel
 */
public class ContestEffect {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("appeal")
    private Integer appeal;
    
    @JsonProperty("jam")
    private Integer jam;
    
    @JsonProperty("effect_entries")
    private List<Effect> effect_entries;
    
    @JsonProperty("flavor_test_entries")
    private List<FlavorText> flavor_test_entries;

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

    public Integer getJam() {
        return jam;
    }

    public void setJam(Integer jam) {
        this.jam = jam;
    }

    public List<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(List<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public List<FlavorText> getFlavor_test_entries() {
        return flavor_test_entries;
    }

    public void setFlavor_test_entries(List<FlavorText> flavor_test_entries) {
        this.flavor_test_entries = flavor_test_entries;
    }
    
    
    
}
