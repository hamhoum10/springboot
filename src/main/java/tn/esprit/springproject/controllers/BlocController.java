package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.TypeChambre;
import tn.esprit.springproject.services.BlocServicelmp;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
public class BlocController {

    private BlocServicelmp BlocServicelmp;


    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc f) {
        return BlocServicelmp.addBloc(f);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc f) {
        return BlocServicelmp.updateBloc(f);
    }

    @GetMapping("/Blocs")
    public List<Bloc> findAllBloc() {
        return BlocServicelmp.findAllBloc();
    }

    @GetMapping("/Blocs/{idF}")
    public Bloc findBlocById(@PathVariable long idF) {
        return BlocServicelmp.findBloc(idF);

    }

    @DeleteMapping("/delateBlocs/{idF}")
    public void deleateBloc(@PathVariable long idF) {

        BlocServicelmp.deleatBloc(idF);
    }
    @GetMapping("/getblocbychambre/{typeC}")
    public Set<Bloc> findBlocByChambresTypeCLike(@PathVariable TypeChambre typeC){
        return BlocServicelmp.findBlocByChambresTypeCLike(typeC);
    }

}
