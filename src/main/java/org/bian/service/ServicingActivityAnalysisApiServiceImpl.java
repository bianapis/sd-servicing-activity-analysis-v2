/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingActivityAnalysisApiServiceImpl implements ServicingActivityAnalysisApiService {

	public SDServicingActivityAnalysisActivateOutputModel activate(SDServicingActivityAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDServicingActivityAnalysisActivateOutputModel.json",new TypeReference<SDServicingActivityAnalysisActivateOutputModel>(){});
	}
	
	public SDServicingActivityAnalysisConfigureOutputModel configure(String sdReferenceId, SDServicingActivityAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDServicingActivityAnalysisConfigureOutputModel.json",new TypeReference<SDServicingActivityAnalysisConfigureOutputModel>(){});
	}
	
	public CRServicingRootCauseAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRServicingRootCauseAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRServicingRootCauseAnalysisEvaluateOutputModel.json",new TypeReference<CRServicingRootCauseAnalysisEvaluateOutputModel>(){});
	}
	
	public BQRootCauseAlgorithmEvaluateOutputModel evaluateRootcausealgorithm(String sdReferenceId, String crReferenceId, BQRootCauseAlgorithmEvaluateInputModel request){
		return JsonReader.read("evaluate-BQRootCauseAlgorithmEvaluateOutputModel.json",new TypeReference<BQRootCauseAlgorithmEvaluateOutputModel>(){});
	}
	
	public CRServicingRootCauseAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRServicingRootCauseAnalysisExecuteOutputModel.json",new TypeReference<CRServicingRootCauseAnalysisExecuteOutputModel>(){});
	}
	
	public SDServicingActivityAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDServicingActivityAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDServicingActivityAnalysisFeedbackOutputModel.json",new TypeReference<SDServicingActivityAnalysisFeedbackOutputModel>(){});
	}
	
	public BQRootCauseAlgorithmRequestOutputModel requestRootcausealgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRootCauseAlgorithmRequestInputModel request){
		return JsonReader.read("request-BQRootCauseAlgorithmRequestOutputModel.json",new TypeReference<BQRootCauseAlgorithmRequestOutputModel>(){});
	}
	
	public CRServicingRootCauseAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisRequestInputModel request){
		return JsonReader.read("request-CRServicingRootCauseAnalysisRequestOutputModel.json",new TypeReference<CRServicingRootCauseAnalysisRequestOutputModel>(){});
	}
	
	public SDServicingActivityAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDServicingActivityAnalysisRetrieveOutputModel.json",new TypeReference<SDServicingActivityAnalysisRetrieveOutputModel>(){});
	}
	
	public CRServicingRootCauseAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRServicingRootCauseAnalysisRetrieveOutputModel.json",new TypeReference<CRServicingRootCauseAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQRootCauseAlgorithmRetrieveOutputModel retrieveRootcausealgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRootCauseAlgorithmRetrieveOutputModel.json",new TypeReference<BQRootCauseAlgorithmRetrieveOutputModel>(){});
	}
	
	public CRServicingRootCauseAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingRootCauseAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRServicingRootCauseAnalysisUpdateOutputModel.json",new TypeReference<CRServicingRootCauseAnalysisUpdateOutputModel>(){});
	}
	
}
