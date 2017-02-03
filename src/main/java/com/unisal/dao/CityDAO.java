package com.unisal.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unisal.model.City;

/**
 * 
 * @author JETHER ROIS
 *
 */
public class CityDAO extends GenericDAO{
	private static final CityDAO INSTANCE = new CityDAO();
	
	private CityDAO(){
	}
	
	public static final CityDAO getInstance(){
		return INSTANCE;
	}
	
	public List<City> getCities() throws ClassNotFoundException, SQLException, IOException{
		String sql = "SELECT id, nome, geocodigo, latitude, longitude FROM cidade";
		List<City> cities = new ArrayList<>();
		
		List<Object[]> objects = executaSqlSemParametro(getConnection(), sql);
		if (objects != null) {
			for (Object[] os : objects) {
				cities.add(castObjectToCity(os));
			}
		}
		return cities;
	}
	
	public void insert(){
		
	}
	
	private City castObjectToCity(Object[] os){
		City city = new City();
		city.setId((Long)os[0]);
		city.setNome((String)os[1]);
		city.setGeocodigo((Double)os[2]);
		city.setLatitude((Double)os[3]);
		city.setLongitude((Double)os[4]);
		
		return city;
	}
}
