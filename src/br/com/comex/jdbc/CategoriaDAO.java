package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class CategoriaDAO {
	
	private Connection connection;
	
		
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public List<Categoria> selecaoCategorias() throws SQLException {
		
		String sql = "SELECT * FROM COMEX.CATEGORIA";
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		PreparedStatement comando = connection.prepareStatement(sql);
		ResultSet registros = comando.executeQuery();
		while (registros.next()) {
			Categoria categoria = new Categoria( 
				registros.getString("nome"), 
				Status.valueOf(registros.getString("status"))
			);
			
			categoria.setId(registros.getLong("id"));
		 	categorias.add(categoria);
		}
		registros.close();
		comando.close();
		return categorias;
	}
	
	public void insereCategoria(Categoria categoria) throws SQLException {
		

		
		String sql = "INSERT INTO COMEX.CATEGORIA (nome, status) VALUES (?, ?)";
		
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setString(1, categoria.getCategoriaNome());
		comando.setString(2, categoria.getStatus().name());
		System.out.println("Pronto para executar");
		comando.execute();
		comando.close();
	}
	
	public void atualizaCategoria(Categoria categoria) throws SQLException {
		String sql = "UPDATE COMEX.CATEGORIA SET nome = ? , status = ? WHERE id = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setString(1, categoria.getCategoriaNome());
		comando.setString(2, categoria.getStatus().name());
		comando.setLong(3, categoria.getId());
		comando.execute();
		comando.close();
	}
	public void removeCategoria(Categoria categoria) throws SQLException {
		String sql = "DELETE FROM COMEX.CATEGORIA WHERE ID = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setLong(1, categoria.getId());
		comando.execute();
		comando.close();
	}
	
}

	
