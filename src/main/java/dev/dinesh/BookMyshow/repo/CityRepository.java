package dev.dinesh.BookMyshow.repo;


import dev.dinesh.BookMyshow.model.City;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
}
