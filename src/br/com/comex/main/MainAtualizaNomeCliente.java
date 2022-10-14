package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainAtualizaNomeCliente {
	public static void main(String[] args) throws SQLException {
		//Dada as circunstâncias só foi implementado o comando de atualização do nome do cliente com base no ID
		//Os demais serão implementados posteriormente
		
		Cliente clienteTesteAtualizacaoNome = new Cliente(8, "JONAS RAMONES");
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		
		clienteDAO.atualizaCliente(clienteTesteAtualizacaoNome);
		connection.close();
	}
}
