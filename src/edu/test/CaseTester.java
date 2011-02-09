package edu.test;

import java.util.Collection;

import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CaseBaseFilter;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.InitializingException;
import jcolibri.cbrcore.CBRCase;



public class CaseTester implements CBRCaseBase {

	private jcolibri.cbrcore.Connector connector;
	private java.util.Collection<CBRCase> cases;
	
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		//this.connector.close();
	}

	@Override
	public void forgetCases(Collection<CBRCase> cases) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<CBRCase> getCases() {
		// TODO Auto-generated method stub
		return cases;
	}

	@Override
	public Collection<CBRCase> getCases(CaseBaseFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Connector connector) throws InitializingException {
		// TODO Auto-generated method stub
		//cases = this.connector.retrieveAllCases();	
	}

	@Override
	public void learnCases(Collection<CBRCase> cases) {
		// TODO Auto-generated method stub
		this.cases = cases;
	}

}
