package edu.test;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class CaseSolution implements CaseComponent {
	
	private String caseId;
	private String name;


	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}


	public String getCaseId() {
		return caseId;
	}


	public void setName(String objetivo) {
		this.name = objetivo;
	}


	public String getName() {
		return name;
	}
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("caseId", this.getClass());
	}

}
