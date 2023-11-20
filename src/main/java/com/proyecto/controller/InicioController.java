package com.proyecto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author 
 */
@RestController
@CrossOrigin("*")
public class InicioController {
    
    @GetMapping("/")
    public String inicio() {
        return "<h1>Web Services  de Escuela(Springboot)</h1>";
    }
    
}
