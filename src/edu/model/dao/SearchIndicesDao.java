package edu.model.dao;

import java.sql.SQLException;
import java.util.Vector;

import edu.conexion.DataAccess;
import edu.model.jb.Bean;
import edu.model.jb.SearchIndices;

public class SearchIndicesDao extends GenericDao implements Dao {

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bean find(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Bean bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<Object> select(Double id) throws SQLException {
		// TODO Auto-generated method stub
		Vector<Object> rst = null;
		Vector<Object> vecSearchIndices = null;
		SearchIndices searchIndices;
		DataAccess con;
		try {
			
			con = getConexion();
			openConexion(con);
			StringBuffer LsSQL = new StringBuffer("");
			
			LsSQL.append("SELECT ");
			LsSQL.append("* ");
			LsSQL.append("FROM  reference_indices ri ");
			LsSQL.append("JOIN ");
			LsSQL.append("search_indices si ");
			LsSQL.append("ON ");
			LsSQL.append("ri.id_referenceindice ");
			LsSQL.append("= ");
			LsSQL.append("si.id_referenceindice ");
			if(id != 0){
				LsSQL.append("WHERE ");
				LsSQL.append("si.id_cases ");
				LsSQL.append("= ");
				LsSQL.append(id);
			}
			
			/*select a.id_analysis, a.name, av.values, av.image FROM  analysis_values av join analysis a on av.id_analysis = a.id_analysis where av.id_cases = 1*/
			rst = con.executeQuerys(LsSQL.toString());
			vecSearchIndices = new Vector<Object>();
			for(int i=0; i<rst.size();i++){
				Vector<Object> vRowTemp = (Vector) rst.elementAt(i);
				searchIndices = new SearchIndices();
				searchIndices.setId((Double)vRowTemp.elementAt(0));
				searchIndices.setName((String)vRowTemp.elementAt(1));
				searchIndices.setValue((String)vRowTemp.elementAt(2));
				vecSearchIndices.add( searchIndices );
			}

			//sentencia.close();
			closeConexion(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vecSearchIndices;
	}

	@Override
	public int update(Bean bean, String condicion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
