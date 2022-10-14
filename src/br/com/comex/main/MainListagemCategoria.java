package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.jdbc.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainListagemCategoria {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		List<Categoria> listaDeCategorias = categoriaDao.selecaoCategorias();
		
		for (Categoria categoria : listaDeCategorias) {
			System.out.println(categoria);
		}
		
		connection.close();
	}
}
