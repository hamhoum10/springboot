package tn.esprit.springproject.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @OneToMany
    private List <Reservation> reservation;
    @ManyToOne
    private Bloc bloc;
}
