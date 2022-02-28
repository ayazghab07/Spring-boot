package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repisotory.ParieurRepository;
import com.example.Services.ParieurService;
import com.example.entites.Parieur;

@CrossOrigin("*")
@RestController
@RequestMapping("/Projet")

public class ParieurController {
	@Autowired
	private ParieurRepository parieurRepository;
	@Autowired
	private ParieurService parieurService;
	@GetMapping("/Parieurs")
	public Iterable<Parieur> getParieur(){
		return  parieurService.getParieur();
	}
	@PostMapping(path="/AddParieur")
	public void addParieur(@RequestBody Parieur P) {
		parieurService.saveParieur(P);
		System.out.println("connexion au controleur reussi");
	}
	@DeleteMapping("/Parieur/{id}")
	  public void deleteTutorial(@org.springframework.web.bind.annotation.PathVariable("id") Long id) {
		parieurRepository.deleteById(id);
	  }
}
