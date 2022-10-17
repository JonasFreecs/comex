package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.ProdutoDAO;
import br.com.comex.modelo.Produto;

public class MainListagemProduto {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		List<Produto> listaDeProdutos = produtoDAO.selecaoProdutos();
		
		for (Produto produto : listaDeProdutos) {
			System.out.println(produto);
		}
		
		connection.close();
}
}
