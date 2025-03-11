package br.com.jjj.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jjj.app.entities.Produto;
import br.com.jjj.app.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public List<Produto> buscarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto buscarProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public Produto criarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void excluirProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
