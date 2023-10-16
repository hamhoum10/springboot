package tn.esprit.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.services.FoyerServicelmp;

import java.util.List;

@RestController
public class FoyerController {
    @Autowired
    private FoyerServicelmp foyerServicelmp;


    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer f){
       return foyerServicelmp.addFoyer(f);
    }
    @PutMapping("/updatefoyer")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return  foyerServicelmp.updateFoyer(f);
    }
    @GetMapping("/getallfoyer")
    public List<Foyer> findAllFoyer(){
        return foyerServicelmp.findAllFoyer();
    }
    @GetMapping("/getf/{idF}")
    public  Foyer findFoyerById(@PathVariable long idF){
        return foyerServicelmp.findFoyer(idF);

    }
    @DeleteMapping("/delatef/{idF}")
public void deleateFoyer(@PathVariable long idF){

        foyerServicelmp.deleatFoyer(idF);
}
}
