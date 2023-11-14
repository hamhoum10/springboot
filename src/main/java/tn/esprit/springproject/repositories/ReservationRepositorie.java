package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.List;
import java.util.Set;

public interface ReservationRepositorie extends JpaRepository <Reservation,String> {
    public Reservation findByIdReservation(String nom);
    public Reservation findByEtudiants_Nomet(String nom);
    List<Reservation> findByEtudiantNomStartsWith(String prefix);
}
