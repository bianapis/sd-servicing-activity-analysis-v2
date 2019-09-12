package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord;
import org.bian.dto.BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord;
import org.bian.dto.BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis;
import org.bian.dto.BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRetrieveOutputModel
 */
public class BQRootCauseAlgorithmRetrieveOutputModel   {
  private BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord = null;

  private String rootCauseAlgorithmRetrieveActionTaskReference = null;

  private Object rootCauseAlgorithmRetrieveActionTaskRecord = null;

  private String rootCauseAlgorithmRetrieveActionResponse = null;

  private BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport rootCauseAlgorithmInstanceReport = null;

  private BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis rootCauseAlgorithmInstanceAnalysis = null;


  /**
   * Get servicingRootCauseAnalysisInstanceRecord
   * @return servicingRootCauseAnalysisInstanceRecord
  **/

  public BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
  }


  /**
   * Get rootCauseAlgorithmInstanceRecord
   * @return rootCauseAlgorithmInstanceRecord
  **/

  public BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord getRootCauseAlgorithmInstanceRecord() {
    return rootCauseAlgorithmInstanceRecord;
  }

  public void setRootCauseAlgorithmInstanceRecord(BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord) {
    this.rootCauseAlgorithmInstanceRecord = rootCauseAlgorithmInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Root Cause Algorithm instance retrieve service call 
   * @return rootCauseAlgorithmRetrieveActionTaskReference
  **/

  public String getRootCauseAlgorithmRetrieveActionTaskReference() {
    return rootCauseAlgorithmRetrieveActionTaskReference;
  }

  public void setRootCauseAlgorithmRetrieveActionTaskReference(String rootCauseAlgorithmRetrieveActionTaskReference) {
    this.rootCauseAlgorithmRetrieveActionTaskReference = rootCauseAlgorithmRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rootCauseAlgorithmRetrieveActionTaskRecord
  **/

  public Object getRootCauseAlgorithmRetrieveActionTaskRecord() {
    return rootCauseAlgorithmRetrieveActionTaskRecord;
  }

  public void setRootCauseAlgorithmRetrieveActionTaskRecord(Object rootCauseAlgorithmRetrieveActionTaskRecord) {
    this.rootCauseAlgorithmRetrieveActionTaskRecord = rootCauseAlgorithmRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rootCauseAlgorithmRetrieveActionResponse
  **/

  public String getRootCauseAlgorithmRetrieveActionResponse() {
    return rootCauseAlgorithmRetrieveActionResponse;
  }

  public void setRootCauseAlgorithmRetrieveActionResponse(String rootCauseAlgorithmRetrieveActionResponse) {
    this.rootCauseAlgorithmRetrieveActionResponse = rootCauseAlgorithmRetrieveActionResponse;
  }


  /**
   * Get rootCauseAlgorithmInstanceReport
   * @return rootCauseAlgorithmInstanceReport
  **/

  public BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport getRootCauseAlgorithmInstanceReport() {
    return rootCauseAlgorithmInstanceReport;
  }

  public void setRootCauseAlgorithmInstanceReport(BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport rootCauseAlgorithmInstanceReport) {
    this.rootCauseAlgorithmInstanceReport = rootCauseAlgorithmInstanceReport;
  }


  /**
   * Get rootCauseAlgorithmInstanceAnalysis
   * @return rootCauseAlgorithmInstanceAnalysis
  **/

  public BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis getRootCauseAlgorithmInstanceAnalysis() {
    return rootCauseAlgorithmInstanceAnalysis;
  }

  public void setRootCauseAlgorithmInstanceAnalysis(BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis rootCauseAlgorithmInstanceAnalysis) {
    this.rootCauseAlgorithmInstanceAnalysis = rootCauseAlgorithmInstanceAnalysis;
  }


}

