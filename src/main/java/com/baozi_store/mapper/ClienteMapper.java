package com.baozi_store.mapper;

import com.baozi_store.dto.ClienteDTO;
import com.baozi_store.entity.Cliente;

public class ClienteMapper {
	
	public static ClienteDTO toDTO (Cliente cliente) {
		ClienteDTO dto = new ClienteDTO();
		
		dto.setId(cliente.getId());
		dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setClienteDesde(cliente.getClienteDesde());
        return dto;
	}
	
	public static Cliente toEntity (ClienteDTO dto) {
		Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setClienteDesde(dto.getClienteDesde());
        return cliente;
	}

}
