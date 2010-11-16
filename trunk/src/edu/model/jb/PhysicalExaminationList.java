package edu.model.jb;

import java.util.ArrayList;
import java.util.List;

public class PhysicalExaminationList implements ListComparator{
	private String physicalexaminationId;
	private List<PhysicalExamination> physicalexaminationList = new ArrayList<PhysicalExamination>();
	
	
	public void setPhysicalexaminationId(String physicalexaminationId) {
		this.physicalexaminationId = physicalexaminationId;
	}
	public String getPhysicalexaminationId() {
		return physicalexaminationId;
	}
	
	public void setPhysicalexaminationList(List<PhysicalExamination> physicalexaminationList) {
		this.physicalexaminationList = physicalexaminationList;
	}
	public List<PhysicalExamination> getPhysicalexaminationList() {
		return physicalexaminationList;
	}
	@Override
	public List<Bean> getListToComparate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Double> getIdsListToComparate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ListComparator> setListToComparate() {
		// TODO Auto-generated method stub
		return null;
	}

}
