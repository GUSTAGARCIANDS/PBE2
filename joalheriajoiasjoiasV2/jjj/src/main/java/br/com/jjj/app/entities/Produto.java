package br.com.jjj.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column(name = "nome_produto", nullable = false, length = 100)
	private String nome_produto;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	@Column(name = "cor", nullable = false)
	private String cor;
	
	//Construtores
	public Produto() {
		
	}

	public Produto(Long id_produto, String nome_produto, double preco, String cor) {
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.preco = preco;
		this.cor = cor;
	}

	//Getters e Setters
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
