package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Parieur {
	@Id
	@GeneratedValue (strategy = GenerationType. IDENTITY)
	private Long id;
	private String  nom;
	private String prenom;
	private Long  telephone;
	private String email;
	private String password;
	private String adresse;
	private Long code_postal;
	private String ville;
	private String montant;
	private String payer;
}
