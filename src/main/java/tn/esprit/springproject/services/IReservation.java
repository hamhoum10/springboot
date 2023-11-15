package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Reservation;

import java.util.List;

public interface IReservation {
    List<Reservation> retrieveAllReservation();
    public Reservation findByIdReservation(String nom);

    Reservation addReservation (Reservation res);

    Reservation updateReservation (Reservation res);

    void retrieveReservation (String idReservation);
     Reservation findByEtudiants_Nomet(String nom);
    List<Reservation> findByEtudiantNomStartsWith(String prefix);



}
