package edu.test;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/*
 * Caso implements CaseComponent{ 
 * 	Recursos recursos; 
 * 	Restriccciones Êrestriccciones; 
 * 	Contradicciones contra; 
 * 	String objetivo 
 * 	gets y sets Ê
 * }
 * */

public class Case implements CaseComponent {
	
	private String caseId;
	private Analysis analysis;
	private PhysicalExamination physicalExamination;
	private VitalSigns vitalSigns;
	private String name;


	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}


	public String getCaseId() {
		return caseId;
	}


	public void setAnalysis(Analysis analysis) {
		this.analysis = analysis;
	}


	public Analysis getAnalysis() {
		return analysis;
	}


	public void setPhysicalExamination(PhysicalExamination physicalExamination) {
		this.physicalExamination = physicalExamination;
	}


	public PhysicalExamination getPhysicalExamination() {
		return physicalExamination;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setVitalSigns(VitalSigns vitalSigns) {
		this.vitalSigns = vitalSigns;
	}


	public VitalSigns getVitalSigns() {
		return vitalSigns;
	}
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("caseId", this.getClass());
	}

}
