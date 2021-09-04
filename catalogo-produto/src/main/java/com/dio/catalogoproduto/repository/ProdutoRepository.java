package com.dio.catalogoproduto.repository;

import com.dio.catalogoproduto.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoRepository extends ElasticsearchRepository<Produto, Integer> {
}
