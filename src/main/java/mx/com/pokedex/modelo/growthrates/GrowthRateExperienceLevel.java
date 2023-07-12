/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.growthrates;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class GrowthRateExperienceLevel {
    @JsonProperty("level")
    private Integer level;
    
    @JsonProperty("experience")
    private Integer experience;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    
    
}
