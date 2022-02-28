package com.example.Repisotory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entites.Parieur;

@Repository
@CrossOrigin("*")
public interface ParieurRepository extends CrudRepository<Parieur, Long>{

}
