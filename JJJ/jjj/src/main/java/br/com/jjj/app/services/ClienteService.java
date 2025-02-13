package br.com.jjj.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jjj.app.entities.Cliente;
import br.com.jjj.app.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> buscarClientes() {
		   return clienteRepository.findAll();
		}
		 
	public Cliente buscarClientePorId(Long id) {
		 	return clienteRepository.findById(id).orElse(null);
		}
		    
	public Cliente buscarClientePorCpf(String cpf) {
		   return clienteRepository.findByCpf(cpf);
		}
		 
	public Cliente criarCliente(Cliente cliente) {
		   return clienteRepository.save(cliente);
		}
		 
	public void excluirCliente(Long id) {
			clienteRepository.deleteById(id);
		}
}
