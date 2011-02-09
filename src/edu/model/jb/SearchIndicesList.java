package edu.model.jb;

import java.util.ArrayList;
import java.util.List;

public class SearchIndicesList implements ListComparator {

	private String searchIndicesId;
	private List<SearchIndices> searchIndicesList = new ArrayList<SearchIndices>();
	
	public String getSearchIndicesId() {
		return searchIndicesId;
	}
	public void setSearchIndicesId(String searchIndicesId) {
		this.searchIndicesId = searchIndicesId;
	}
	public List<SearchIndices> getSearchIndicesList() {
		return searchIndicesList;
	}
	public void setSearchIndicesList(List<SearchIndices> searchIndicesList) {
		this.searchIndicesList = searchIndicesList;
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
	
	public List<ListComparator> setListToComparate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setListToComparate(List<Bean> bean) {
		// TODO Auto-generated method stub
		
	}
}
