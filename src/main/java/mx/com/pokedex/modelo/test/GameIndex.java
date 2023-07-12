/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 *
 * @author Manuel
 */
@Data
public class GameIndex {

    @JsonProperty("game_index")
    private Integer game_index;
    
    @JsonProperty("version")
    private Version version;

    public Integer getIndex() {
        return game_index;
    }

    public void setIndex(int index) {
        this.game_index = index;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

}
