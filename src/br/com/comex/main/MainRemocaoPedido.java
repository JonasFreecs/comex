package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.PedidoDAO;
import br.com.comex.modelo.Pedido;

public class MainRemocaoPedido {
	
	public static void main(String[] args) throws SQLException {
		Pedido pedidoTesteRemocao = new Pedido(10L);
		Connection connection = new ConnectionFactory().recuperarConexao();
		PedidoDAO pedidoDAO = new PedidoDAO(connection);
		pedidoDAO.removePedido(pedidoTesteRemocao);
		
		connection.close();
	}
}
