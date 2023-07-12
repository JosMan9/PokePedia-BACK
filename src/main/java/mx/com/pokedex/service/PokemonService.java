/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.pokedex.service;

import java.util.ArrayList;
import java.util.HashMap;
import mx.com.pokedex.modelo.Description;
import mx.com.pokedex.modelo.test.GameIndex;
import mx.com.pokedex.modelo.test.PokemonSpecie;

/**
 *
 * @author Manuel
 */
public interface PokemonService {
    public HashMap listar(int id) throws Exception;
    
    
    /*
    * Métodos para listar todo lo relacionado
    * a las berries
    */
    
    public HashMap listAllBerires(String url);
    public HashMap listBerry(String name);
    
    
    
    /*
    * Métodos para listar todo lo relacionado
    * a las berry firmness
    */
    
    public HashMap listAllBerryFirmness(String url);
    public HashMap listBerryFirmness(String name);

    
    /*
    * Métodos para listar todo lo relaiconado a
    * los flavors berries
    */
    
    public HashMap listAllBerryFlavors(String url);
    public HashMap listBerryFlavor(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los contests types
    */
    
    public HashMap listAllContestTypes(String url);
    public HashMap listContestType(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los contest effects
    */
    
    public HashMap listAllContestEffects(String url);
    public HashMap listContestEffect(String name);
    
    /*
    * Métodos para listar todo lo relacionado a
    * los super contest effects
    */
    
    public HashMap listAllSuperContestEffects(String url);
    public HashMap listSuperContestEffect(String name);

    
    /*
    * Métodos para listar todo lo relacionado a
    * los encounter methods
    */
    
    public HashMap listAllEncounterMethods(String url);
    public HashMap listEncounterMethod(String name);
    
    /*
    * Métodos para listar todo lo relacionado a
    * las encounter conditions
    */
    
    public HashMap listAllEncounterConditions(String url);
    public HashMap listEncounterCondition(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los encounter condition values
    */
    
    public HashMap listAllEncounterConditionVlaues(String url);
    public HashMap listEncounterConditionValue(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * la evolution chain
    */
    
    public HashMap listAllEvolutionChain(String url);
    public HashMap listEvolutionChain(String id);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las evolution triggers
    */
    
    public HashMap listAllEvolutionTriggers(String url);
    public HashMap listEvolutionTrigger(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las generations
    */
    
    public HashMap listAllGenerations(String url);
    public HashMap listGeneration(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las pokedexes
    */
    
    public HashMap listAllPokedexes(String url);
    public HashMap listPokedex(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * la version
    */
    
    public HashMap listAllVersion(String url);
    public HashMap listVersion(String name);
    
    /*
    * Métodos para listar todo lo relacionado a
    * la version group
    */
    
    public HashMap listAllVersionGroup(String url);
    public HashMap listVersionGroup(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los items
    */
    
    public HashMap listAllItems(String url);
    public HashMap listItem(String name);
    
    
    /*
    * Métodos para listar todo lo relacioado a
    * item attributes
    */
    
    public HashMap listAllItemAttributes(String url);
    public HashMap listItemAttribute(String name);
    
    
    /*
    * Métodos para listar todo lo relacioando a
    * los item categories
    */
    
    public HashMap listAllItemCategories(String url);
    public HashMap listItemCategory(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los item fling effects
    */
    
    public HashMap listAllItemFlingEffects(String url);
    public HashMap listItemFlingEffect(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los item pockets
    */
    
    public HashMap listAllItemPockets(String url);
    public HashMap listItemPocket(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las locations
    */
    
    public HashMap listAllLocations(String url);
    public HashMap listLocation(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las locations areas
    */
    
    public HashMap listAllLocationAreas(String url);
    public HashMap listLocationArea(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las pal park areas
    */
    
    public HashMap listAllPalParkAreas(String url);
    public HashMap listPalParkArea(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las regions
    */
    
    public HashMap listAllRegions(String url);
    public HashMap listRegion(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las machines
    */
    
    public HashMap listAllMachines(String url);
    public HashMap listMachine(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los moves
    */
    
    public HashMap listAllMoves(String url);
    public HashMap listMove(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los moves aliments
    */
    
    public HashMap listAllMoveAliments(String url);
    public HashMap listMoveAliment(String name);
    
    /*
    * Métodos para listar todo lo relacionado a 
    * los move battle style
    */
    
    public HashMap listAllMoveBattleStyles(String url);
    public HashMap listMoveBattleStyle(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los move categories
    */
    
    public HashMap listAllMoveCatogories(String url);
    public HashMap listMoveCategory(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los move damage class
    */
    
    public HashMap listAllMoveDamageClasses(String url);
    public HashMap listMoveDamageClass(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los move learn method
    */
    
    public HashMap listAllMoveLearnMethods(String url);
    public HashMap listMoveLearnMethod(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los move targets
    */
    
    public HashMap listAllMoveTargets(String url);
    public HashMap listMoveTarget(String name);
    
    /*
    * Métodos para listar todo lo relacionado a
    * las abilities
    */
    
    public HashMap listAllAbilities(String url);
    public HashMap listAbility(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las characteristics
    */
    
    public HashMap listAllCharacteristics(String url);
    public HashMap listCharacteristic(String id);
    
    
    /*
    * Métodos para listar todo lo relacioando a
    * los egg groups
    */
    
    public HashMap listAllEggGroups(String url);
    public HashMap listEggGroup(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los genders
    */
    
    public HashMap listAllGenders(String url);
    public HashMap listGender(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los growth rates
    */
    
    public HashMap listAllGrowthRates(String url);
    public HashMap listGrowthRate(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las natures
    */
    
    public HashMap listAllNatures(String url);
    public HashMap listNature(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los pokeathlon stats
    */
    
    public HashMap listAllPokeathlonStats(String url);
    public HashMap listPokeathlonStat(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los pokemon
    */
    
    public HashMap listAllPokemon(String url);
    public HashMap listPokemon(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los pokemon location areas
    */
    
    public HashMap listAllPokemonLocationAreas(String url);
    public HashMap listPokemonLocationArea(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los pokemon colors
    */
    
    public HashMap listAllPokemonColors(String url);
    public HashMap listPokemonColor(String name);
    

    /*
    * Métodos para listar todo lo relacionado a
    * las pokemons forms
    */
    
    public HashMap listAllPokemonForms(String url);
    public HashMap listPokemonForm(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los pokemons habitats
    */
    
    public HashMap listAllPokemonHabitats(String url);
    public HashMap listPokemonHabitat(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las pokemons shapes
    */
    
    public HashMap listAllPokemonShapes(String url);
    public HashMap listPokemonShape(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * las pokemon species
    */
    
    public HashMap listAllPokemonSpecies(String url);
    public HashMap listPokemonSpecie(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los stats
    */
    
    public HashMap listAllStats(String url);
    public HashMap listStat(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los types
    */
    
    public HashMap listAllTypes(String url);
    public HashMap listType(String name);
    
    
    /*
    * Métodos para listar todo lo relacionado a
    * los languages
    */
    
    public HashMap listAllLanguages(String url);
    public HashMap listLanguage(String name);
}
