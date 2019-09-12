/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingActivityAnalysisApiService {

	SDServicingActivityAnalysisActivateOutputModel activate(SDServicingActivityAnalysisActivateInputModel request);
	
	SDServicingActivityAnalysisConfigureOutputModel configure(String sdReferenceId, SDServicingActivityAnalysisConfigureInputModel request);
	
	CRServicingRootCauseAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRServicingRootCauseAnalysisEvaluateInputModel request);
	
	BQRootCauseAlgorithmEvaluateOutputModel evaluateRootcausealgorithm(String sdReferenceId, String crReferenceId, BQRootCauseAlgorithmEvaluateInputModel request);
	
	CRServicingRootCauseAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisExecuteInputModel request);
	
	SDServicingActivityAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDServicingActivityAnalysisFeedbackInputModel request);
	
	BQRootCauseAlgorithmRequestOutputModel requestRootcausealgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRootCauseAlgorithmRequestInputModel request);
	
	CRServicingRootCauseAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisRequestInputModel request);
	
	SDServicingActivityAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRServicingRootCauseAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQRootCauseAlgorithmRetrieveOutputModel retrieveRootcausealgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRServicingRootCauseAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisUpdateInputModel request);
	
}
