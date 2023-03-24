package com.engim.esempiospring.controller;

import com.engim.esempiospring.model.Saluto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutoController {

    @GetMapping("/saluto")
    public Saluto getSaluto(){
        return new Saluto(0,"Ciao!");
    }

}
