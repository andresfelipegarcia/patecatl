package edu.model.jb;

import java.util.ArrayList;
import java.util.List;

public class Case implements Bean {
	private Double id;
	private String name;
	private Diagnosis diagnosis;
	private Forecast forecast;
	private Treatment treatment;
	private String keywords;
	//private PhysicalExaminationList physicalExaminationList;
	//private AnalysisList analysisList;
	//private SearchIndicesList searchIndicesList;
	//private VitalSignsList vitalSignsList;
	private List<Bean> physicalExaminationList = new ArrayList<Bean>();
	private List<Bean> analysisList = new ArrayList<Bean>();
	private List<Bean> searchIndicesList = new ArrayList<Bean>();
	private List<Bean> vitalSignsList = new ArrayList<Bean>();
	
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}
	
	public Treatment getTreatment() {
		return treatment;
	}
	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}
	
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/*
	public PhysicalExaminationList getPhysicalExaminationList() {
		return physicalExaminationList;
	}
	public void setPhysicalExaminationList(PhysicalExaminationList physicalExaminationList) {
		this.physicalExaminationList = physicalExaminationList;
	}
	
	public AnalysisList getAnalysisList() {
		return analysisList;
	}
	public void setAnalysisList(AnalysisList analysisList) {
		this.analysisList = analysisList;
	}
	
	public SearchIndicesList getSearchIndicesList() {
		return searchIndicesList;
	}
	public void setSearchIndicesList(SearchIndicesList searchIndicesList) {
		this.searchIndicesList = searchIndicesList;
	}
	
	public VitalSignsList getVitalSignsList() {
		return vitalSignsList;
	}
	public void setVitalSignsList(VitalSignsList vitalSignsList) {
		this.vitalSignsList = vitalSignsList;
	}*/
	
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		//Case cs = (Case) bean;
		//if ( cli.getCodigo().equals( this.getCodigo()) )
		//{
			//return true;
		//}
		return false;
	}
	
	
	public List<Bean> getAnalysisList() {
		return analysisList;
	}
	public void setAnalysisList(List<Bean> list) {
		this.analysisList = list;
	}
	public List<Bean> getSearchIndicesList() {
		return searchIndicesList;
	}
	public void setSearchIndicesList(List<Bean> searchIndicesList) {
		this.searchIndicesList = searchIndicesList;
	}
	public List<Bean> getVitalSignsList() {
		return vitalSignsList;
	}
	public void setVitalSignsList(List<Bean> vitalSignsList) {
		this.vitalSignsList = vitalSignsList;
	}
	public void setPhysicalExaminationList(List<Bean> physicalExaminationList) {
		this.physicalExaminationList = physicalExaminationList;
	}
	public List<Bean> getPhysicalExaminationList() {
		return physicalExaminationList;
	}
}
