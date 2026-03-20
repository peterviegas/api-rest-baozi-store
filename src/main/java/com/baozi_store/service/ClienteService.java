package com.baozi_store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.baozi_store.dto.ClienteDTO;
import com.baozi_store.entity.Cliente;
import com.baozi_store.mapper.ClienteMapper;
import com.baozi_store.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public ClienteDTO findById (Long id) {
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Cliente com id: " + id + " não encontrado"));
		
		return ClienteMapper.toDTO(cliente);
	}
	
	public List<ClienteDTO> findAll () {
		List<Cliente> cliente = clienteRepository.findAll();
		
		return cliente.stream()
				.map(ClienteMapper::toDTO)
				.collect(Collectors.toList());
	}
	
	public ClienteDTO create (ClienteDTO dto) {
		if (dto.getId() != null) {
			throw new IllegalArgumentException("Novo cliente não deve ter ID");
		}
		
		Cliente cliente = ClienteMapper.toEntity(dto);
		cliente = clienteRepository.save(cliente);
		
		return ClienteMapper.toDTO(cliente);
	}
	
	public ClienteDTO update (ClienteDTO dto) {
		if (dto.getId() == null) {
			throw new IllegalArgumentException("ID é obrigatório para atualização");
		}
		
		Cliente cliente = clienteRepository.findById(dto.getId())
	            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
		
		//Atualiza apenas os campos
		cliente.setNome(dto.getNome());
		cliente.setClienteDesde(dto.getClienteDesde());
		
		cliente = clienteRepository.save(cliente);
		
		return ClienteMapper.toDTO(cliente);
	}
	
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
    }
}
