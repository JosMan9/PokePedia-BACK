/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class TypeRelations {

    @JsonProperty("no_damage_to")
    private List<NamedAPIResource<Type>> no_damage_to;

    @JsonProperty("half_damage_to")
    private List<NamedAPIResource<Type>> half_damage_to;

    @JsonProperty("double_damage_to")
    private List<NamedAPIResource<Type>> double_damage_to;

    @JsonProperty("no_damage_from")
    private List<NamedAPIResource<Type>> no_damage_from;

    @JsonProperty("half_damage_from")
    private List<NamedAPIResource<Type>> half_damage_from;

    @JsonProperty("double_damage_from")
    private List<NamedAPIResource<Type>> double_damage_from;

    public List<NamedAPIResource<Type>> getNo_damage_to() {
        return no_damage_to;
    }

    public void setNo_damage_to(List<NamedAPIResource<Type>> no_damage_to) {
        this.no_damage_to = no_damage_to;
    }

    public List<NamedAPIResource<Type>> getHalf_damage_to() {
        return half_damage_to;
    }

    public void setHalf_damage_to(List<NamedAPIResource<Type>> half_damage_to) {
        this.half_damage_to = half_damage_to;
    }

    public List<NamedAPIResource<Type>> getDouble_damage_to() {
        return double_damage_to;
    }

    public void setDouble_damage_to(List<NamedAPIResource<Type>> double_damage_to) {
        this.double_damage_to = double_damage_to;
    }

    public List<NamedAPIResource<Type>> getNo_damage_from() {
        return no_damage_from;
    }

    public void setNo_damage_from(List<NamedAPIResource<Type>> no_damage_from) {
        this.no_damage_from = no_damage_from;
    }

    public List<NamedAPIResource<Type>> getHalf_damage_from() {
        return half_damage_from;
    }

    public void setHalf_damage_from(List<NamedAPIResource<Type>> half_damage_from) {
        this.half_damage_from = half_damage_from;
    }

    public List<NamedAPIResource<Type>> getDouble_damage_from() {
        return double_damage_from;
    }

    public void setDouble_damage_from(List<NamedAPIResource<Type>> double_damage_from) {
        this.double_damage_from = double_damage_from;
    }

}
