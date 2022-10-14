package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainTesteConexao {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		System.out.println("Conexao efetuada com sucesso!");
		
		connection.close();
	}
}
