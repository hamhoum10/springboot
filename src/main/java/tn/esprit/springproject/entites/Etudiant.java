package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
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
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}
