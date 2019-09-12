package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord;
import org.bian.dto.BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmEvaluateOutputModel
 */
public class BQRootCauseAlgorithmEvaluateOutputModel   {
  private BQRootCauseAlgorithmEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String rootCauseAlgorithmInstanceReference = null;

  private String rootCauseAlgorithmInitiateActionReference = null;

  private Object rootCauseAlgorithmInitiateActionRecord = null;

  private String rootCauseAlgorithmInstanceStatus = null;

  private BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Root Cause Algorithm instance 
   * @return rootCauseAlgorithmInstanceReference
  **/

  public String getRootCauseAlgorithmInstanceReference() {
    return rootCauseAlgorithmInstanceReference;
  }

  public void setRootCauseAlgorithmInstanceReference(String rootCauseAlgorithmInstanceReference) {
    this.rootCauseAlgorithmInstanceReference = rootCauseAlgorithmInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return rootCauseAlgorithmInitiateActionReference
  **/

  public String getRootCauseAlgorithmInitiateActionReference() {
    return rootCauseAlgorithmInitiateActionReference;
  }

  public void setRootCauseAlgorithmInitiateActionReference(String rootCauseAlgorithmInitiateActionReference) {
    this.rootCauseAlgorithmInitiateActionReference = rootCauseAlgorithmInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Root Cause Algorithm instance (e.g. initialised, pending, active) 
   * @return rootCauseAlgorithmInstanceStatus
  **/

  public String getRootCauseAlgorithmInstanceStatus() {
    return rootCauseAlgorithmInstanceStatus;
  }

  public void setRootCauseAlgorithmInstanceStatus(String rootCauseAlgorithmInstanceStatus) {
    this.rootCauseAlgorithmInstanceStatus = rootCauseAlgorithmInstanceStatus;
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


}

