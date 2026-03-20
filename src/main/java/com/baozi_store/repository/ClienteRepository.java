package com.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozi_store.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
