package tech.carlosestrada.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String species;
	private String planet;

	public Alien(){

	}

	public Alien(int id, String name, String species, String homePlanet) {
		this.id = id;
		this.name = name;
		this.species = species;
		this.planet = homePlanet;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getHomePlanet() {
		return planet;
	}

	public void setHomePlanet(String homePlanet) {
		this.planet = homePlanet;
	}
}
