package com.unisal.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import com.unisal.util.PropertyUtil;

public class ConnectionPool {
	private static ConnectionPool INSTANCE = null;
	private final Properties props;
	private static BasicDataSource dataSource;

	private ConnectionPool(Properties props) {
		this.props = props;
	}

	public static final synchronized ConnectionPool getInstance() throws IOException {
		if (INSTANCE == null) {
			final Properties props = PropertyUtil.getInstance().readFromClasspath("fretao.properties");
			if (props == null) {
				throw new FileNotFoundException(
						String.format("Dont possible find the db-config file: '%s'.", "fretao.properties"));
			}
			INSTANCE = new ConnectionPool(props);
		}
		return INSTANCE;
	}
	
	public Connection createConnectionComPool() throws SQLException, IOException, ClassNotFoundException {
		StringBuilder builder = new StringBuilder();
		builder.append(props.getProperty("jdbc.protocolo"));
		builder.append(props.getProperty("jdbc.host"));
		builder.append(":");
		builder.append(props.getProperty("jdbc.port"));
		builder.append("/");
		builder.append(props.getProperty("jdbc.database"));
		
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName((props.getProperty("jdbc.driver")));
		dataSource.setUrl(builder.toString());
		dataSource.setUsername(props.getProperty("jdbc.username"));
		dataSource.setPassword(props.getProperty("jdbc.password"));
		dataSource.setInitialSize(10);
		
		Connection connection = dataSource.getConnection();
		return connection;
	}
	
}
