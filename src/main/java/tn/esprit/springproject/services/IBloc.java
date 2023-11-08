package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IBloc {
    public Bloc addBloc(Bloc e);
    public Bloc updateBloc(Bloc e);
    public List<Bloc> findAllBloc();
    public Bloc findBloc(long idE);
    public void deleatBloc (long idE);
    public Set<Bloc> findBlocByChambresTypeCLike(TypeChambre typeC);
}
