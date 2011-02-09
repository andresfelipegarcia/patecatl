package edu.test;

import java.util.Iterator;


public class GetValueComparator {
	private double[] resourcesListBase;
	private double[] resourcesListSource;
	private double resorcesEquals;
	
	/**
	 * @param args
	 */


	public void setResourcesListBase(double[] resourcesListBase) {
		this.resourcesListBase = resourcesListBase;
	}

	public double[] getResourcesListBase() {
		return resourcesListBase;
	}

	public void setResourcesListSource(double[] resourcesListSource) {
		this.resourcesListSource = resourcesListSource;
	}

	public double[] getResourcesListSource() {
		return resourcesListSource;
	}
	
	private void compareResourceIds(){
		for(int i = 0; i < this.resourcesListSource.length; i++){
			for(int j = 0; j < this.resourcesListBase.length; j++){
				if(this.resourcesListSource[i] == this.resourcesListBase[j]){
					this.resorcesEquals++;
				}
			}
		}
	}
	
	public double compareFactorResources(double[] resourcesSource, double[] resourcesBase){
		this.setResourcesListBase(resourcesSource);
		this.setResourcesListSource(resourcesBase);
		this.compareResourceIds();
		System.err.println("resorcesEquals: " + this.resorcesEquals);
		double factorBase =  this.resorcesEquals / this.resourcesListBase.length ;
		System.err.println("factorBase: " + factorBase);
		double factorSource =  this.resorcesEquals / this.resourcesListSource.length;
		System.err.println("factorSource: " + factorSource);
		return ((factorBase + factorSource )/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] base = {1,34,12,32,56,43,2,3,9,10,20}; //caso B
		double[] source = {7,9,2,10,77}; // caso A

		double[] base = {21,43,2,3,9,10}; // caso C
		//double[] source = {7,9,2,10,77};
		
		GetValueComparator comparador = new GetValueComparator();
		double factor = comparador.compareFactorResources(source, base);
		
		System.out.println("factor: "  + factor);
	}

}
