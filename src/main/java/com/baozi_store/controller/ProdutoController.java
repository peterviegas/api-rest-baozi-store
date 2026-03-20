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

import com.baozi_store.dto.ProdutoDTO;
import com.baozi_store.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findById(id));
    }
    
    @GetMapping
    public ResponseEntity< List<ProdutoDTO>> findAll() {
    	return ResponseEntity.ok(produtoService.findAll());
    }
    
    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok(produtoService.create(produtoDTO));
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> update(@RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok(produtoService.update(produtoDTO));
    }    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
    	produtoService.deletar(id);
    	return ResponseEntity.noContent().build();
    }

}
