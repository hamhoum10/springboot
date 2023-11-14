package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.entites.TypeChambre;
import tn.esprit.springproject.services.ChambreServicelmp;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
public class ChambreController {

    private ChambreServicelmp ChambreServicelmp;


    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre f) {
        return ChambreServicelmp.addChambre(f);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre f) {
        return ChambreServicelmp.updateChambre(f);
    }

    @GetMapping("/Chambres")
    public List<Chambre> findAllChambre() {
        return ChambreServicelmp.findAllChambre();
    }

    @GetMapping("/Chambres/{idF}")
    public Chambre findChambreById(@PathVariable long idF) {
        return ChambreServicelmp.findChambre(idF);

    }

    @DeleteMapping("/delateChambres/{idF}")
    public void deleateChambre(@PathVariable long idF) {

        ChambreServicelmp.deleatChambre(idF);
    }
    @GetMapping("/getchmbreby_bloc/{bloc}")
    public Set<Chambre> findBlocByChambresTypeCLike(@PathVariable String bloc){
        return ChambreServicelmp.findChambreByBloc_nom(bloc);
    }


}
