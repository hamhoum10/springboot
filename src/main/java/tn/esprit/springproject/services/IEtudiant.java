package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Etudiant;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudiant(Etudiant e);
    public List<Etudiant> findAllEtudiant();
    public Etudiant findEtudiant(long idE);
    public void deleatEtudiant (long idE);
}
