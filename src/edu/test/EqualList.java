package edu.test;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;
import edu.model.jb.Bean;
import edu.model.jb.ListComparator;

public class EqualList implements LocalSimilarityFunction {

	@Override
	public double compute(Object _caseList, Object _comparisionList) throws NoApplicableSimilarityFunctionException {
		// TODO Auto-generated method stub
		double countEquals = 0;
		if ((_caseList == null) || (_comparisionList == null))
            return 0;
		
		ListComparator caseList = (ListComparator) _caseList;
		ListComparator comparisionList = (ListComparator) _comparisionList;
		
		for (Bean baseItem : caseList.getListToComparate()) {
			for (Bean comparitionItem : comparisionList.getListToComparate()) {
				if ( baseItem.equals(comparitionItem) ){
					countEquals++;
					break;
				}
			}
		}
		
		//System.err.println("countEquals: " + countEquals);
		
		double factorBase =  countEquals / comparisionList.getListToComparate().size() ;
		//System.err.println("factorBase: " + factorBase);
		
		double factorSource =  countEquals / caseList.getListToComparate().size();
		
		//System.err.println("factorSource: " + factorSource);
		
		double factorSimilitud = (factorBase + factorSource )/2;
		//System.err.println("Factor similitud : " + factorSimilitud);
		
		return factorSimilitud;
	}

	@Override
	public boolean isApplicable(Object caseList, Object comparisionList) {
		// TODO Auto-generated method stub
		return true;
	}

}
