package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.UniversiteServicelmp;

import java.util.List;

@AllArgsConstructor
@RestController
public class UniversiteController {

    private UniversiteServicelmp UniversiteServicelmp;


    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite f) {
        return UniversiteServicelmp.addUniversite(f);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite f) {
        return UniversiteServicelmp.updateUniversite(f);
    }

    @GetMapping("/Universites")
    public List<Universite> findAllUniversite() {
        return UniversiteServicelmp.findAllUniversite();
    }

    @GetMapping("/Universites/{idF}")
    public Universite findUniversiteById(@PathVariable long idF) {
        return UniversiteServicelmp.findUniversite(idF);

    }

    @DeleteMapping("/delateUniversites/{idF}")
    public void deleateUniversite(@PathVariable long idF) {

        UniversiteServicelmp.deleatUniversite(idF);
    }

}
