package com.dio.carrinhocompras.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("carrinho")
public class Carrinho {
    @Id
    private Integer id;
    private List<Item> itens;

    public Carrinho(){

    }

    public Carrinho(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItens() {
        if(itens == null){
            itens = new ArrayList<>();
        }
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
