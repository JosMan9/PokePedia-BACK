/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pokedex.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import mx.com.pokedex.modelo.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Manuel
 */
@Service
public class PokemonServiceBean implements PokemonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public HashMap listar(int id) throws Exception {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + id,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {
        });

        HashMap<String, Object> map = response.getBody();
        System.out.println(map.get("types").getClass());

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(map);

        System.out.println(json);

        Pokemon pokemon = objectMapper.readValue(json, Pokemon.class);

        System.out.println(pokemon.getAbilities().get(0).getAbility().getName());
        return response.getBody();
    }

    @Override
    public HashMap listAllBerires(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>(){});
        
        System.out.println(url);
        
        HashMap<String, Object> map = response.getBody();
        
        
        return map;
    }

    @Override
    public HashMap listBerry(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/berry/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }


    @Override
    public HashMap listAllBerryFirmness(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
            
    }

    @Override
    public HashMap listBerryFirmness(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("ttps://pokeapi.co/api/v2/berry-firmness/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllBerryFlavors(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listBerryFlavor(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/berry-flavor/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllContestTypes(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listContestType(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/contest-type/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllContestEffects(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listContestEffect(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/contest-effect/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllSuperContestEffects(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listSuperContestEffect(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/super-contest-effect/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllEncounterMethods(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listEncounterMethod(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/encounter-method/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllEncounterConditions(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listEncounterCondition(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/encounter-condition/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllEncounterConditionVlaues(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listEncounterConditionValue(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/encounter-condition-value/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
       
        return response.getBody();
    }

    @Override
    public HashMap listAllEvolutionChain(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap>() {});
        
        return response.getBody();
    }

    @Override
    public HashMap listEvolutionChain(String id) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/evolution-chain/" + id, 
                HttpMethod.GET, 
                HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllEvolutionTriggers(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listEvolutionTrigger(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/evolution-trigger/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllGenerations(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listGeneration(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/generation/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokedexes(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokedex(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokedex/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllVersion(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listVersion(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/version/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllVersionGroup(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listVersionGroup(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/version-group/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllItems(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listItem(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/item/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllItemAttributes(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listItemAttribute(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/item-attribute/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllItemCategories(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listItemCategory(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/item-category/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllItemFlingEffects(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listItemFlingEffect(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/item-fling-effect/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllItemPockets(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listItemPocket(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/item-pocket/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllLocations(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listLocation(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/location/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllLocationAreas(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listLocationArea(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/location-area/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPalParkAreas(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPalParkArea(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pal-park-area/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllRegions(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listRegion(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/region/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMachines(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMachine(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/machine/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoves(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }
    

    @Override
    public HashMap listMove(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }
    
    
    @Override
    public HashMap listAllMoveAliments(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }
    
    @Override
    public HashMap listMoveAliment(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-ailment/" + name, 
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoveBattleStyles(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMoveBattleStyle(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-battle-style/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoveCatogories(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMoveCategory(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-category/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoveDamageClasses(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMoveDamageClass(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-damage-class/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoveLearnMethods(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMoveLearnMethod(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-learn-method/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllMoveTargets(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listMoveTarget(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/move-target/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllAbilities(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAbility(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/ability/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllCharacteristics(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listCharacteristic(String id) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/characteristic/" + id, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllEggGroups(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listEggGroup(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/egg-group/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllGenders(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listGender(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/gender/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllGrowthRates(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listGrowthRate(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/growth-rate/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }
    

    @Override
    public HashMap listAllNatures(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listNature(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/nature/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokeathlonStats(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokeathlonStat(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokeathlon-stat/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemon(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemon(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonLocationAreas(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonLocationArea(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + name + "/encounters", 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonColors(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonColor(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon-color/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonForms(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonForm(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon-form/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonHabitats(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonHabitat(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon-habitat/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonShapes(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonShape(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon-shape/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllPokemonSpecies(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listPokemonSpecie(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon-species/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllStats(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listStat(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/stat/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllTypes(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listType(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/type/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listAllLanguages(String url) {
        ResponseEntity<HashMap> response = restTemplate.exchange(url, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

    @Override
    public HashMap listLanguage(String name) {
        ResponseEntity<HashMap> response = restTemplate.exchange("https://pokeapi.co/api/v2/language/" + name, 
                HttpMethod.GET, HttpEntity.EMPTY, 
                new ParameterizedTypeReference<HashMap> () {});
        
        return response.getBody();
    }

}
