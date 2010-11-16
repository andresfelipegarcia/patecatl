package edu.model.dao;

import java.sql.SQLException;
import java.util.Vector;

import edu.conexion.DataAccess;
import edu.model.jb.Analysis;
import edu.model.jb.Bean;

public class AnalysisDao extends GenericDao implements Dao {

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
	public Vector<Object> select(Double id) {
		// TODO Auto-generated method stub
		Vector<Object> rst = null;
		Vector<Object> vecAnalysis = null;
		Analysis analysis;
		DataAccess con;
		try {
			
			con = getConexion();
			openConexion(con);
			StringBuffer LsSQL = new StringBuffer("");
			
			LsSQL.append("SELECT ");
			LsSQL.append("a.id_analysis ");
			LsSQL.append(", a.name ");
			LsSQL.append(", av.values ");
			LsSQL.append(", av.image ");
			LsSQL.append("FROM  analysis_values av ");
			LsSQL.append("JOIN ");
			LsSQL.append("analysis a ");
			LsSQL.append("ON ");
			LsSQL.append("av.id_analysis ");
			LsSQL.append("= ");
			LsSQL.append("a.id_analysis ");
			if(id != 0){
				LsSQL.append("WHERE ");
				LsSQL.append("av.id_cases ");
				LsSQL.append("= ");
				LsSQL.append(id);
			}
			
			/*select a.id_analysis, a.name, av.values, av.image FROM  analysis_values av join analysis a on av.id_analysis = a.id_analysis where av.id_cases = 1*/
			rst = con.executeQuerys(LsSQL.toString());
			vecAnalysis = new Vector<Object>();
			for(int i=0; i<rst.size();i++){
				Vector<Object> vRowTemp = (Vector) rst.elementAt(i);
			    analysis = new Analysis();
			    analysis.setId((Double)vRowTemp.elementAt(0));
			    analysis.setName((String)vRowTemp.elementAt(1));
			    analysis.setValue((String)vRowTemp.elementAt(2));
			    analysis.setImage((String)vRowTemp.elementAt(3));
			    vecAnalysis.add( analysis );
			}

			//sentencia.close();
			closeConexion(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vecAnalysis;
	}

	@Override
	public int update(Bean bean, String condicion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
