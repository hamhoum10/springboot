package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.repositories.ReservationRepositorie;

import java.util.List;

@Service
public class ReservationServiceImp implements  IReservation {
    ReservationRepositorie reservationRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {

        return reservationRepo.findAll();
    }

    @Override
    public Reservation findByIdReservation(String nom) {
        return reservationRepo.findByIdReservation(nom);
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return null;
    }


    @Override
    public Reservation findByEtudiants_Nomet(String nom) {
        return reservationRepo.findByEtudiants_Nomet(nom);
    }

    @Override
    public List<Reservation> findByEtudiantNomStartsWith(String prefix) {
        return reservationRepo.findByEtudiantNomStartsWith(prefix);
    }

}
