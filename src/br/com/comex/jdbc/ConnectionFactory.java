package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	 
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//		IP da string de conexão tem que ser o ip do container que tem o banco oracle, ou utilizando bridge
		comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@172.17.0.2:1521:xe");
		comboPooledDataSource.setUser("system");
		comboPooledDataSource.setPassword("admin");
		comboPooledDataSource.setMaxPoolSize(15);;
		
		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
	}
}
