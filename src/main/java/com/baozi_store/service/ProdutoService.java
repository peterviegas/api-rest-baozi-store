package com.baozi_store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.baozi_store.dto.ProdutoDTO;
import com.baozi_store.entity.Produto;
import com.baozi_store.mapper.ProdutoMapper;
import com.baozi_store.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public ProdutoDTO findById (Long id) {
		Produto produto = produtoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Produto com id: " + id + " não encontrado"));
		
		return ProdutoMapper.toDTO(produto);
	}
	
	public List<ProdutoDTO> findAll () {
		List<Produto> produtos = produtoRepository.findAll();
		
		return produtos.stream()
				.map(ProdutoMapper::toDTO)
				.collect(Collectors.toList());
	}
	
	public ProdutoDTO create (ProdutoDTO dto) {
		if (dto.getId() != null) {
			throw new IllegalArgumentException("Produto não deve contenter id para criação");
		}
		
		Produto produto = ProdutoMapper.toEntity(dto);
		
		produto = produtoRepository.save(produto);
		return ProdutoMapper.toDTO(produto);
	}
	
	public ProdutoDTO update (ProdutoDTO dto) {
		if (dto.getId() == null) {
			throw new IllegalArgumentException("Produto precisa conter id para criação");
		}
		
		Produto produto = produtoRepository.findById(dto.getId())
				.orElseThrow(() -> new RuntimeException("Produto com id" + dto.getId() + " não encontrado"));
		
		//Atualiza apenas os campos
		produto.setEstoque(dto.getEstoque());
		produto.setNome(dto.getNome());
		produto.setPreco(dto.getPreco());
		
		produto = produtoRepository.save(produto);
		return ProdutoMapper.toDTO(produto);
	}
	
	public void deletar(Long id) {
		produtoRepository.deleteById(id);
	}

}
