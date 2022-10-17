package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Pedido;

public class PedidoDAO {
	Connection connection;
	
	
	public PedidoDAO(Connection connection) {
		this.connection = connection;
	}
	
public List<Pedido> selecaoPedidos() throws SQLException {
		
		String sql = "SELECT * FROM COMEX.PEDIDO";
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		PreparedStatement comando = connection.prepareStatement(sql);
		ResultSet registros = comando.executeQuery();
		while (registros.next()) {
			Pedido pedido = new Pedido( 
				registros.getString("data"),
				registros.getInt("cliente_id")
			);
			
			pedido.setId(registros.getLong("id"));
		 	pedidos.add(pedido);
		}
		registros.close();
		comando.close();
		return pedidos;
	}
	public void inserePedido(Pedido pedido) throws SQLException {
		String sql = "INSERT INTO COMEX.PEDIDO (data, cliente_id) VALUES (to_date(sysdate, 'DD/MM/YYYY'), ?)";
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setInt(1, pedido.getId_cliente());
		
		
		comando.execute();
		System.out.println("Executado com sucesso! Use o método main listagem para verificar a inserção!");
		comando.close();
	}
	
	public void removePedido (Pedido pedido) throws SQLException {
		String sql = "DELETE FROM COMEX.PEDIDO WHERE id = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setLong(1, pedido.getId());
		
		comando.execute();
		System.out.println("Executado com sucesso! Use o método main listagem para verificar a remoção!");
		comando.close();
	}
	public void atualizaPedido(Pedido pedido) throws SQLException {
		String sql = "UPDATE COMEX.PEDIDO SET cliente_id = ? WHERE id = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setInt(1, pedido.getId_cliente());
		comando.setLong(2, pedido.getId());
		
		comando.execute();
		System.out.println("Executado com sucesso! Use o método main listagem para verificar a atualização!");
		comando.close();
	}
}
