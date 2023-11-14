package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Universite;

import java.util.List;

public interface IUniversite {
    public Universite addUniversite(Universite e);
    public Universite updateUniversite(Universite e);
    public List<Universite> findAllUniversite();
    public Universite findUniversite(long idE);
    public void deleatUniversite (long idE);
}
