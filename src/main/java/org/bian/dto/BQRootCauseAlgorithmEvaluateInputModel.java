package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord;
import org.bian.dto.BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmEvaluateInputModel
 */
public class BQRootCauseAlgorithmEvaluateInputModel   {
  private BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String servicingRootCauseAnalysisInstanceReference = null;

  private Object rootCauseAlgorithmInitiateActionRecord = null;

  private BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Servicing Root Cause Analysis instance 
   * @return servicingRootCauseAnalysisInstanceReference
  **/

  public String getServicingRootCauseAnalysisInstanceReference() {
    return servicingRootCauseAnalysisInstanceReference;
  }

  public void setServicingRootCauseAnalysisInstanceReference(String servicingRootCauseAnalysisInstanceReference) {
    this.servicingRootCauseAnalysisInstanceReference = servicingRootCauseAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return rootCauseAlgorithmInitiateActionRecord
  **/

  public Object getRootCauseAlgorithmInitiateActionRecord() {
    return rootCauseAlgorithmInitiateActionRecord;
  }

  public void setRootCauseAlgorithmInitiateActionRecord(Object rootCauseAlgorithmInitiateActionRecord) {
    this.rootCauseAlgorithmInitiateActionRecord = rootCauseAlgorithmInitiateActionRecord;
  }


  /**
   * Get rootCauseAlgorithmInstanceRecord
   * @return rootCauseAlgorithmInstanceRecord
  **/

  public BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord getRootCauseAlgorithmInstanceRecord() {
    return rootCauseAlgorithmInstanceRecord;
  }

  public void setRootCauseAlgorithmInstanceRecord(BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord) {
    this.rootCauseAlgorithmInstanceRecord = rootCauseAlgorithmInstanceRecord;
  }


}

