package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.jdbc.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainListagemCliente {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		List<Cliente> listaDeClientes = clienteDAO.selecaoClientes();
		
		for (Cliente cliente : listaDeClientes) {
			System.out.println(cliente);
		}
		
		connection.close();
	}
}
