package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.PedidoDAO;
import br.com.comex.modelo.Pedido;



public class MainListagemPedido {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		PedidoDAO pedidoDAO = new PedidoDAO(connection);
		List<Pedido> listaDePedidos = pedidoDAO.selecaoPedidos();
		
		for (Pedido pedido : listaDePedidos) {
			System.out.println(pedido);
		}
		
		connection.close();
	}
}
