package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;

public class ClienteDAO {
	
	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public List<Cliente> selecaoClientes() throws SQLException {
		
		String sql = "SELECT * FROM COMEX.CLIENTE";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		PreparedStatement comando = connection.prepareStatement(sql);
		ResultSet registros = comando.executeQuery();
		while (registros.next()) {
			Cliente cliente = new Cliente( 
				registros.getString("nome"), 
				registros.getString("cpf"),
				registros.getString("telefone"),
				registros.getString("rua"),
				registros.getInt("numero"),
				registros.getString("complemento"),
				registros.getString("bairro"),
				registros.getString("cidade"),
				registros.getString("uf")
			);
			
			cliente.setId(registros.getInt("id"));
		 	clientes.add(cliente);
		}
		registros.close();
		comando.close();
		return clientes;
	}
	
	public void insereCliente(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO COMEX.CLIENTE(NOME, CPF, TELEFONE, RUA, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF) VALUES ( ? , ? , ? , ? , ? , ? , ? , ?, ?)";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getCpf());
		comando.setString(3, cliente.getTelefone());
		comando.setString(4, cliente.getRua());
		comando.setInt(5, cliente.getNumero());
		comando.setString(6, cliente.getComplemento());
		comando.setString(7, cliente.getCidade());
		comando.setString(8, cliente.getBairro());
		comando.setString(9, cliente.getEstado());
		
		comando.execute();
		System.out.println("Executado com sucesso! Use o método main listagem para verificar");
		comando.close();
	}
	public void atualizaCliente (Cliente cliente) throws SQLException {
			String sql = "UPDATE COMEX.CLIENTE SET nome = ?  WHERE id = ?";
			
			PreparedStatement comando = connection.prepareStatement(sql);
			comando.setString(1, cliente.getNome());
			comando.setInt(2, cliente.getId());
			comando.execute();
			System.out.println("Comando finalizado");
			comando.close();
			
			
		}
	public void removeCliente(Cliente cliente) throws SQLException {
		String sql = "DELETE FROM COMEX.CLIENTE WHERE ID = ?";
		
		PreparedStatement comando = connection.prepareStatement(sql);
		comando.setLong(1, cliente.getId());
		comando.execute();
		System.out.println("Exclusao feita com sucesso\n\n Utilize a classe MainListagemCliente para verificar!");
		comando.close();
	}
	}
