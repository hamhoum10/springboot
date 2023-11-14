package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IChambre {
    public Chambre addChambre(Chambre e);
    public Chambre updateChambre(Chambre e);
    public List<Chambre> findAllChambre();
    public Chambre findChambre(long idE);
    public void deleatChambre (long idE);
    Set<Chambre> findChambreByBloc_nom(String bloc);
}
