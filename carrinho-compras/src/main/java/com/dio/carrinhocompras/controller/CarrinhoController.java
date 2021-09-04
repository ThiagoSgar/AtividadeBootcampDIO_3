package com.dio.carrinhocompras.controller;

import com.dio.carrinhocompras.model.carrinho;
import com.dio.carrinhocompras.model.Item;
import com.dio.carrinhocompras.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @GetMapping(value = "/{id}")
    public Optional<Carrinho> findById(@PathVariable("id") Integer id){

        return carrinhoRepository.findById(id);
    }
    
    @PostMapping(value = "/{id}")
    public Carrinho addItem(@PathVariable("id") Integer id, @RequestBody Item item){
    	
        Optional<Carrinho> savedCarrinho = carrinhoRepository.findById(id);
        Carrinho Carrinho;
        if(savedCarrinho.equals(Optional.empty())){
            Carrinho = new Carrinho(id);
        }else{
            Carrinho = savedCarrinho.get();
        }
        carrinho.getItems().add(item);
        return carrinhoRepository.save(carrinho);
    }
    
    @DeleteMapping(value = "/{id}")
    public void clear(@PathVariable("id") Integer id){

        carrinhoRepository.deleteById(id);
    }
}
