package br.com.jjj.app.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", nullable = false)
	private Long id_cliente;
	
	@Column(name = "nomeCliente", length = 100, nullable = false)
	private String nomeCliente;
	
	@Column(name = "cpf", length = 11, unique = true, nullable = false)
	private String cpf;
	
	@Column(name = "emailCliente", length = 50, nullable = false, unique = true)
	private String emailCliente;
	
	@Column(name = "telefoneCliente", length = 15, unique = false, nullable = false)
	private String telefoneCliente;
	
	@Column(name = "dt_nascimento", unique = false)
	private LocalDate dt_nascimento;
	
	//Construtores
	public Cliente() {
		
	}
	public Cliente(Long id_cliente, String nomeCliente, String cpf, String emailCliente, String telefoneCliente,
			LocalDate dt_nascimento) {
		this.id_cliente = id_cliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.emailCliente = emailCliente;
		this.telefoneCliente = telefoneCliente;
		this.dt_nascimento = dt_nascimento;
	}
	
	//Getters e Setters
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
