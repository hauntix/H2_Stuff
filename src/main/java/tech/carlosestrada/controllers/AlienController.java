package tech.carlosestrada.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.carlosestrada.model.Alien;
import tech.carlosestrada.services.AlienService;

import java.util.List;

@RestController
public class AlienController {

	@Autowired
	AlienService alienService;

	@GetMapping("/aliens")
	private List<Alien> getAllAliens() {
		return alienService.getAllAliens();
	}

	@GetMapping("/aliens/{id}")
	private Alien getAlien(@PathVariable("id") int id) {
		return alienService.getAlienById(id);
	}

	@DeleteMapping("/aliens/{id}")
	private void deleteAlien(@PathVariable("id") int id) {
		alienService.getAlienById(id);
	}

	@PostMapping("/aliens")
	private int saveAlien(@RequestBody Alien alien) {
		alienService.saveOrUpdate(alien);
		return alien.getId();
	}
}
