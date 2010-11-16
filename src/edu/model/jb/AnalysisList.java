package edu.model.jb;

import java.util.ArrayList;
import java.util.List;

public class AnalysisList implements ListComparator {
	private String analysisId;
	private List<Bean> analysisList = new ArrayList<Bean>();
	
	public String getAnalysisId() {
		return analysisId;
	}
	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}
	/*
	public List<Analysis> getAnalysisList() {
		return analysisList;
	}
	public void setAnalysisList(List<Analysis> analysisList) {
		this.analysisList = analysisList;
	}*/
	@Override
	public List<Bean> getListToComparate() {
		// TODO Auto-generated method stub
		return this.analysisList;
	}
	
	@Override
	public List<Double> getIdsListToComparate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setListToComparate(List<Bean> bean) {
		// TODO Auto-generated method stub
		this.analysisList = bean;
	}
	

}
