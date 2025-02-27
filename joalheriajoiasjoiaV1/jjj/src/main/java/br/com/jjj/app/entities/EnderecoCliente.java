package br.com.jjj.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_enderecoCliente")
public class EnderecoCliente {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_enderecoCliente", nullable = false)
	private Long id_enderecoCliente;
	
	@Column(name = "numero_casa", nullable = false)
	private String numero_casa;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "cep", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "complemento", nullable = false)
	private String complemento;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;
	//Construtores
	public EnderecoCliente() {
		
	}

	public EnderecoCliente(Long id_enderecoCliente, String numero_casa, String rua, String bairro, String cidade,
			String estado, String cep, String complemento, Cliente cliente) {
		this.id_enderecoCliente = id_enderecoCliente;
		this.numero_casa = numero_casa;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
		this.cliente = cliente;
	}

	//Getters e Setters
	public Long getId_enderecoCliente() {
		return id_enderecoCliente;
	}

	public void setId_enderecoCliente(Long id_enderecoCliente) {
		this.id_enderecoCliente = id_enderecoCliente;
	}

	public String getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(String numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}