package edu.test;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;

import edu.model.dao.Dao;
import edu.model.dao.FactoryDAO;
import edu.model.jb.Case;

public class Test {
	public static void main(String[] args) throws SQLException{
		Case bean;
		Dao dao = FactoryDAO.getDAO( "edu.model.dao.CaseDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( 1D );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			bean = (Case) it.next();
			System.out.println( bean.toString());
		}
	}
}
