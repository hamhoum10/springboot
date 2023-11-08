package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repositories.FoyerRepositorie;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServicelmp implements IFoyer {

private FoyerRepositorie foyerRepositorie;


    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepositorie.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepositorie.saveAndFlush(f);
    }

    @Override
    public List<Foyer> findAllFoyer() {
        return foyerRepositorie.findAll();
    }

    @Override
    public Foyer findFoyer(long idF) {
        return foyerRepositorie.findById(idF).orElse(null);
    }

    @Override
    public void deleatFoyer(long idF) {
        foyerRepositorie.deleteById(idF);

    }

    @Override
    public Foyer getFoyerByNom(String nom) {
        return foyerRepositorie.findByNomFoyer(nom);
    }
}
