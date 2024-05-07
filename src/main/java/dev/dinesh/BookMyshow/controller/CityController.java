package dev.dinesh.BookMyshow.controller;

import dev.dinesh.BookMyshow.Exception.CityNotFoundException;
import dev.dinesh.BookMyshow.model.City;
import dev.dinesh.BookMyshow.service.CityService;
import dto.CityRequestDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO) throws CityNotFoundException{
            String cityName = cityRequestDTO.getCityName();

            if(cityName == null || cityName.isEmpty() ||cityName.length()==0 || cityName.isBlank()){
                List<String> errors=new ArrayList<>();
                errors.add("City name cannot be null or empty");
                errors.add("City name cannot be blank");
                throw new CityNotFoundException("City Name is invalid",errors);
            }

            City savedCity = cityService.savecity(cityName);
            return ResponseEntity.ok(savedCity);
    }
    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityID){
        boolean isDeleted = cityService.deleteCity(cityID);
        return ResponseEntity.ok(isDeleted);
    }
    @GetMapping ("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String name){
        City city=cityService.getCityByName(name);
        return ResponseEntity.ok(city);
    }
}
