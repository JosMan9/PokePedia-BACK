/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.movelearnmethod.MoveLearnMethod;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;

/**
 *
 * @author Manuel
 */
public class PokemonMoveVersion {
    
    @JsonProperty("move_learn_method")
    private NamedAPIResource<MoveLearnMethod> move_learn_method;
    
    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;
    
    @JsonProperty("level_learned_at")
    private Integer level_learned_at;

    public NamedAPIResource<MoveLearnMethod> getMove_learn_method() {
        return move_learn_method;
    }

    public void setMove_learn_method(NamedAPIResource<MoveLearnMethod> move_learn_method) {
        this.move_learn_method = move_learn_method;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

    public Integer getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(Integer level_learned_at) {
        this.level_learned_at = level_learned_at;
    }
    
    
}
