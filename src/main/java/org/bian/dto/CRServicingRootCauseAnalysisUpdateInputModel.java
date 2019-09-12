package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisUpdateInputModel
 */
public class CRServicingRootCauseAnalysisUpdateInputModel   {
  private String servicingActivityAnalysisServicingSessionReference = null;

  private String servicingRootCauseAnalysisInstanceReference = null;

  private CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private Object servicingRootCauseAnalysisUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing Root Cause Analysis instance 
   * @return servicingRootCauseAnalysisInstanceReference
  **/

  public String getServicingRootCauseAnalysisInstanceReference() {
    return servicingRootCauseAnalysisInstanceReference;
  }

  public void setServicingRootCauseAnalysisInstanceReference(String servicingRootCauseAnalysisInstanceReference) {
    this.servicingRootCauseAnalysisInstanceReference = servicingRootCauseAnalysisInstanceReference;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceRecord
   * @return servicingRootCauseAnalysisInstanceRecord
  **/

  public CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingRootCauseAnalysisUpdateActionTaskRecord
  **/

  public Object getServicingRootCauseAnalysisUpdateActionTaskRecord() {
    return servicingRootCauseAnalysisUpdateActionTaskRecord;
  }

  public void setServicingRootCauseAnalysisUpdateActionTaskRecord(Object servicingRootCauseAnalysisUpdateActionTaskRecord) {
    this.servicingRootCauseAnalysisUpdateActionTaskRecord = servicingRootCauseAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

