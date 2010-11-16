package edu.model.dao;

public class FactoryDAO {
	
	/***********************************************************************************
	 * Crea y devuelve el DAO 
	 **********************************************************************************/
	public static Dao getDAO( String nombre ) {
		try {
			
			//Class clase = Class.forName( getClase( nombre ) );	// La clase se consigue leyendo del archivo properties
			Class clase = Class.forName( nombre );
			return (Dao) clase.newInstance();			// Creo una instancia
		}
		catch (ClassNotFoundException e) {		// No existe la clase
			e.printStackTrace();
			return null;
		}
		catch (Exception e) {					// No puedo instanciar la clase
			e.printStackTrace();
			return null;			
		}
	}
}
