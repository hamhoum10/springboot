package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.UniversiteRepositorie;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServicelmp implements IUniversite{
    private UniversiteRepositorie universiteRepositorie;

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRepositorie.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return universiteRepositorie.saveAndFlush(e);
    }

    @Override
    public List<Universite> findAllUniversite() {
        return universiteRepositorie.findAll();
    }

    @Override
    public Universite findUniversite(long ide) {
        return universiteRepositorie.findById(ide).orElse(null);
    }

    @Override
    public void deleatUniversite(long ide) {
universiteRepositorie.deleteById(ide);
    }
}
