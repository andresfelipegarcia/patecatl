package edu.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import edu.conexion.DataAccess;
import edu.model.jb.Bean;
import edu.model.jb.Case;
import edu.model.jb.Diagnosis;
import edu.model.jb.Forecast;
import edu.model.jb.Treatment;

public class CaseDao extends GenericDao implements Dao {

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
		Vector<Object> vecCase = null;
		Case _case;
		DataAccess con;
		try {
			
			con = getConexion();
			openConexion(con);
			StringBuffer LsSQL = new StringBuffer("");
			
			LsSQL.append("SELECT ");
			LsSQL.append("* ");
			LsSQL.append("FROM  cases ");
			if(id != 0){
				LsSQL.append("WHERE ");
				LsSQL.append("id_cases ");
				LsSQL.append("= ");
				LsSQL.append(id);
			}
			
			/*select a.id_analysis, a.name, av.values, av.image FROM  analysis_values av join analysis a on av.id_analysis = a.id_analysis where av.id_cases = 1*/
			rst = con.executeQuerys(LsSQL.toString());
			vecCase = new Vector<Object>();
			for(int i=0; i<rst.size();i++){
				Vector<Object> vRowTemp = (Vector) rst.elementAt(i);
				_case = new Case();
				_case.setId((Double)vRowTemp.elementAt(0));
				_case.setName((String)vRowTemp.elementAt(1));
				_case.setKeywords((String)vRowTemp.elementAt(6));
				_case.setDescription((String)vRowTemp.elementAt(2));
				//description
				
				//search Diagnosis by case
				Diagnosis diagnosis = (Diagnosis) getComponentCase("edu.model.dao.DiagnosisDao",(Double)vRowTemp.elementAt(3));
				_case.setDiagnosis(diagnosis);
				//search Forecast by case
				Forecast forecast = (Forecast) getComponentCase("edu.model.dao.ForecastDao",(Double)vRowTemp.elementAt(4));
				_case.setForecast(forecast);
				//search Treatment by case
				Treatment treatment = (Treatment) getComponentCase("edu.model.dao.TreatmentDao",(Double)vRowTemp.elementAt(5));
				_case.setTreatment(treatment);				
				//add fields list
				_case.setAnalysisList(getListComponentCase("edu.model.dao.AnalysisDao",_case.getId()));
				_case.setPhysicalExaminationList(getListComponentCase("edu.model.dao.PhysicalExaminationDao",_case.getId()));
				_case.setSearchIndicesList(getListComponentCase("edu.model.dao.SearchIndicesDao",_case.getId()));
				_case.setVitalSignsList(getListComponentCase("edu.model.dao.VitalSignsDao",_case.getId()));

				vecCase.add( _case );
			}

			//sentencia.close();
			closeConexion(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vecCase;
	}

	@Override
	public int update(Bean bean, String condicion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Bean getComponentCase(String nameComponent, Double id) throws SQLException{
		Bean bean = null;
		Dao dao = FactoryDAO.getDAO(nameComponent );
		Vector<Object> vec = dao.select( id ); 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			bean = (Bean) it.next();
		}
		return bean;
	}
	
	private List<Bean> getListComponentCase(String nameComponent, Double id) throws SQLException{
		List<Bean> listBean = new ArrayList<Bean>();
		Bean bean = null;
		Dao dao = FactoryDAO.getDAO(nameComponent );
		Vector<Object> vec = dao.select( id ); 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			bean = (Bean) it.next();
			listBean.add(bean);
		}
		return listBean;
	}

}
