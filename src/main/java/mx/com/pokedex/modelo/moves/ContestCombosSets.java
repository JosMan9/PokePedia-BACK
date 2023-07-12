/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class ContestCombosSets {

    @JsonProperty("normal")
    private ContestComboDetail normal;

    @JsonProperty("super")
    private ContestComboDetail super_;

    public ContestComboDetail getNormal() {
        return normal;
    }

    public void setNormal(ContestComboDetail normal) {
        this.normal = normal;
    }

    public ContestComboDetail getSuper_() {
        return super_;
    }

    public void setSuper_(ContestComboDetail super_) {
        this.super_ = super_;
    }

}
