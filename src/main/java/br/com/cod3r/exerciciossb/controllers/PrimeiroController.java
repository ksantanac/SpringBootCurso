package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Olá Spring Boot!";
    }


}
