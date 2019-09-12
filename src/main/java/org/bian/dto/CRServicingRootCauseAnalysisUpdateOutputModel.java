package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisUpdateOutputModel
 */
public class CRServicingRootCauseAnalysisUpdateOutputModel   {
  private CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String servicingRootCauseAnalysisUpdateActionTaskReference = null;

  private Object servicingRootCauseAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return servicingRootCauseAnalysisUpdateActionTaskReference
  **/

  public String getServicingRootCauseAnalysisUpdateActionTaskReference() {
    return servicingRootCauseAnalysisUpdateActionTaskReference;
  }

  public void setServicingRootCauseAnalysisUpdateActionTaskReference(String servicingRootCauseAnalysisUpdateActionTaskReference) {
    this.servicingRootCauseAnalysisUpdateActionTaskReference = servicingRootCauseAnalysisUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

