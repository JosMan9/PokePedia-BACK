/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.item;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class ItemSprites {

    @JsonProperty("default")
    private String default_;

    public String getDefault_() {
        return default_;
    }

    public void setDefault_(String default_) {
        this.default_ = default_;
    }

}
