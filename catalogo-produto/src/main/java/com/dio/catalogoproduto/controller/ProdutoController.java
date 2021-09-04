package com.dio.catalogoproduto.controller;

import com.dio.catalogoproduto.model.Produto;
import com.dio.catalogoproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    Produto create(@RequestBody Produto produto){

        return produtoRepository.save(produto);
    }

   @GetMapping(value="/{id}")
   Optional<Produto> findById(@PathVariable Integer id){

        return produtoRepository.findById(id);
   }
}
