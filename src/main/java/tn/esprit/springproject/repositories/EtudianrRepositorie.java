package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;

public interface EtudianrRepositorie extends JpaRepository<Etudiant,Long> {
}
