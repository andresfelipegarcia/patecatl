package edu.test;

import java.util.ArrayList;
import java.util.List;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class VitalSigns implements CaseComponent,ListComparator {
	private String vitalSignsId;
	private List<Long> vitalSignsList = new ArrayList<Long>();

	public void setVitalSignsId(String vitalSignsId) {
		this.vitalSignsId = vitalSignsId;
	}

	public String getVitalSignsId() {
		return vitalSignsId;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return new Attribute("vitalSignsId", this.getClass());
	}
	
	public void setListToComparate(List<Long> vitalSignsList) {
		// TODO Auto-generated method stub
		this.vitalSignsList = vitalSignsList;
	}

	@Override
	public List<Long> getListToComparate() {
		// TODO Auto-generated method stub
		return this.vitalSignsList;
	}

}
