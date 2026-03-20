package com.baozi_store.dto;

import com.baozi_store.entity.Cliente;
import com.baozi_store.entity.Produto;

public class PedidoDTO {

	 private Long id;
	 private Cliente cliente;
	 private Produto produto;
	 private Integer quantidade;
	 
	public PedidoDTO() {
	}

	public PedidoDTO(Long id, Cliente cliente, Produto produto, Integer quantidade) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	 
}
