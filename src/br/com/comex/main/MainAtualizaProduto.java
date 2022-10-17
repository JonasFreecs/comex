package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.ProdutoDAO;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Tipo;

public class MainAtualizaProduto {
	public static void main(String[] args) throws SQLException {
		//Método atualiza os campos conforme o id do produto, que é o primeiro parametro passado no construtor.
		Produto produtoTesteAtualizacao = new Produto( 70L,"Iphone 14S","Celular",1500.99,5,69,Tipo.NAO_ISENTO);
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		produtoDAO.atualizaProduto(produtoTesteAtualizacao);
		connection.close();
	}
}
