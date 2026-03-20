package com.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozi_store.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
