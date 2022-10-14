package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class MainAtualizaCategoria {

	public static void main(String[] args) throws SQLException {
		// Classe atualiza o nome e status da categoria com base no Id.
		Categoria testeAtualizacaoCategoria = new Categoria(69L, "INFORMATICA TESTE", Status.ATIVA);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		categoriaDAO.atualizaCategoria(testeAtualizacaoCategoria);
		connection.close();
		
	}

}
