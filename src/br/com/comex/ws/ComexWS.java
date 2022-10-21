package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.jdbc.CategoriaDAO;
import br.com.comex.jdbc.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.jdbc.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;
@WebService
public class ComexWS {
	@WebMethod(operationName="listarCategorias")	
	public List<Categoria> getCategoria() throws SQLException	{
		Connection connection = new ConnectionFactory().recuperarConexao();
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		List<Categoria> listaDeCategorias = categoriaDao.selecaoCategorias();
		
		for (Categoria categoria : listaDeCategorias) {
			System.out.println(categoria);
		}
		connection.close();
		return listaDeCategorias;
	}
	public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		categoriaDAO.insereCategoria(categoria);
		connection.close();
		return categoria;
	}
	public List<Cliente> listarClientes() throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		List<Cliente> listaDeClientes = clienteDAO.selecaoClientes();
		
		for (Cliente cliente : listaDeClientes) {
			System.out.println(cliente);
		}
		
		connection.close();
		return listaDeClientes;
	}
	
	public Cliente adicionarCliente(Cliente cliente) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
			
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		clienteDAO.insereCliente(cliente);
			
			connection.close();
			return cliente;
	}
	public List<Produto> listarProdutos() throws SQLException  {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		List<Produto> listaDeProdutos = produtoDAO.selecaoProdutos();
		
		for (Produto produto : listaDeProdutos) {
			System.out.println(produto);
		}
		
		connection.close();
		return listaDeProdutos;
	}
}
