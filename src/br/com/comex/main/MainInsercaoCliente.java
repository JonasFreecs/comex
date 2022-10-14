package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainInsercaoCliente {
	public static void main(String[] args) throws SQLException {
	Cliente clienteTesteInsercao = new Cliente("JOEY RAMONES", "999999999", "3599999-9999", "RUA BLITKRIEG BOP" , 55, "SOMEBODY", "PUT SOMETHING" , "IN MY DRINK", "MG");
	
	Connection connection = new ConnectionFactory().recuperarConexao();
	
	ClienteDAO clienteDAO = new ClienteDAO(connection);
	clienteDAO.insereCliente(clienteTesteInsercao);
	
	connection.close();
	}
}
