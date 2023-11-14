package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.repositories.ChambreRepositorie;


import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ChambreServicelmp implements IChambre{
    private ChambreRepositorie chambreRepositorie;

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepositorie.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepositorie.saveAndFlush(e);
    }

    @Override
    public List<Chambre> findAllChambre() {
        return chambreRepositorie.findAll();
    }

    @Override
    public Chambre findChambre(long ide) {
        return chambreRepositorie.findById(ide).orElse(null);
    }

    @Override
    public void deleatChambre(long ide) {
chambreRepositorie.deleteById(ide);
    }

    @Override
    public Set<Chambre> findChambreByBloc_nom(String bloc) {
        return chambreRepositorie.findChambreByBloc_NomBloc(bloc);
    }
}
