package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.TypeChambre;
import tn.esprit.springproject.repositories.BlocRepositorie;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class BlocServicelmp implements IBloc {

private BlocRepositorie BlocRepositorie;


    @Override
    public Bloc addBloc(Bloc f) {
        return BlocRepositorie.save(f);
    }

    @Override
    public Bloc updateBloc(Bloc f) {
        return BlocRepositorie.saveAndFlush(f);
    }

    @Override
    public List<Bloc> findAllBloc() {
        return BlocRepositorie.findAll();
    }

    @Override
    public Bloc findBloc(long idF) {
        return BlocRepositorie.findById(idF).orElse(null);
    }

    @Override
    public void deleatBloc(long idF) {
        BlocRepositorie.deleteById(idF);

    }

    @Override
    public Set<Bloc> findBlocByChambresTypeCLike(TypeChambre typeC) {
        return BlocRepositorie.findBlocByChambresTypeCLike(typeC);
    }


}
