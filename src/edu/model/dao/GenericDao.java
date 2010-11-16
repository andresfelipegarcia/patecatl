package edu.model.dao;

import edu.conexion.DataAccess;

public class GenericDao {
	DataAccess DAL;
	
	public DataAccess getConexion() throws Exception{
		if(DAL == null){
			DAL = new DataAccess();
		}
		return DAL;
	}
    
	public boolean openConexion(DataAccess con) throws Exception{
    	return con.openConection();
    }
    
	public boolean closeConexion(DataAccess con) throws Exception{
    	return con.closeConection();
    }
    
    
}
