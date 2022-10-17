package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.ProdutoDAO;
import br.com.comex.modelo.Produto;


public class MainRemocaoProduto {
	public static void main(String[] args) throws SQLException {
		//Método exclui produto com base no id
		Produto produtoTestaRemocao = new Produto(9L);
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		produtoDAO.removeProduto(produtoTestaRemocao);
		connection.close();
	}
}
