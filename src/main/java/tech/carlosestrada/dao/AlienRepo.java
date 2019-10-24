package tech.carlosestrada.dao;

import org.springframework.data.repository.CrudRepository;
import tech.carlosestrada.model.Alien;

public interface AlienRepo  extends CrudRepository<Alien, Integer> {

}
