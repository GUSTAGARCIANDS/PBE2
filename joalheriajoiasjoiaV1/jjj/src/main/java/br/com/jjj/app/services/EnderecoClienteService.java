package br.com.jjj.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jjj.app.entities.EnderecoCliente;
import br.com.jjj.app.repositories.EnderecoClienteRepository;

@Service
public class EnderecoClienteService {
	
	@Autowired
	EnderecoClienteRepository enderecoClienteRepository;
	
	public List<EnderecoCliente> buscarEnderecosClientes() {
		   return enderecoClienteRepository.findAll();
		}
		 
	public EnderecoCliente buscarEnderecoClientePorId(Long id) {
		 	return enderecoClienteRepository.findById(id).orElse(null);
		}
		    
	public EnderecoCliente criarEnderecoCliente(EnderecoCliente enderecoCliente) {
		   return enderecoClienteRepository.save(enderecoCliente);
		}
		 
	public void excluirEnderecoCliente(Long id) {
			enderecoClienteRepository.deleteById(id);
		}

}
