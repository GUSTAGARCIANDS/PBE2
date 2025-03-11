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

import br.com.jjj.app.entities.EnderecoCliente;
import br.com.jjj.app.services.EnderecoClienteService;

@RestController
@RequestMapping("/enderecoclientes")
public class EnderecoClienteController {

	@Autowired 
	EnderecoClienteService enderecoClienteService;
	
	 @GetMapping
	    public List<EnderecoCliente> buscarEnderecosClientes() {
	        return enderecoClienteService.buscarEnderecosClientes();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Object> buscarEnderecoClientePorId(@PathVariable Long id){
	    	EnderecoCliente enderecoCliente = enderecoClienteService.buscarEnderecoClientePorId(id);
	    	
	    	if(enderecoCliente != null) {
	    		return ResponseEntity.ok(enderecoCliente);
	    	}
	    	else {
	    		return ResponseEntity.status(404).body("O Endereço do cliente com ID" + id + " não foi encontrado.");
	    	}
	    }
	    
	    @PostMapping
	    public EnderecoCliente criarEnderecoCliente(@RequestBody EnderecoCliente enderecoCliente) {
	        return enderecoClienteService.criarEnderecoCliente(enderecoCliente);
	    }
	    
	    @PutMapping
		public EnderecoCliente editarEnderecoCliente(@RequestBody EnderecoCliente enderecoCliente) {
			return enderecoClienteService.criarEnderecoCliente(enderecoCliente);
		}

	    @DeleteMapping("/{id}")
	    public void excluirEnderecoCliente(@PathVariable Long id) {
			enderecoClienteService.excluirEnderecoCliente(id);
		}
}
