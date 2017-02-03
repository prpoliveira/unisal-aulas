package com.unisal.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.unisal.util.PropertyUtil;

/**
 * 
 * @author JETHER ROIS
 *
 */
public class ConnectionFactory {
	
	private static ConnectionFactory INSTANCE = null;
	private final Properties props;
	
	private ConnectionFactory(Properties props) {
		this.props = props;
	}
	
	public static final synchronized ConnectionFactory getInstance() throws IOException {
		if(INSTANCE == null) {
			final Properties props = PropertyUtil.getInstance().readFromClasspath("fretao.properties");
			if(props == null) {
				throw new FileNotFoundException(String.format("Dont possible find the db-config file: '%s'.", "ws-db-config.properties"));
			}
			INSTANCE = new ConnectionFactory(props); 
		}
		return INSTANCE;
	}
	

	public Connection createConnection() throws SQLException, IOException, ClassNotFoundException {
		StringBuilder builder = new StringBuilder();
		builder.append(props.getProperty("jdbc.protocolo"));
		builder.append(props.getProperty("jdbc.host"));
		builder.append(":");
		builder.append(props.getProperty("jdbc.port"));
		builder.append("/");
		builder.append(props.getProperty("jdbc.database"));
						
		Class.forName(props.getProperty("jdbc.driver"));
		Connection connection = DriverManager.getConnection(
				builder.toString(),
				props.getProperty("jdbc.username"),
				props.getProperty("jdbc.password"));
		return connection;
	}

}
