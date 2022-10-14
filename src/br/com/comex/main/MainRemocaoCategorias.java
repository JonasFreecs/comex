package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainRemocaoCategorias {
	public static void main (String[] args) throws SQLException {
		
		Categoria testeRemocaoCategoria = new Categoria(71L);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		categoriaDAO.removeCategoria(testeRemocaoCategoria);
		connection.close();
		
		
		
	}
}
