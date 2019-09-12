package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisEvaluateInputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisEvaluateInputModel
 */
public class CRServicingRootCauseAnalysisEvaluateInputModel   {
  private String servicingActivityAnalysisServicingSessionReference = null;

  private Object servicingRootCauseAnalysisEvaluateActionRecord = null;

  private String servicingRootCauseAnalysisInstanceStatus = null;

  private CRServicingRootCauseAnalysisEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return servicingActivityAnalysisServicingSessionReference
  **/

  public String getServicingActivityAnalysisServicingSessionReference() {
    return servicingActivityAnalysisServicingSessionReference;
  }

  public void setServicingActivityAnalysisServicingSessionReference(String servicingActivityAnalysisServicingSessionReference) {
    this.servicingActivityAnalysisServicingSessionReference = servicingActivityAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return servicingRootCauseAnalysisEvaluateActionRecord
  **/

  public Object getServicingRootCauseAnalysisEvaluateActionRecord() {
    return servicingRootCauseAnalysisEvaluateActionRecord;
  }

  public void setServicingRootCauseAnalysisEvaluateActionRecord(Object servicingRootCauseAnalysisEvaluateActionRecord) {
    this.servicingRootCauseAnalysisEvaluateActionRecord = servicingRootCauseAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing Root Cause Analysis instance (e.g. initialised, pending, active) 
   * @return servicingRootCauseAnalysisInstanceStatus
  **/

  public String getServicingRootCauseAnalysisInstanceStatus() {
    return servicingRootCauseAnalysisInstanceStatus;
  }

  public void setServicingRootCauseAnalysisInstanceStatus(String servicingRootCauseAnalysisInstanceStatus) {
    this.servicingRootCauseAnalysisInstanceStatus = servicingRootCauseAnalysisInstanceStatus;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceRecord
   * @return servicingRootCauseAnalysisInstanceRecord
  **/

  public CRServicingRootCauseAnalysisEvaluateInputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(CRServicingRootCauseAnalysisEvaluateInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
  }


}

