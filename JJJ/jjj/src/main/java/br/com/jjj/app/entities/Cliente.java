package br.com.jjj.app.entities;

import java.util.Date;

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
	
	@Column(name = "nome_cliente", length = 100, nullable = false)
	private String nome_cliente;
	
	@Column(name = "cpf", length = 11, unique = true, nullable = false)
	private String cpf;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "telefone_cliente", length = 15, unique = false, nullable = false)
	private String telefone_cliente;
	
	@Column(name = "dt_nascimento", nullable = false, unique = false)
	private Date dt_nascimento;
	
	//Construtores
	public Cliente() {
		
	}
	public Cliente(Long id_cliente, String nome_cliente, String cpf, String email, String telefone_cliente,
			Date dt_nascimento) {
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.email = email;
		this.telefone_cliente = telefone_cliente;
		this.dt_nascimento = dt_nascimento;
	}
	
	//Getters e Setters
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone_cliente() {
		return telefone_cliente;
	}
	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
