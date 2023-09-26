package tn.esprit.springproject.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiqnt;
    private String nomet;
    private String prenomEtm;
        private long cin;
        private String ecole;

    @Temporal (TemporalType.DATE)
        private Date dateNaissance;
}
