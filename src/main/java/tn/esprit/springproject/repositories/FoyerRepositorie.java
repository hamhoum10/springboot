package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Foyer;

public interface FoyerRepositorie extends JpaRepository <Foyer,Long> {
public Foyer findByNomFoyer(String nom);}
