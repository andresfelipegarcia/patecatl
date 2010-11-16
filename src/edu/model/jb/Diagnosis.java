package edu.model.jb;

public class Diagnosis  implements Bean  {
	private Double id;
	private String diagnosis;
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
