package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Universite;

public interface UniversiteRepositorie extends JpaRepository<Universite,Long> {
}
