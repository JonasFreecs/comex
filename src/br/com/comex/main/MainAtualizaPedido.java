package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.PedidoDAO;
import br.com.comex.modelo.Pedido;

public class MainAtualizaPedido {
	public static void main(String[] args) throws SQLException {
		//Método atualiza o cliente com base no código do pedido, o primeiro parametro passado é o código do pedido a ser atualizado
		//o segundo parametro é o id do cliente para o qual o pedido será atualizado, por favor só utilize id de clientes que existam no BD.
		Pedido pedidoTesteRemocao = new Pedido(9L, 28);
		Connection connection = new ConnectionFactory().recuperarConexao();
		PedidoDAO pedidoDAO = new PedidoDAO(connection);
		pedidoDAO.atualizaPedido(pedidoTesteRemocao);
		
		connection.close();
	}
}
