package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		Categoria testeInsercaoCategoria = new Categoria("CATEGORIA TESTE5", Status.ATIVA);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		categoriaDAO.insereCategoria(testeInsercaoCategoria);
		connection.close();
	}
}

// IMPLEMENTAÇÃO PRÉ DAO
//public class MainInsercaoCategoria {
//	public static void main(String[] args) throws SQLException {
//		String[] nomeDaCategoria = new String[3]; 
//		String[] situacao = new String[3];
//		nomeDaCategoria[0] = "INFORMATICA";
//		nomeDaCategoria[1] = "MOVEIS";
//		nomeDaCategoria[2] = "LIVROS";
//		situacao[0] = "ATIVA";
//		situacao[1] = "INATIVA";
//		situacao[2] = "ATIVA";
//
//		
//		String sql = "INSERT INTO COMEX.CATEGORIA (nome, status) VALUES (?, ?)";
//		
//		ConnectionFactory connectionFactory = new ConnectionFactory();
//		Connection connection = connectionFactory.recuperarConexao();
//		
//		for (int i=0; i<3; i++) {
//			PreparedStatement comando = connection.prepareStatement(sql);
//			System.out.println("Preparou o statement");
//			comando.setString(1, nomeDaCategoria[i]);
//			System.out.println("leu nomedacategoria");
//			comando.setString(2, situacao[i]);
//			System.out.println("leu a situacao");
////			ResultSet registros = comando.executeQuery();
////			comando.execute();
////			while (registros.next()) {
////				System.out.printf("Categoria: %s. Situacao %s.\n ", 
////						registros.getString("nome"), 
////						registros.getString("status"));
//			comando.execute();
//			System.out.println("Executou");
//			comando.close();
//			}
//			System.out.println("OK");
//			connection.close();
//	}
//
//}
