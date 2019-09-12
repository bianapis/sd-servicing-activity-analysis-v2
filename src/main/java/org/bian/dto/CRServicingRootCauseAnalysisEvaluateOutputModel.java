package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisEvaluateOutputModel
 */
public class CRServicingRootCauseAnalysisEvaluateOutputModel   {
  private String servicingRootCauseAnalysisInstanceReference = null;

  private String servicingRootCauseAnalysisEvaluateActionReference = null;

  private Object servicingRootCauseAnalysisEvaluateActionRecord = null;

  private String servicingRootCauseAnalysisInstanceStatus = null;

  private CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return servicingRootCauseAnalysisEvaluateActionReference
  **/

  public String getServicingRootCauseAnalysisEvaluateActionReference() {
    return servicingRootCauseAnalysisEvaluateActionReference;
  }

  public void setServicingRootCauseAnalysisEvaluateActionReference(String servicingRootCauseAnalysisEvaluateActionReference) {
    this.servicingRootCauseAnalysisEvaluateActionReference = servicingRootCauseAnalysisEvaluateActionReference;
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

  public CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
  }


}

