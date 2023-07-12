/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import mx.com.pokedex.modelo.Description;
import mx.com.pokedex.modelo.test.GameIndex;
import mx.com.pokedex.modelo.test.PokemonSpecie;
import mx.com.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manuel
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PokeController {
    @Autowired
    PokemonService service;
    
    @GetMapping("/listar/{id}")
    //@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap listar(@PathVariable int id) throws Exception {
        var indices = service.listar(id);
        System.out.println("dvdvd" +  indices);
        return service.listar(id);
    }
    
    @GetMapping("/berry")
    public HashMap berries() {
        return service.listAllBerires("https://pokeapi.co/api/v2/berry/");
    }
    
    @GetMapping("/berry/{idName}")
    public HashMap berriesID(@PathVariable String idName) {
        return service.listBerry(idName);
    }
    
    @GetMapping("/berry-firmness")
    public HashMap berriesFirmnessess() {
        return service.listAllBerryFirmness("https://pokeapi.co/api/v2/berry-firmness/");
    }
    
    @GetMapping("/berry-firmness/{idName}")
    public HashMap berryFirmness(@PathVariable String idName) {
        return service.listBerryFirmness(idName);
    }
    
    @GetMapping("/berry-flavor")
    public HashMap berryFlavors() {
        return service.listAllBerryFlavors("https://pokeapi.co/api/v2/berry-flavor/");
    }
    
    @GetMapping("/berry-flavor/{idName}")
    public HashMap berryFlavor(@PathVariable String idName) {
        return service.listBerryFlavor(idName);
    }
    
    @GetMapping("/contest-type")
    public HashMap contestTypes() {
        return service.listAllContestTypes("https://pokeapi.co/api/v2/contest-type/");
    }
    
    @GetMapping("/contest-type/{idName}")
    public HashMap contestType(@PathVariable String idName) {
        return service.listContestType(idName);
    }
    
    @GetMapping("/contest-effect")
    public HashMap contestEffects() {
        return service.listAllContestEffects("https://pokeapi.co/api/v2/contest-effect/");
    }
    
    @GetMapping("/contest-effect/{idName}")
    public HashMap contestEffect(@PathVariable String idName){
        return service.listContestEffect(idName);
    }
    
    @GetMapping("/super-contest-effect")
    public HashMap superContestEffects() {
        return service.listAllSuperContestEffects("https://pokeapi.co/api/v2/super-contest-effect/");
    }
    
    @GetMapping("/super-contest-effect/{idName}")
    public HashMap superContestEffect(@PathVariable String idName) {
        return service.listSuperContestEffect(idName);
    }
    
    @GetMapping("/encounter-method")
    public HashMap encounterMethods() {
        return service.listAllEncounterMethods("https://pokeapi.co/api/v2/encounter-method/");
    }
    
    @GetMapping("/encounter-method/{idName}")
    public HashMap encounterMethod(@PathVariable String idName) {
        return service.listEncounterMethod(idName);
    }
    
    @GetMapping("/encounter-condition")
    public HashMap encounterConditions() {
        return service.listAllEncounterConditions("https://pokeapi.co/api/v2/encounter-condition/");
    }
    
    @GetMapping("/encounter-condition/{idName}")
    public HashMap encounterCondition(@PathVariable String idName) {
        return service.listEncounterCondition(idName);
    }
    
    @GetMapping("/encounter-condition-value")
    public HashMap encounterConditionValues() {
        return service.listAllEncounterConditionVlaues("https://pokeapi.co/api/v2/encounter-condition-value/");
    }
    
    @GetMapping("/encounter-condition-value/{idName}")
    public HashMap encounterConditionValue(@PathVariable String idName) {
        return service.listEncounterConditionValue(idName);
    }
    
    @GetMapping("/evolution-chain/")
    public HashMap evolutionChains() {
        return service.listAllEvolutionChain("https://pokeapi.co/api/v2/evolution-chain/");
    }
    
    @GetMapping("/evolution-chain/{idName}")
    public HashMap evolutionChain(@PathVariable String idName) {
        return service.listEvolutionChain(idName);
    }
    
    @GetMapping("/evolution-trigger")
    public HashMap evolutionTriggers() {
        return service.listAllEvolutionTriggers("https://pokeapi.co/api/v2/evolution-trigger/");
    }
    
    @GetMapping("/evolution-trigger/{idName}")
    public HashMap evolutionTrigger(@PathVariable String idName) {
        return service.listEvolutionTrigger(idName);
    }
    
    @GetMapping("/generation")
    public HashMap generations() {
        return service.listAllGenerations("https://pokeapi.co/api/v2/generation/");
    }
    
    @GetMapping("/generation/{idName}")
    public HashMap genration(@PathVariable String idName) {
        return service.listGeneration(idName);
    }
    
    @GetMapping("/pokedex")
    public HashMap pokedexes() {
        return service.listAllPokedexes("https://pokeapi.co/api/v2/pokedex/");
    }
    
    @GetMapping("/pokedex/{idName}")
    public HashMap pokedex(@PathVariable String idName) {
        return service.listPokedex(idName);
    }
    
    @GetMapping("/version")
    public HashMap versions() {
        return service.listAllVersion("https://pokeapi.co/api/v2/version/");
    }
    
    @GetMapping("/version/{idName}")
    public HashMap version(@PathVariable String idName) {
        return service.listVersion(idName);
    }
    
    @GetMapping("/version-group")
    public HashMap versionGroups() {
        return service.listAllVersionGroup("https://pokeapi.co/api/v2/version-group/");
    }
    
    @GetMapping("/version-group/{idName}")
    public HashMap versionGroup(@PathVariable String idName) {
        return service.listVersionGroup(idName);
    }
    
    @GetMapping("/item")
    public HashMap items() {
        return service.listAllItems("https://pokeapi.co/api/v2/item/");
    }
    
    @GetMapping("/item/{idName}")
    public HashMap item(@PathVariable String idName) {
        return service.listItem(idName);
    }
    
    @GetMapping("/item-attribute")
    public HashMap itemAttributes() {
        return service.listAllItemAttributes("https://pokeapi.co/api/v2/item-attribute/");
    }
    
    @GetMapping("/item-attribute/{idName}")
    public HashMap itemAttribute(@PathVariable String idName) {
        return service.listItemAttribute(idName);
    }
    
    @GetMapping("/item-category")
    public HashMap itemCategories() {
        return service.listAllItemCategories("https://pokeapi.co/api/v2/item-category/");
    }
    
    @GetMapping("/item-category/{idName}")
    public HashMap itemCategory(@PathVariable String idName) {
        return service.listItemCategory(idName);
    }
    
    @GetMapping("/item-fling-effect")
    public HashMap itemFlingEffects() {
        return service.listAllItemFlingEffects("https://pokeapi.co/api/v2/item-fling-effect/");
    }
    
    @GetMapping("/item-fling-effect/{idName}")
    public HashMap itemFlingEffect(@PathVariable String idName) {
        return service.listItemFlingEffect(idName);
    }
    
    @GetMapping("/item-pocket")
    public HashMap itemPockets() {
        return service.listAllItemPockets("https://pokeapi.co/api/v2/item-pocket/");
    }
    
    @GetMapping("/item-pocket/{idName}")
    public HashMap itemPocket(@PathVariable String idName) {
        return service.listItemPocket(idName);
    } 
    
    @GetMapping("/location")
    public HashMap locations() {
        return service.listAllLocations("https://pokeapi.co/api/v2/location/");
    }
    
    @GetMapping("/location/{idName}")
    public HashMap location(@PathVariable String idNmae) {
        return service.listLocation(idNmae);
    }
    
    @GetMapping("/location-area")
    public HashMap locationAreas() {
        return service.listAllLocationAreas("https://pokeapi.co/api/v2/location-area/");
    }
    
    @GetMapping("/location-area/{idName}")
    public HashMap locationArea(@PathVariable String idName) {
        return service.listLocationArea(idName);
    }
    
    @GetMapping("/pal-park-area")
    public HashMap palParkAreas() {
        return service.listAllPalParkAreas("https://pokeapi.co/api/v2/pal-park-area/");
    }
    
    @GetMapping("/pal*park-area/{idName}")
    public HashMap palParkArea(@PathVariable String idName) {
        return service.listPalParkArea(idName);
    }
    
    @GetMapping("/region")
    public HashMap regions() {
        return service.listAllRegions("https://pokeapi.co/api/v2/region/");
    }
    
    @GetMapping("/region/{idName}")
    public HashMap region(@PathVariable String idName) {
        return service.listRegion(idName);
    }
    
    @GetMapping("/machine")
    public HashMap machines() {
        return service.listAllMachines("https://pokeapi.co/api/v2/machine/");
    }
    
    @GetMapping("/machine/{id}")
    public HashMap machine(@PathVariable String id) {
        return service.listMachine(id);
    }
    
    @GetMapping("/move")
    public HashMap moves() {
        return service.listAllMoves("https://pokeapi.co/api/v2/move/");
    }
    
    @GetMapping("/move/{idName}")
    public HashMap move(@PathVariable String idName) {
        return service.listMove(idName);
    }
    
    @GetMapping("/move-aliment")
    public HashMap moveAliments() {
        return service.listAllMoveAliments("https://pokeapi.co/api/v2/move-ailment/");
    }
    
    @GetMapping("/move-aliment/{idName}")
    public HashMap moveAliment(@PathVariable String idName) {
        return service.listMoveAliment(idName);
    }
    
    @GetMapping("/move-battle-style")
    public HashMap moveBattleStyles() {
        return service.listAllMoveBattleStyles("https://pokeapi.co/api/v2/move-battle-style/");
    }
    
    @GetMapping("/move-battle-style/{idName}")
    public HashMap moveBattleStyle(@PathVariable String idName) {
        return service.listMoveBattleStyle(idName);
    }
    
    @GetMapping("/move-category")
    public HashMap moveCategories() {
        return service.listAllMoveCatogories("https://pokeapi.co/api/v2/move-category/");
    }
    
    @GetMapping("/move-category/{idName}")
    public HashMap moveCategory(@PathVariable String idName) {
        return service.listMoveCategory(idName);
    }
    
    @GetMapping("/move-damage-class")
    public HashMap moveDamageClasses() {
        return service.listAllMoveDamageClasses("https://pokeapi.co/api/v2/move-damage-class/");
    }
    
    @GetMapping("/move-damage-class/{idName}")
    public HashMap moveDamageClass(@PathVariable String idName) {
        return service.listMoveDamageClass(idName);
    }
    
    @GetMapping("/move-learn-method")
    public HashMap moveLearnMethods() {
        return service.listAllMoveLearnMethods("https://pokeapi.co/api/v2/move-learn-method/");
    }
    
    @GetMapping("/move-learn-method/{idName}")
    public HashMap moveLearnMethod(@PathVariable String idName) {
        return service.listMoveLearnMethod(idName);
    }
    
    @GetMapping("/move-target")
    public HashMap moveTargets() {
        return service.listAllMoveTargets("https://pokeapi.co/api/v2/move-target/");
    }
    
    @GetMapping("/move-target/{idName}")
    public HashMap moveTarget1(@PathVariable String idName) {
        return service.listMoveTarget(idName);
    }
    
    @GetMapping("/ability")
    public HashMap abilities() {
        return service.listAllAbilities("https://pokeapi.co/api/v2/ability/");
    }
    
    @GetMapping("/ability/{idName}")
    public HashMap ability(@PathVariable String idName) {
        return service.listAbility(idName);
    }
    
    @GetMapping("/characteristic") 
    public HashMap characteristics() {
        return service.listAllCharacteristics("https://pokeapi.co/api/v2/characteristic/");
    }
    
    @GetMapping("/characteristic/{id}")
    public HashMap characteristic(@PathVariable String id) {
        return service.listCharacteristic(id);
    }
    
    
}
