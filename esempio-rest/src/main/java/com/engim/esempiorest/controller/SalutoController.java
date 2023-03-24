package com.engim.esempiorest.controller;

import com.engim.esempiorest.model.Nomi;
import com.engim.esempiorest.model.Saluto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SalutoController {

    /*ESERCIZIO: rest api get "/aggiungi" nome
                              "/elenco"
                              "/cancella" nome
    * */
    private static List<String> nomi = new ArrayList<>();

    @GetMapping("/saluto")
    public Saluto getSaluto(
            @RequestParam(value = "nome", defaultValue = "mondo")
                    String name)
    {
        return new Saluto(0,"Ciao "+name+"!");
    }

    @GetMapping("/add")
    public String addNome( @RequestParam(value = "nome") String name){
        Nomi.getNomi().add(name);
        return "OK";
    }

    @GetMapping("/elenco")
    public List<String> getElenco(){
        return Nomi.getNomi();
    }


    @GetMapping("/delete")
    public String deleteNome( @RequestParam(value = "nome") String name){
        if(Nomi.getNomi().contains(name)){
            Nomi.getNomi().remove(name);
            return "OK";
        }else{
            return "Non esiste";
        }
    }


}
