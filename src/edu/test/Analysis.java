package edu.test;

import java.util.ArrayList;
import java.util.List;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class Analysis implements CaseComponent,ListComparator {
	
	private String analysisId;
	List<Long> analysisList = new ArrayList<Long>();


	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}


	public String getAnalysisId() {
		return analysisId;
	}
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("analysisId", this.getClass());
	}
	
	public void setListToComparate(List<Long> analysisList) {
		// TODO Auto-generated method stub
		this.analysisList = analysisList;
	}

	@Override
	public List<Long> getListToComparate() {
		// TODO Auto-generated method stub
		return this.analysisList;
	}

}
