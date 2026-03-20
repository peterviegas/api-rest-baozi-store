package com.baozi_store.dto;

import java.math.BigDecimal;

public class ProdutoDTO {
	
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Boolean estoque;
    
    
	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String nome, BigDecimal preco, Boolean estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
    
}
