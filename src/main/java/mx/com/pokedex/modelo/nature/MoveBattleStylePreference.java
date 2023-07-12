/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.movebattlestyle.MoveBattleStyle;

/**
 *
 * @author Manuel
 */
public class MoveBattleStylePreference {
    
    @JsonProperty("low_hp_preference")
    private Integer low_hp_preference;
    
    @JsonProperty("high_hp_preference")
    private Integer high_hp_preference;
    
    @JsonProperty("move_battle_style")
    private NamedAPIResource<MoveBattleStyle> move_battle_style;

    public Integer getLow_hp_preference() {
        return low_hp_preference;
    }

    public void setLow_hp_preference(Integer low_hp_preference) {
        this.low_hp_preference = low_hp_preference;
    }

    public Integer getHigh_hp_preference() {
        return high_hp_preference;
    }

    public void setHigh_hp_preference(Integer high_hp_preference) {
        this.high_hp_preference = high_hp_preference;
    }

    public NamedAPIResource<MoveBattleStyle> getMove_battle_style() {
        return move_battle_style;
    }

    public void setMove_battle_style(NamedAPIResource<MoveBattleStyle> move_battle_style) {
        this.move_battle_style = move_battle_style;
    }
    
    
}
