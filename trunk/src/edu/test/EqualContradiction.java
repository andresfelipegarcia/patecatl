package edu.test;

import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;




public class EqualContradiction implements LocalSimilarityFunction{
	@Override
	public double compute(Object _caseBase, Object _comparisonCase) throws NoApplicableSimilarityFunctionException {
		if ((_caseBase == null) || (_comparisonCase == null))
            return 0;
		PhysicalExamination caseBase 		= (PhysicalExamination)_caseBase;
		PhysicalExamination comparisonCase= (PhysicalExamination) _comparisonCase;
		double contador = 0;
		if ( caseBase.getPositiveCharacteristicId().equals( comparisonCase.getPositiveCharacteristicId() ) ){
			contador++;
		}
		if ( caseBase.getNegativeCharacteristicId().equals( comparisonCase.getNegativeCharacteristicId() ) ){
			contador++;
		}
		double contraTotal = (contador/2);
		//System.err.println("Similares: " + contador);
		//System.err.println("Total: " + contraTotal);
		return contraTotal;
		
	}
	
	@Override
	public boolean isApplicable(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return true;
	}
}
