package com.baozi_store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.baozi_store.dto.PedidoDTO;
import com.baozi_store.entity.Pedido;
import com.baozi_store.exception.ResourceNotFoundException;
import com.baozi_store.mapper.PedidoMapper;
import com.baozi_store.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final PedidoRepository pedidoRepository;
	
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	public PedidoDTO findById (Long id) {
		Pedido pedido = pedidoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pedido com id: " + id + " não encontrado"));
				
		return PedidoMapper.toDTO(pedido);
	}
	
	public List<PedidoDTO> findAll (){
		List<Pedido> pedidos = pedidoRepository.findAll();
		
		return pedidos.stream()
				.map(PedidoMapper::toDTO)
				.collect(Collectors.toList());
	}
	
	public PedidoDTO create (PedidoDTO dto) {
		if ( dto.getId() != null) {
			throw new IllegalArgumentException("Pedido não pode ter o id preenchido para criação");
		}
		
		Pedido pedido = PedidoMapper.toEntity(dto);
		
		pedido = pedidoRepository.save(pedido);
		
		return PedidoMapper.toDTO(pedido);
		
	}
	
	public PedidoDTO update (Long id, PedidoDTO dto) {
		if ( dto.getId() == null) {
			throw new IllegalArgumentException("Pedido não pode ter o id null");
		}
		
		Pedido pedido = pedidoRepository.findById(dto.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Pedido com id: " + dto.getId() + " não encontrado"));
		
		pedido.setCliente(dto.getCliente());
		pedido.setProduto(dto.getProduto());
		pedido.setQuantidade(dto.getQuantidade());
		
		pedido = pedidoRepository.save(pedido);
		
		return PedidoMapper.toDTO(pedido);
		
	}
	
	public void deletar (Long id) {
		pedidoRepository.deleteById(id);
	}
	
	
}
