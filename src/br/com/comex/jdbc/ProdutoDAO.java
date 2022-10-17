package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Tipo;

public class ProdutoDAO {
	
	private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}
	
public List<Produto> selecaoProdutos() throws SQLException {
		
		String sql = "SELECT * FROM COMEX.PRODUTO";
		
		List<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement comando = connection.prepareStatement(sql);
		ResultSet registros = comando.executeQuery();
		while (registros.next()) {
			Produto produto = new Produto( 
				registros.getString("nome"),
				registros.getString("descricao"),
				registros.getDouble("preco_unitario"),
				registros.getInt("quantidade_estoque"),
				registros.getInt("categoria_id"),
				Tipo.valueOf(registros.getString("tipo"))
			);
			
			produto.setId(registros.getLong("id"));
		 	produtos.add(produto);
		}
		registros.close();
		comando.close();
		return produtos;
	}
public void insereProduto(Produto produto) throws SQLException {
	
	String sql = "INSERT INTO COMEX.PRODUTO"
			+ "(nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo) " 
			+ "VALUES (? ,? ,? ,? ,? , ?)";
	PreparedStatement comando = connection.prepareStatement(sql);
	comando.setString(1, produto.getNome());
	comando.setString(2, produto.getDescricao());
	comando.setDouble(3, produto.getPrecoUnitario());
	comando.setInt(4, produto.getQuantidadeEstoque());
	comando.setInt(5, produto.getCategoriaId());
	comando.setString(6, produto.getTipo().name());
	
	comando.execute();
	System.out.println("Executado com sucesso! Use o método main listagem para verificar a inserção!");
	comando.close();
}

	public void removeProduto(Produto produto) throws SQLException {
		String sql = "DELETE FROM COMEX.PRODUTO WHERE ID = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setLong(1, produto.getId());
		
		comando.execute();
		
		System.out.println("Exclusao executada com sucesso! Utilize o método main listagem para verificar a exclusão!");
				
	}
	
	public void atualizaProduto(Produto produto) throws SQLException {
		String sql = "UPDATE COMEX.PRODUTO SET nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo = "
					+"?, ?, ?, ?, ?, ? WHERE ID = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setString(1, produto.getNome());
		comando.setString(2, produto.getDescricao());
		comando.setDouble(3, produto.getPrecoUnitario());
		comando.setInt(4, produto.getQuantidadeEstoque());
		comando.setInt(5, produto.getCategoriaId());
		comando.setString(6, produto.getTipo().name());
		comando.setLong(7,produto.getId());
		
		comando.execute();
		System.out.println("Executado com sucesso! Use o método main listagem para verificar a atualização!");
		comando.close();
	
	}

}




















