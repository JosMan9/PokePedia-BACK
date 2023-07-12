/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.modelo.pokemonforms;

import mx.com.pokedex.modelo.pokemon.Pokemon;
import mx.com.pokedex.modelo.pokemon.PokemonFormType;
import mx.com.pokedex.modelo.pokemon.PokemonSprites;
import mx.com.pokedex.modelo.versiongroups.VersionGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import mx.com.pokedex.modelo.Localizable;
import mx.com.pokedex.modelo.Name;
import mx.com.pokedex.modelo.NamedAPIResource;
import mx.com.pokedex.modelo.PokeApiResource;

/**
 *
 * @author Manuel
 */
public class PokemonForm implements PokeApiResource, Localizable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("order")
    private Integer order;

    @JsonProperty("form_order")
    private Integer form_order;

    @JsonProperty("is_default")
    private Boolean is_default;

    @JsonProperty("is_battle_only")
    private Boolean is_battle_only;

    @JsonProperty("is_mega")
    private Boolean is_mega;

    @JsonProperty("form_name")
    private String form_name;

    @JsonProperty("pokemon")
    private NamedAPIResource<Pokemon> pokemon;

    @JsonProperty("types")
    private List<PokemonFormType> types;

    @JsonProperty("sprites")
    private PokemonFormSprites sprites;

    @JsonProperty("version_group")
    private NamedAPIResource<VersionGroup> version_group;

    @JsonProperty("names")
    private List<Name> names;

    @JsonProperty("form_names")
    private Name form_names;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getForm_order() {
        return form_order;
    }

    public void setForm_order(Integer form_order) {
        this.form_order = form_order;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public Boolean getIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(Boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public Boolean getIs_mega() {
        return is_mega;
    }

    public void setIs_mega(Boolean is_mega) {
        this.is_mega = is_mega;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public NamedAPIResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedAPIResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<PokemonFormType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonFormType> types) {
        this.types = types;
    }

    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormSprites sprites) {
        this.sprites = sprites;
    }

    public NamedAPIResource<VersionGroup> getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource<VersionGroup> version_group) {
        this.version_group = version_group;
    }

    @Override
    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public Name getForm_names() {
        return form_names;
    }

    public void setForm_names(Name form_names) {
        this.form_names = form_names;
    }

}
