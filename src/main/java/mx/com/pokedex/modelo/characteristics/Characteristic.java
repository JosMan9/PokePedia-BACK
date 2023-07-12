/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.characteristics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Characteristic {
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("gene_modulo")
    private Integer gene_modulo;
    
    @JsonProperty("possible_values")
    private List<Integer> possible_values;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGene_modulo() {
        return gene_modulo;
    }

    public void setGene_modulo(Integer gene_modulo) {
        this.gene_modulo = gene_modulo;
    }

    public List<Integer> getPossible_values() {
        return possible_values;
    }

    public void setPossible_values(List<Integer> possible_values) {
        this.possible_values = possible_values;
    }
    
    
}
