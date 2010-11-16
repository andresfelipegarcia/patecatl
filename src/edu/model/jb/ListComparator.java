package edu.model.jb;

import java.util.List;

public interface ListComparator {
	public List<Double> getIdsListToComparate();
	
	public void setListToComparate(List<Bean> bean);
	
	public List<Bean> getListToComparate();
}
