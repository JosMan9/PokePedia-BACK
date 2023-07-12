/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class NamedAPIResourceList {
    
    @JsonProperty("count")
    private Integer count;
    
    @JsonProperty("next")
    private String next;
    
    @JsonProperty("previous")
    private String previous;
    
    @JsonProperty("results")
    private List<NamedAPIResource> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<NamedAPIResource> getResults() {
        return results;
    }

    public void setResults(List<NamedAPIResource> results) {
        this.results = results;
    }
    
    
}
