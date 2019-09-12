package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord;
import org.bian.dto.CRServicingRootCauseAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRequestInputModel
 */
public class CRServicingRootCauseAnalysisRequestInputModel   {
  private String servicingActivityAnalysisServicingSessionReference = null;

  private String servicingRootCauseAnalysisInstanceReference = null;

  private CRServicingRootCauseAnalysisExecuteInputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private Object servicingRootCauseAnalysisRequestActionTaskRecord = null;

  private CRServicingRootCauseAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return servicingRootCauseAnalysisRequestActionTaskRecord
  **/

  public Object getServicingRootCauseAnalysisRequestActionTaskRecord() {
    return servicingRootCauseAnalysisRequestActionTaskRecord;
  }

  public void setServicingRootCauseAnalysisRequestActionTaskRecord(Object servicingRootCauseAnalysisRequestActionTaskRecord) {
    this.servicingRootCauseAnalysisRequestActionTaskRecord = servicingRootCauseAnalysisRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRServicingRootCauseAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRServicingRootCauseAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

