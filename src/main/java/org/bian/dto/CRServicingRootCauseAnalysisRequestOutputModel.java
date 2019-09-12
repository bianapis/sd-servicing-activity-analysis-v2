package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRequestOutputModel
 */
public class CRServicingRootCauseAnalysisRequestOutputModel   {
  private CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String servicingRootCauseAnalysisRequestActionTaskReference = null;

  private Object servicingRootCauseAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Root Cause Analysis instance request service call 
   * @return servicingRootCauseAnalysisRequestActionTaskReference
  **/

  public String getServicingRootCauseAnalysisRequestActionTaskReference() {
    return servicingRootCauseAnalysisRequestActionTaskReference;
  }

  public void setServicingRootCauseAnalysisRequestActionTaskReference(String servicingRootCauseAnalysisRequestActionTaskReference) {
    this.servicingRootCauseAnalysisRequestActionTaskReference = servicingRootCauseAnalysisRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

