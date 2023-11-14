package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.services.EtudiantServicelmp;
import tn.esprit.springproject.services.ReservationServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class ReservationController {

    private ReservationServiceImp reservationServiceImp;


    @PostMapping("/addreservation")
    public Reservation addEtudiant(@RequestBody Reservation f) {
        return reservationServiceImp.addReservation(f);
    }

    @PutMapping("/updatereservation")
    public Reservation updateEtudiant(@RequestBody Reservation f) {
        return reservationServiceImp.updateReservation(f);
    }

    @GetMapping("/reservation")
    public List<Reservation> findAllEtudiant() {
        return reservationServiceImp.retrieveAllReservation();
    }

    @GetMapping("/reservation/{idF}")
    public Reservation findreservationBynom(@PathVariable String idF) {
        return reservationServiceImp.findByIdReservation(idF);

    }
    @GetMapping("/reservationbynometudiant/{idF}")
    public Reservation findReservationbyetudiant(@PathVariable String idF) {
        return reservationServiceImp.findByEtudiants_Nomet(idF);

    }
    @GetMapping("/reservationbynometudiantstartwithe/{idF}")
    public List<Reservation> findReservationbyetudiantstartwithe(@PathVariable String idF) {
        return reservationServiceImp.findByEtudiantNomStartsWith(idF);

    }


}
