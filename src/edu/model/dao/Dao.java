package edu.model.dao;

import java.sql.SQLException;
import java.util.Vector;
import edu.model.jb.Bean;

public interface Dao {
	public int insert( Bean bean ) throws SQLException;
	public int update( Bean bean, String condicion ) throws SQLException;
	public Bean find( int id ) throws SQLException;
	public Vector<Object> select( Double id ) throws SQLException; 
	public int delete(int id) throws SQLException;
}
