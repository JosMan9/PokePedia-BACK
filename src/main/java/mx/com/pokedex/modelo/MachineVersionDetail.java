/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo;

import mx.com.pokedex.modelo.machines.Machine;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Manuel
 */
public class MachineVersionDetail {

    @JsonProperty("machine")
    private ApiResource<Machine> machine;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    public ApiResource<Machine> getMachine() {
        return machine;
    }

    public void setMachine(ApiResource<Machine> machine) {
        this.machine = machine;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

}
