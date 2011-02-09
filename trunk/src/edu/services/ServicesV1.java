package edu.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import edu.model.dao.Dao;
import edu.model.dao.FactoryDAO;
import edu.model.jb.Case;
import edu.model.jb.Analysis;
import edu.model.jb.PhysicalExamination;
import edu.model.jb.VitalSigns;

public class ServicesV1 {
	private Case bean;
	private Dao dao;
/*	
	public String getBean() throws SQLException{

		dao = FactoryDAO.getDAO( "edu.model.dao.AnalysisDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( 1D );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			bean = (Case) it.next();
			System.out.println( this.bean.toString());
			//System.out.println( bean.select());
			
		}
		return "tester func";
	}*/
	
	public String getDescription(Double id) throws SQLException{
		String description = null;
		dao = FactoryDAO.getDAO( "edu.model.dao.CaseDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( id );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			bean = (Case) it.next();
			System.out.println( this.bean.getDescription());
			description = this.bean.getDescription();
			//System.out.println( bean.select());
			
		}
		return description;
	}
	
	
	public String[] getRecomendedAnalisys(Double id) throws SQLException{
		//System.out.println("start function");
		List<String> analisisList = new ArrayList<String>();
		String[] arrayList;
		Analysis analisis;
		dao = FactoryDAO.getDAO( "edu.model.dao.AnalysisDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( id );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			analisis = (Analysis) it.next();
			//System.out.println( analisis.getName());
			//System.out.println( bean.select());
			analisisList.add(analisis.getName());
		}
		
		arrayList = new String[analisisList.size()];
		Iterator lista = analisisList.iterator();
		int il = 0;
		while (lista.hasNext()) {
			arrayList[il] = lista.next().toString();
			il++;
		}
		return arrayList;
	}
	
	public String getVitalSigns(Double id) throws SQLException{
		//System.out.println("start function");
		List<String> vitalSignsList = new ArrayList<String>();
		String strVitalSigns = "";
		VitalSigns vitalSigns;
		dao = FactoryDAO.getDAO( "edu.model.dao.VitalSignsDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( id );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			vitalSigns = (VitalSigns) it.next();
			//System.out.println( analisis.getName());
			//System.out.println( bean.select());
			strVitalSigns += vitalSigns.getName() + " " + vitalSigns.getValue() + ", ";
		}
		
		return strVitalSigns;
	}
	
	public String getPhysicalExamination(Double id) throws SQLException{
		//System.out.println("start function");
		List<String> physicalExaminationList = new ArrayList<String>();
		String strPhysicalExamination = "";
		PhysicalExamination physicalExamination;
		dao = FactoryDAO.getDAO( "edu.model.dao.PhysicalExaminationDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( id );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			physicalExamination = (PhysicalExamination) it.next();
			//System.out.println( analisis.getName());
			//System.out.println( bean.select());
			strPhysicalExamination += physicalExamination.getName() + " " + physicalExamination.getValue() + ", ";
		}
		
		return strPhysicalExamination;
	}
	
	
	/*
	public List<String> getRecomendedAnalisys() throws SQLException{
		//System.out.println("start function");
		List<String> analisisList = new ArrayList<String>();
		Analysis analisis;
		dao = FactoryDAO.getDAO( "edu.model.dao.AnalysisDao" );	// Obtengo el DAO de la factoria
		Vector<Object> vec = dao.select( 1D );					// La Select devuelve Vector 
	   	Iterator<Object> it = vec.iterator();
		while (it.hasNext()) {
			analisis = (Analysis) it.next();
			System.out.println( analisis.toString());
			//System.out.println( bean.select());
			analisisList.add(analisis.getName());
		}
		
		return analisisList;
	}*/
	/*
	public static void main(String args[]) throws SQLException{
		getRecomendedAnalisys();
	}*/
}
