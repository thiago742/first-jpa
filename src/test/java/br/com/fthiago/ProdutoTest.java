package br.com.fthiago;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

import br.com.fthiago.dao.IProdutoDAO;
import br.com.fthiago.dao.ProdutoDAO;
import br.com.fthiago.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		
		produto.setCodigo("5125");
		produto.setDtFabricacao(LocalDate.now());
		produto.setNome("Computador");
		produto.setQtdEstoque(12);
		produto.setPreco(1499.99);
		
		produto = produtoDAO.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());

	}
}
