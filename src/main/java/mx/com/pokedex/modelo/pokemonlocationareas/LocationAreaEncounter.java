/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonlocationareas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.VersionEncounterDetail;
import mx.com.pokedex.modelo.locationareas.LocationArea;

/**
 *
 * @author Manuel
 */
public class LocationAreaEncounter {
    
    @JsonProperty("location_area")
    private NamedAPIResource<LocationArea> location_area;
    
    @JsonProperty("version_details")
    private List<VersionEncounterDetail> version_details;

    public NamedAPIResource<LocationArea> getLocation_area() {
        return location_area;
    }

    public void setLocation_area(NamedAPIResource<LocationArea> location_area) {
        this.location_area = location_area;
    }

    public List<VersionEncounterDetail> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(List<VersionEncounterDetail> version_details) {
        this.version_details = version_details;
    }
    
    
}
