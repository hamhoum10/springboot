package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repositories.FoyerRepositorie;

import java.util.List;

@Service
public class FoyerServicelmp implements IFoyer {
    @Autowired
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
}
