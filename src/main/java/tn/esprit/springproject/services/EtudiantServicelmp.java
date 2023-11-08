package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.repositories.EtudianrRepositorie;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServicelmp  implements IEtudiant{
    private EtudianrRepositorie etudianrRepositorie;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudianrRepositorie.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudianrRepositorie.saveAndFlush(e);
    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return etudianrRepositorie.findAll();
    }

    @Override
    public Etudiant findEtudiant(long ide) {
        return etudianrRepositorie.findById(ide).orElse(null);
    }

    @Override
    public void deleatEtudiant(long ide) {
etudianrRepositorie.deleteById(ide);
    }
}
