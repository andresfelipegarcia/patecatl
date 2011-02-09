/**
 * Test4.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-García.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 11/01/2007
 */
package edu.test;

import java.util.ArrayList;
import java.util.Collection;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;

import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;

//import jcolibri.method.retrieve.NNretrieval.similarity.local.EqualContradiction;
//import jcolibri.method.retrieve.NNretrieval.similarity.local.EqualList;

public class TestCase implements StandardCBRApplication {

	Connector _connector;
	CBRCaseBase _caseBase;

	Collection<CBRCase> cases = new ArrayList<CBRCase>();
	
	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.BasicCBRApplication#configure()
	 */
	public void configure() throws ExecutionException{
		try{
		//_connector = new DataBaseConnector();
		//_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("jcolibri/test/test4/databaseconfig.xml"));
		//_caseBase  = new LinealCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	
	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.BasicCBRApplication#preCycle()
	 */
	public CBRCaseBase preCycle() throws ExecutionException {
		//_caseBase.init(_connector);
		_caseBase = (CBRCaseBase) new CaseTester();
		java.util.ArrayList<CBRCase> res = new java.util.ArrayList<CBRCase>();
		
		
		
		
		/*start Caso1*/
		
		Case caso1 = new Case();
		caso1.setCaseId("caso1");
		caso1.setName("Hepatitis A");
		
		/*Analysis*/
		Analysis analysis = new Analysis();
//		analysis.setResourcesId("analysis");
//		analysis.getListToComparate().add(1L);
//		analysis.getListToComparate().add(2L);
//		analysis.getListToComparate().add(3L);
//		//analysis.getListToComparate().add(4L);
//		//analysis.getListToComparate().add(5L);
//		//analysis.getListToComparate().add(6L);
//		analysis.getListToComparate().add(7L);
//		//analysis.getListToComparate().add(8L);
//		analysis.getListToComparate().add(9L);
//		//analysis.getListToComparate().add(10L);
//		//analysis.getListToComparate().add(11L);
//		//analysis.getListToComparate().add(12L);
//		//analysis.getListToComparate().add(13L);
//		//analysis.getListToComparate().add(14L);
		analysis.getListToComparate().add(15L);
//		//analysis.getListToComparate().add(16L);
//		//analysis.getListToComparate().add(17L);
//		//analysis.getListToComparate().add(18L);
//		//analysis.getListToComparate().add(19L);
//		//analysis.getListToComparate().add(20L);
		analysis.getListToComparate().add(21L);
		analysis.getListToComparate().add(22L);		
		caso1.setAnalysis(analysis);
		
		//VitalSigns
		VitalSigns vitalSigns = new VitalSigns();
		vitalSigns.setVitalSignsId("vitalSigns");
		vitalSigns.getListToComparate().add(1L);
//		vitalSigns.getListToComparate().add(2L);
//		vitalSigns.getListToComparate().add(3L);
		vitalSigns.getListToComparate().add(4L);
//		vitalSigns.getListToComparate().add(5L);
		vitalSigns.getListToComparate().add(6L);
//		vitalSigns.getListToComparate().add(7L);
//		vitalSigns.getListToComparate().add(8L);
		vitalSigns.getListToComparate().add(9L);
//		vitalSigns.getListToComparate().add(10L);
		vitalSigns.getListToComparate().add(12L);
		vitalSigns.getListToComparate().add(13L);
		caso1.setVitalSigns(vitalSigns);
		
		/*PhysicalExamination*/
		PhysicalExamination physicalExamination = new PhysicalExamination();
		physicalExamination.setContradictionsId("physicalExamination");
		physicalExamination.setNegativeCharacteristicId(12L);
		physicalExamination.setPositiveCharacteristicId(15L);
		caso1.setPhysicalExamination(physicalExamination);
		
		//cases.add((CBRCase) caso1);
		CBRCase _case = new CBRCase();
		_case.setDescription(caso1);
		CaseSolution cs1 = new CaseSolution();
		cs1.setCaseId(caso1.getCaseId());
		cs1.setName(caso1.getName());
		_case.setSolution(cs1);
		
		res.add(_case);
		
		/*end Caso1*/
		
		/*start Caso2*/
		Case caso2 = new Case();
		caso2.setCaseId("caso2");
		caso2.setName("Hepatitis B");
		
		/*Analysis*/
		Analysis analysis2 = new Analysis();
		analysis2.setAnalysisId("analysis2");
//		analysis2..getListToComparate().add(1L);
		analysis2.getListToComparate().add(2L);
		analysis2.getListToComparate().add(3L);
//		analysis2.getListToComparate().add(4L);
		analysis2.getListToComparate().add(5L);
//		analysis2.getListToComparate().add(6L);
		analysis2.getListToComparate().add(7L);
		analysis2.getListToComparate().add(8L);
//		analysis2.getListToComparate().add(9L);
//		analysis2.getListToComparate().add(10L);
//		analysis2.getListToComparate().add(11L);
		analysis2.getListToComparate().add(12L);
//		analysis2.getListToComparate().add(13L);
//		analysis2.getListToComparate().add(14L);
		analysis2.getListToComparate().add(17L);
//		analysis2.getListToComparate().add(46L);
//		analysis2.getListToComparate().add(56L);
		caso2.setAnalysis(analysis);

		/*VitalSigns*/
		VitalSigns vitalSigns2 = new VitalSigns();
		vitalSigns2.setVitalSignsId("vitalSigns2");
//		vitalSigns2.getListToComparate().add(1L);
//		vitalSigns2.getListToComparate().add(2L);
//		vitalSigns2.getListToComparate().add(3L);
//		vitalSigns2.getListToComparate().add(4L);
//		vitalSigns2.getListToComparate().add(5L);
//		vitalSigns2.getListToComparate().add(6L);
//		vitalSigns2.getListToComparate().add(7L);
//		vitalSigns2.getListToComparate().add(8L);
		vitalSigns2.getListToComparate().add(9L);
//		vitalSigns2.getListToComparate().add(10L);
//		vitalSigns2.getListToComparate().add(11L);
		vitalSigns2.getListToComparate().add(12L);
		vitalSigns2.getListToComparate().add(14L);
		vitalSigns2.getListToComparate().add(21L);
		caso2.setVitalSigns(vitalSigns2);
		
		/*Contradictions*/
		PhysicalExamination physicalExamination2 = new PhysicalExamination();
		physicalExamination2.setContradictionsId("physicalExamination2");
		physicalExamination2.setNegativeCharacteristicId(12L);
		physicalExamination2.setPositiveCharacteristicId(15L);
		caso2.setPhysicalExamination(physicalExamination2);
		
		CBRCase _case2 = new CBRCase();
		_case2.setDescription(caso2);
		CaseSolution cs2 = new CaseSolution();
		cs2.setCaseId(caso2.getCaseId());
		cs2.setName(caso2.getName());
		_case2.setSolution(cs2);
		
		res.add(_case2);
		
		/*end Caso2*/
		
		
		/*start Caso3*/
		Case caso3 = new Case();
		caso3.setCaseId("caso3");
		caso3.setName("Hepatitis C");
	
		/*Analysis*/
		Analysis analysis3 = new Analysis();
		analysis3.setAnalysisId("analysis3");
//		analysis3.getListToComparate().add(1L);
//		analysis3.getListToComparate().add(2L);
//		analysis3.getListToComparate().add(3L);
		analysis3.getListToComparate().add(5L);
		analysis3.getListToComparate().add(6L);
		caso3.setAnalysis(analysis3);
		
		/*VitalSigns*/
		VitalSigns vitalSigns3 = new VitalSigns();
		vitalSigns3.setVitalSignsId("vitalSigns3");
		vitalSigns3.getListToComparate().add(1L);
		vitalSigns3.getListToComparate().add(2L);
		vitalSigns3.getListToComparate().add(3L);
		vitalSigns3.getListToComparate().add(4L);
//		vitalSigns3.getListToComparate().add(5L);
		vitalSigns3.getListToComparate().add(6L);
		vitalSigns3.getListToComparate().add(7L);
		vitalSigns3.getListToComparate().add(8L);
		vitalSigns3.getListToComparate().add(9L);
//		vitalSigns3.getListToComparate().add(10L);
//		vitalSigns3.getListToComparate().add(11L);
//		vitalSigns3.getListToComparate().add(12L);
		vitalSigns3.getListToComparate().add(13L);
		vitalSigns3.getListToComparate().add(15L);
		vitalSigns3.getListToComparate().add(17L);
		vitalSigns3.getListToComparate().add(20L);
		vitalSigns3.getListToComparate().add(21L);
		caso3.setVitalSigns(vitalSigns3);
		
		/*Contradictions*/
		PhysicalExamination contra3 = new PhysicalExamination();
		contra3.setContradictionsId("contra3");
		contra3.setNegativeCharacteristicId(11L);
		contra3.setPositiveCharacteristicId(15L);
		caso3.setPhysicalExamination(contra3);
		
		
		CBRCase _case3 = new CBRCase();
		_case3.setDescription(caso3);
		CaseSolution cs3 = new CaseSolution();
		cs3.setCaseId(caso3.getCaseId());
		cs3.setName(caso3.getName());
		_case3.setSolution(cs3);
		
		res.add(_case3);
		
		/*end Caso3*/
		
		//start Caso4
		Case caso4 = new Case();
		caso4.setCaseId("caso4");
		caso4.setName("cirrosis hepatica");
		
		//Analysis
		Analysis analysis4 = new Analysis();
		analysis4.setAnalysisId("analysis4");
		analysis4.getListToComparate().add(1L);
//		analysis4.getListToComparate().add(2L);
//		analysis4.getListToComparate().add(3L);
		analysis4.getListToComparate().add(4L);
		analysis4.getListToComparate().add(5L);
		analysis4.getListToComparate().add(6L);
//		analysis4.getListToComparate().add(7L);
		analysis4.getListToComparate().add(8L);
		analysis4.getListToComparate().add(9L);
		analysis4.getListToComparate().add(10L);
		analysis4.getListToComparate().add(11L);
//		analysis4.getListToComparate().add(12L);
//		analysis4.getListToComparate().add(13L);
		analysis4.getListToComparate().add(15L);
		analysis4.getListToComparate().add(19L);
		caso4.setAnalysis(analysis4);
		
		//VitalSigns
		VitalSigns vitalSigns4 = new VitalSigns();
		vitalSigns4.setVitalSignsId("vitalSigns4");
		vitalSigns4.getListToComparate().add(1L);
		vitalSigns4.getListToComparate().add(2L);
		vitalSigns4.getListToComparate().add(3L);
		vitalSigns4.getListToComparate().add(4L);
//		vitalSigns4.getListToComparate().add(5L);
//		vitalSigns4.getListToComparate().add(6L);
//		vitalSigns4.getListToComparate().add(7L);
//		vitalSigns4.getListToComparate().add(8L);
		vitalSigns4.getListToComparate().add(9L);
//		vitalSigns4.getListToComparate().add(10L);
		vitalSigns4.getListToComparate().add(11L);
//		vitalSigns4.getListToComparate().add(12L);
		vitalSigns4.getListToComparate().add(13L);
//		vitalSigns4.getListToComparate().add(14L);
//		vitalSigns4.getListToComparate().add(15L);
//		vitalSigns4.getListToComparate().add(21L);
		caso4.setVitalSigns(vitalSigns4);
		
		//PhysicalExamination
		PhysicalExamination physicalExamination4 = new PhysicalExamination();
		physicalExamination4.setContradictionsId("contra4");
		physicalExamination4.setNegativeCharacteristicId(12L);
		physicalExamination4.setPositiveCharacteristicId(15L);
		caso4.setPhysicalExamination(physicalExamination4);
		
		CBRCase _case4 = new CBRCase();
		_case4.setDescription(caso4);
		
		CaseSolution cs4 = new CaseSolution();
		cs4.setCaseId(caso4.getCaseId());
		cs4.setName(caso4.getName());
		_case4.setSolution(cs4);
		
		res.add(_case4);
		
		/*end Caso4*/
		
		cases = res;
		
		_caseBase.learnCases(cases);
		//
		
		//
		
		//
		
		for(jcolibri.cbrcore.CBRCase c: _caseBase.getCases())
			System.out.println(c);
		return _caseBase;
	}
	
	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.BasicCBRApplication#cycle()
	 */
	public void cycle(CBRQuery query) throws ExecutionException 
	{		
		/********* NumericSim Retrieval **********/
		
		NNConfig simConfig = new NNConfig();
		simConfig.setDescriptionSimFunction(new Average());		
		
		Attribute contrAttribute = new Attribute("physicalExamination", Case.class);
		simConfig.addMapping(contrAttribute, new EqualContradiction());
		simConfig.setWeight(contrAttribute, 0.2);
		
		Attribute problemNatureAttribute = new Attribute("name", Case.class);
		simConfig.addMapping(problemNatureAttribute, new Equal());
		simConfig.setWeight(problemNatureAttribute, 0.1);
		
		Attribute cbrResourceAttribute = new Attribute("analysis", Case.class);
		simConfig.addMapping(cbrResourceAttribute, new EqualList());
		simConfig.setWeight(cbrResourceAttribute, 0.5);
		
		Attribute cbrContradictionAttribute = new Attribute("vitalSigns", Case.class);
		simConfig.addMapping(cbrContradictionAttribute, new EqualList());
		simConfig.setWeight(cbrContradictionAttribute, 0.2);
		
		System.out.println("Query:");
		System.out.println(query);
		System.out.println();
		
		/********* Execute NN ************/
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(cases, query, simConfig);
		System.out.println("eval: " + eval.size());
	}

	/* (non-Javadoc)
	 * @see jcolibri.cbraplications.BasicCBRApplication#postCycle()
	 */
	public void postCycle() throws ExecutionException {
		this._caseBase.close();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    	// Launch DDBB manager
	    	//jcolibri.test.database.HSQLDBserver.init();

	    TestCase test4 = new TestCase();
		try {
			//test4.configure();
			test4.preCycle();
	
			/********* Query Definition **********/
			
			/*start Caso5*/
			Case caso5 = new Case();
			caso5.setCaseId("caso5");
			caso5.setName("absceso hepatico");
			
			/*Analysis*/
			Analysis analysis5 = new Analysis();
			analysis5.setAnalysisId("analysis5");
//			analysis5.getListToComparate().add(1L);
//			analysis5.getListToComparate().add(2L);
			analysis5.getListToComparate().add(3L);
//			analysis5.getListToComparate().add(4L);
//			analysis5.getListToComparate().add(5L);
			analysis5.getListToComparate().add(6L);
//			analysis5.getListToComparate().add(7L);
			analysis5.getListToComparate().add(8L);
//			analysis5.getListToComparate().add(9L);
			analysis5.getListToComparate().add(10L);
//			analysis5.getListToComparate().add(11L);
			analysis5.getListToComparate().add(12L);
//			analysis5.getListToComparate().add(13L);
			analysis5.getListToComparate().add(14L);
			analysis5.getListToComparate().add(15L);
			analysis5.getListToComparate().add(19L);
			analysis5.getListToComparate().add(20L);
//			analysis5.getListToComparate().add(56L);
			caso5.setAnalysis(analysis5);
			
			/*VitalSigns*/
			VitalSigns vitalSigns5 = new VitalSigns();
			vitalSigns5.setVitalSignsId("vitalSigns5");
//			vitalSigns5.getListToComparate().add(1L);
			vitalSigns5.getListToComparate().add(2L);
			vitalSigns5.getListToComparate().add(3L);
//			vitalSigns5.getListToComparate().add(4L);
//			vitalSigns5.getListToComparate().add(5L);
			vitalSigns5.getListToComparate().add(6L);
//			vitalSigns5.getListToComparate().add(7L);
//			vitalSigns5.getListToComparate().add(8L);
//			vitalSigns5.getListToComparate().add(9L);
//			vitalSigns5.getListToComparate().add(10L);
			vitalSigns5.getListToComparate().add(11L);
//			vitalSigns5.getListToComparate().add(12L);
			vitalSigns5.getListToComparate().add(13L);
//			vitalSigns5.getListToComparate().add(14L);
//			vitalSigns5.getListToComparate().add(15L);
//			vitalSigns5.getListToComparate().add(16L);
//			vitalSigns5.getListToComparate().add(17L);
//			vitalSigns5.getListToComparate().add(19L);
			caso5.setVitalSigns(vitalSigns5);
			
			/*PhysicalExamination*/
			PhysicalExamination physicalExamination5 = new PhysicalExamination();
			physicalExamination5.setContradictionsId("physicalExamination5");
			physicalExamination5.setNegativeCharacteristicId(12L);
			physicalExamination5.setPositiveCharacteristicId(15L);
			caso5.setPhysicalExamination(physicalExamination5);
			
			CBRQuery query = new CBRQuery();
			query.setDescription(caso5);
			
			test4.cycle(query);
			

		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
