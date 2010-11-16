package edu.model.jb;

public class Forecast  implements Bean {
	private Double id;
	private String forecast;
	
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	@Override
	public boolean isEqual(Bean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
