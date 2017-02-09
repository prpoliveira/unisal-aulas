package br.unisal.produtos.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.unisal.produtos.dao.ProdutoDao;
import br.unisal.produtos.modelo.Produto;

@Resource
public class ProdutoController {

	private Result result;
	private ProdutoDao dao;

	public ProdutoController(Result result, ProdutoDao produtoDao) {
		this.result = result;
		this.dao = produtoDao;
	}

	public List<Produto> lista() {
		//Se quiser mudar o nome do atributo é só includar no result com o nome diferente
		result.include("lista", dao.lista());
		return dao.lista();
	}

	public void adiciona(Produto produto) {
		dao.adiciona(produto);
		result.redirectTo(ProdutoController.class).lista();
	}

	public void formulario() {
	}

	public void remove(Produto produto) {
		dao.remove(produto);
		//removendo para utilizar AJAX na página
		//result.redirectTo(ProdutoController.class).lista();
	}

}
