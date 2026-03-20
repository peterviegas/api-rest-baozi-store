package com.baozi_store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate clienteDesde;

	public Cliente() {
	}

	public Cliente(Long id, String nome, LocalDate clienteDesde) {
		super();
		this.id = id;
		this.nome = nome;
		this.clienteDesde = clienteDesde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(LocalDate clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
    
}
