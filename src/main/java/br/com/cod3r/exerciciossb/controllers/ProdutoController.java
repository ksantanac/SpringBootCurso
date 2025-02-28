package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoPorduto(
            @RequestParam String nome, @RequestParam double preco, @RequestParam double desconto
            ) {
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);

        return produto;
    }
}
