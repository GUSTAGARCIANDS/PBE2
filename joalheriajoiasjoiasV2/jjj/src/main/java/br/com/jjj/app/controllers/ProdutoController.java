package br.com.jjj.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jjj.app.entities.Produto;
import br.com.jjj.app.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
    public List<Produto> buscarProdutos() {
        return produtoService.buscarProdutos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarProdutoPorId(@PathVariable Long id){
    	Produto produto = produtoService.buscarProdutoPorId(id);
    	
    	if(produto != null) {
    		return ResponseEntity.ok(produto);
    	}
    	else {
    		return ResponseEntity.status(404).body("O Produto com ID" + id + " não foi encontrado.");
    	}
    }
    
    @PutMapping
	public Produto editarProduto(@RequestBody Produto produto) {
		return produtoService.criarProduto(produto);
	}
  
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
    	produtoService.excluirProduto(id);
	}
}
