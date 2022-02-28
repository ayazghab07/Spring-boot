package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repisotory.ParieurRepository;
import com.example.entites.Parieur;

import lombok.Data;

@Service
@Data
public class ParieurService {

	@Autowired
	private ParieurRepository parieurRepository;
	
	public Iterable<Parieur> getParieur(){
		return parieurRepository.findAll();
	}
	
	public Parieur saveParieur(Parieur P) {
		Parieur saveParieur=parieurRepository.save(P);
		System.out.println("Ajout avec succées");
		return saveParieur;
	}
}
