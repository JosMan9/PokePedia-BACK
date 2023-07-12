/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.test;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 *
 * @author Manuel
 */
public class Version {
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("url")
    private String url;

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
