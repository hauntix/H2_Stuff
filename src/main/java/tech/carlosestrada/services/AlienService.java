package tech.carlosestrada.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.carlosestrada.dao.AlienRepo;
import tech.carlosestrada.model.Alien;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlienService {
	@Autowired
	AlienRepo alienRepo;

	public List<Alien> getAllAliens() {
		List<Alien> aliens = new ArrayList<>();
		alienRepo.findAll().forEach(aliens::add);
		return aliens;
	}

	public Alien getAlienById(int id) {
		return alienRepo.findById(id).get();
	}

	public void saveOrUpdate(Alien alien) {
		alienRepo.save(alien);
	}

	public void delete(int id) {
		alienRepo.deleteById(id);
	}
}
