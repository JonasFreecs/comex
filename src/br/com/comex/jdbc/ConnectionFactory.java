package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	 
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		comboPooledDataSource.setUser("system");
		comboPooledDataSource.setPassword("12345");
		//Max pool size implementado apenas para testes, não afeta as tarefas em si
		comboPooledDataSource.setMaxPoolSize(15);;
		
		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
	}
}
