package tn.esprit.springproject.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date annerUniversitaire;
    private boolean estValide;
    @ManyToMany
    private List <Etudiant> etudiants;
}
