package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.Set;

public interface ChambreRepositorie extends JpaRepository<Chambre,Long> {
    public Set<Chambre> findChambreByBloc_NomBloc(String bloc);
}
