package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.services.EtudiantServicelmp;

import java.util.List;
@AllArgsConstructor
@RestController
public class EtudiantController {

    private EtudiantServicelmp EtudiantServicelmp;


    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant f) {
        return EtudiantServicelmp.addEtudiant(f);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant f) {
        return EtudiantServicelmp.updateEtudiant(f);
    }

    @GetMapping("/Etudiants")
    public List<Etudiant> findAllEtudiant() {
        return EtudiantServicelmp.findAllEtudiant();
    }

    @GetMapping("/Etudiants/{idF}")
    public Etudiant findEtudiantById(@PathVariable long idF) {
        return EtudiantServicelmp.findEtudiant(idF);

    }

    @DeleteMapping("/delateEtudiants/{idF}")
    public void deleateEtudiant(@PathVariable long idF) {

        EtudiantServicelmp.deleatEtudiant(idF);
    }

}
