package tn.esprit.springproject.entites;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy ="universite" )
    private Foyer foyer;

}
