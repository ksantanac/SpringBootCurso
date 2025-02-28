package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    // /calculadora/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public String somar(@PathVariable int a, @PathVariable int b){
        return "A soma de " + a + " + " + b + " => " + (a + b);
    }


    // /calculadora/subtrair?a=100&b=39
    @GetMapping(path = "/subtrair")
    public String subtrair(
            @RequestParam(name = "a", defaultValue = "0") int a,
            @RequestParam(name = "b", defaultValue = "0") int b
    ){
        return "A subtração de " + a + " - " + b + " => " + (a - b);
    }
}
