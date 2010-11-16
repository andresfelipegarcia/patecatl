package edu.model.dao;

import java.sql.SQLException;
import java.util.Vector;

import edu.conexion.DataAccess;
import edu.model.jb.Bean;
import edu.model.jb.VitalSigns;

public class VitalSignsDao extends GenericDao implements Dao {

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
		Vector<Object> vecVitalSigns = null;
		VitalSigns vitalSigns;
		DataAccess con;
		try {
			
			con = getConexion();
			openConexion(con);
			StringBuffer LsSQL = new StringBuffer("");
			
			LsSQL.append("SELECT ");
			LsSQL.append("vsv.id_vital_signs  ");
			LsSQL.append(", vs.name ");
			LsSQL.append(", vsv.value ");
			LsSQL.append("FROM  vital_signs vs ");
			LsSQL.append("JOIN ");
			LsSQL.append("vital_signs_values vsv ");
			LsSQL.append("ON ");
			LsSQL.append("vs.id_vitalsigns ");
			LsSQL.append("= ");
			LsSQL.append("vsv.id_vital_signs ");
			if(id != 0){
				LsSQL.append("WHERE ");
				LsSQL.append("vsv.id_cases ");
				LsSQL.append("= ");
				LsSQL.append(id);
			}
			
			/*select a.id_analysis, a.name, av.values, av.image FROM  analysis_values av join analysis a on av.id_analysis = a.id_analysis where av.id_cases = 1*/
			rst = con.executeQuerys(LsSQL.toString());
			vecVitalSigns = new Vector<Object>();
			for(int i=0; i<rst.size();i++){
				Vector<Object> vRowTemp = (Vector) rst.elementAt(i);
				vitalSigns = new VitalSigns();
				vitalSigns.setId((Double)vRowTemp.elementAt(0));
				vitalSigns.setName((String)vRowTemp.elementAt(1));
				vitalSigns.setValue((String)vRowTemp.elementAt(2));
				vecVitalSigns.add( vitalSigns );
			}

			//sentencia.close();
			closeConexion(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vecVitalSigns;
	}

	@Override
	public int update(Bean bean, String condicion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
