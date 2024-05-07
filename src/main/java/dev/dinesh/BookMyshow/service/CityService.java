package dev.dinesh.BookMyshow.service;

import dev.dinesh.BookMyshow.model.City;
import dev.dinesh.BookMyshow.repo.CityRepository;
import dto.CityRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City savecity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }
    public boolean deleteCity(int CityID){
        cityRepository.deleteById(CityID);
        return true;
    }
    public City getCityByName(String CityName){
        City city = cityRepository.getCityByName(CityName);
        return city;
    }
}
