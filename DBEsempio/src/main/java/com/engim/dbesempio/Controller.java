package com.engim.dbesempio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/persone")
    public List<Persona> getPersone(){
        return PersonaRepository.getPersone();
    }
}
