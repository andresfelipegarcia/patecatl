package edu.model.jb;

public class Treatment implements Bean  {

	private Double id;
	private String treatment;
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
