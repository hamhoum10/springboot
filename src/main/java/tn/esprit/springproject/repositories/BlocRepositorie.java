package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.Set;

public interface BlocRepositorie extends JpaRepository <Bloc,Long> {
public Set<Bloc> findBlocByChambresTypeCLike(TypeChambre typeC);}
