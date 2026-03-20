package com.baozi_store.mapper;

import com.baozi_store.dto.ProdutoDTO;
import com.baozi_store.entity.Produto;

public class ProdutoMapper {
	public static ProdutoDTO toDTO (Produto produto) {
		ProdutoDTO dto = new ProdutoDTO();
		
		dto.setId(produto.getId());
		dto.setEstoque(produto.getEstoque());
		dto.setNome(produto.getNome());
		dto.setPreco(produto.getPreco());
		
		return dto;
	}
	
	public static Produto toEntity (ProdutoDTO dto) {
		Produto produto = new Produto();
		
		produto.setId(dto.getId());
		produto.setEstoque(dto.getEstoque());
		produto.setNome(dto.getNome());
		produto.setPreco(dto.getPreco());
		
		return produto;
	}
}
