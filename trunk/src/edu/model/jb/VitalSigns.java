package edu.model.jb;

public class VitalSigns implements Bean  {
	private Double id;
	private String name;
	private String value;
	
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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
