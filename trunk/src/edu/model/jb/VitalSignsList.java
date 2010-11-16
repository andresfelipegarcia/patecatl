package edu.model.jb;

import java.util.ArrayList;
import java.util.List;

public class VitalSignsList {

	private String vitalSignsId;
	private List<VitalSigns> vitalSignsList = new ArrayList<VitalSigns>();
	
	public String getVitalSignsId() {
		return vitalSignsId;
	}
	public void setVitalSignsId(String vitalSignsId) {
		this.vitalSignsId = vitalSignsId;
	}
	public List<VitalSigns> getVitalSignsList() {
		return vitalSignsList;
	}
	public void setVitalSignsList(List<VitalSigns> vitalSignsList) {
		this.vitalSignsList = vitalSignsList;
	}
}
