package edu.test;


import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class PhysicalExamination implements CaseComponent {
	private String contradictionsId;
	
	private Long positiveCharacteristicId;
	
	private Long negativeCharacteristicId;
	


	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("contradictionsId", this.getClass());
	}



	public void setContradictionsId(String contradictionsId) {
		this.contradictionsId = contradictionsId;
	}



	public String getContradictionsId() {
		return contradictionsId;
	}



	public void setPositiveCharacteristicId(Long positiveCharacteristicId) {
		this.positiveCharacteristicId = positiveCharacteristicId;
	}



	public Long getPositiveCharacteristicId() {
		return positiveCharacteristicId;
	}



	public void setNegativeCharacteristicId(Long negativeCharacteristicId) {
		this.negativeCharacteristicId = negativeCharacteristicId;
	}



	public Long getNegativeCharacteristicId() {
		return negativeCharacteristicId;
	}
	

}
