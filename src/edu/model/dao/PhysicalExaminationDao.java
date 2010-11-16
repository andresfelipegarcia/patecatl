package edu.model.dao;

import java.sql.SQLException;
import java.util.Vector;

import edu.conexion.DataAccess;
import edu.model.jb.Bean;
import edu.model.jb.PhysicalExamination;

public class PhysicalExaminationDao extends GenericDao implements Dao  {

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
		Vector<Object> vecPhysicalExamination = null;
		PhysicalExamination physicalExamination;
		DataAccess con;
		try {
			
			con = getConexion();
			openConexion(con);
			StringBuffer LsSQL = new StringBuffer("");
			
			LsSQL.append("SELECT ");
			LsSQL.append("vpe.id_physical_examination");
			LsSQL.append(",pe.name ");
			LsSQL.append(",vpe.values  ");
			LsSQL.append("FROM  physical_examination pe ");
			LsSQL.append("JOIN ");
			LsSQL.append("values_physical_examination vpe ");
			LsSQL.append("ON ");
			LsSQL.append("pe.id_physicalexamination ");
			LsSQL.append("= ");
			LsSQL.append("vpe.id_physical_examination ");
			
			if(id != 0){
				LsSQL.append("WHERE ");
				LsSQL.append("vpe.id_cases ");
				LsSQL.append("= ");
				LsSQL.append(id);
			}
			
			/*select a.id_analysis, a.name, av.values, av.image FROM  analysis_values av join analysis a on av.id_analysis = a.id_analysis where av.id_cases = 1*/
			rst = con.executeQuerys(LsSQL.toString());
			vecPhysicalExamination = new Vector<Object>();
			for(int i=0; i<rst.size();i++){
				Vector<Object> vRowTemp = (Vector) rst.elementAt(i);
				physicalExamination = new PhysicalExamination();
				physicalExamination.setId((Double)vRowTemp.elementAt(0));
				physicalExamination.setName((String)vRowTemp.elementAt(1));
				physicalExamination.setValue((String)vRowTemp.elementAt(2));
				vecPhysicalExamination.add( physicalExamination );
			}

			//sentencia.close();
			closeConexion(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vecPhysicalExamination;
	}

	@Override
	public int update(Bean bean, String condicion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
