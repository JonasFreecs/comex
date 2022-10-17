package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.ProdutoDAO;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Tipo;

public class MainInsercaoProduto {
	public static void main(String[] args) throws SQLException {
		//Campo apontado pela seta abaixo é o campo do id da categoria já existente no banco de dados, para testes sempre utilize uma categoria pré existente no banco na hora da inserção se não dará erro:
		//------------------------------------------------------------------------------------|-------------------
		//------------------------------------------------------------------------------------|-------------------
		//------------------------------------------------------------------------------------v-------------------
		Produto produtoTesteInsercao = new Produto("Iphone 14S","Celular",1500.99,5,69,Tipo.NAO_ISENTO);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		produtoDAO.insereProduto(produtoTesteInsercao);
		
		connection.close();
	}
}
