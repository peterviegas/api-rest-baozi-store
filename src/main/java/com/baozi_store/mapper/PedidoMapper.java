package com.baozi_store.mapper;

import com.baozi_store.dto.PedidoDTO;
import com.baozi_store.entity.Pedido;

public class PedidoMapper {

	public static PedidoDTO toDTO (Pedido pedido) {
		PedidoDTO dto = new PedidoDTO();
		
		dto.setCliente(pedido.getCliente());
		dto.setId(pedido.getId());
		dto.setProduto(pedido.getProduto());
		dto.setQuantidade(pedido.getQuantidade());
		
		return dto;
	}
	
	public static Pedido toEntity (PedidoDTO dto) {
		Pedido pedido = new Pedido();
		
		pedido.setCliente(dto.getCliente());
		pedido.setId(dto.getId());
		pedido.setProduto(dto.getProduto());
		pedido.setQuantidade(dto.getQuantidade());
		
		return pedido;
	}
}
