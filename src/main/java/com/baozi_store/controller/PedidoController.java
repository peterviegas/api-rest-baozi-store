package com.baozi_store.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baozi_store.dto.PedidoDTO;
import com.baozi_store.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.findById(id));
    }
    
    @GetMapping
    public ResponseEntity< List<PedidoDTO>> findAll() {
    	return ResponseEntity.ok(pedidoService.findAll());
    }
    
    @PostMapping
    public ResponseEntity<PedidoDTO> create(@RequestBody PedidoDTO pedidoDTO) {
        return ResponseEntity.ok(pedidoService.create(pedidoDTO));
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> update(@RequestBody PedidoDTO pedidoDTO) {
        return ResponseEntity.ok(pedidoService.update(pedidoDTO));
    }    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
    	pedidoService.deletar(id);
    	return ResponseEntity.noContent().build();
    }

}
