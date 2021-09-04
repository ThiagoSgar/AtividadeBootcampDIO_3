package com.dio.carrinhocompras.repository;

import com.dio.carrinhocompras.model.Carrinho;
import org.springframework.data.repository.CrudRepository;


public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer> {
}
