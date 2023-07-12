/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.types;

import mx.com.pokedex.modelo.generation.Generation;
import com.fasterxml.jackson.annotation.JsonProperty;
import mx.com.pokedex.modelo.NamedAPIResource;

/**
 *
 * @author Manuel
 */
public class TypeRelationPast {
    @JsonProperty("generation")
    private NamedAPIResource<Generation> generation;
    
    @JsonProperty("damage_relations")
    private TypeRelations damage_relations;

    public NamedAPIResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource<Generation> generation) {
        this.generation = generation;
    }

    public TypeRelations getDamage_relations() {
        return damage_relations;
    }

    public void setDamage_relations(TypeRelations damage_relations) {
        this.damage_relations = damage_relations;
    }
    
    
}
