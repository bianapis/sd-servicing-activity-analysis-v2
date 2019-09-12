package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisExecuteOutputModel
 */
public class CRServicingRootCauseAnalysisExecuteOutputModel   {
  private CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String servicingRootCauseAnalysisExecuteActionTaskReference = null;

  private Object servicingRootCauseAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get servicingRootCauseAnalysisInstanceRecord
   * @return servicingRootCauseAnalysisInstanceRecord
  **/

  public CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Root Cause Analysis instance execute service call 
   * @return servicingRootCauseAnalysisExecuteActionTaskReference
  **/

  public String getServicingRootCauseAnalysisExecuteActionTaskReference() {
    return servicingRootCauseAnalysisExecuteActionTaskReference;
  }

  public void setServicingRootCauseAnalysisExecuteActionTaskReference(String servicingRootCauseAnalysisExecuteActionTaskReference) {
    this.servicingRootCauseAnalysisExecuteActionTaskReference = servicingRootCauseAnalysisExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return servicingRootCauseAnalysisExecuteActionTaskRecord
  **/

  public Object getServicingRootCauseAnalysisExecuteActionTaskRecord() {
    return servicingRootCauseAnalysisExecuteActionTaskRecord;
  }

  public void setServicingRootCauseAnalysisExecuteActionTaskRecord(Object servicingRootCauseAnalysisExecuteActionTaskRecord) {
    this.servicingRootCauseAnalysisExecuteActionTaskRecord = servicingRootCauseAnalysisExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

