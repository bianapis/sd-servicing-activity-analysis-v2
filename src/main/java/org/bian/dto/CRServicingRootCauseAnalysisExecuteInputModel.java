package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisExecuteInputModel
 */
public class CRServicingRootCauseAnalysisExecuteInputModel   {
  private String servicingActivityAnalysisServicingSessionReference = null;

  private String servicingRootCauseAnalysisInstanceReference = null;

  private CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private Object servicingRootCauseAnalysisExecuteActionTaskRecord = null;

  private CRServicingRootCauseAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord getServicingRootCauseAnalysisInstanceRecord() {
    return servicingRootCauseAnalysisInstanceRecord;
  }

  public void setServicingRootCauseAnalysisInstanceRecord(CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord) {
    this.servicingRootCauseAnalysisInstanceRecord = servicingRootCauseAnalysisInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRServicingRootCauseAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRServicingRootCauseAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

