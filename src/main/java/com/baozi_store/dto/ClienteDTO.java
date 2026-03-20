package com.baozi_store.dto;

import java.time.LocalDate;

public class ClienteDTO {
	
	private Long id;
    private String nome;
    private LocalDate clienteDesde;
    
	public ClienteDTO() {
	}
	
	public ClienteDTO(Long id, String nome, LocalDate clienteDesde) {
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
