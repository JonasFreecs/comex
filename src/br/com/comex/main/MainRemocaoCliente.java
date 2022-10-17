package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainRemocaoCliente {
	public static void main(String[] args) throws SQLException {
		//Método exclui cliente com base no id
		Cliente clienteTestaRemocao = new Cliente(9);
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		clienteDAO.removeCliente(clienteTestaRemocao);
		connection.close();
	}
}
