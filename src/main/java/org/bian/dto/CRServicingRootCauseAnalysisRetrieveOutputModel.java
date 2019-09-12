package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord;
import org.bian.dto.CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis;
import org.bian.dto.CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveOutputModel
 */
public class CRServicingRootCauseAnalysisRetrieveOutputModel   {
  private CRServicingRootCauseAnalysisEvaluateOutputModelServicingRootCauseAnalysisInstanceRecord servicingRootCauseAnalysisInstanceRecord = null;

  private String servicingRootCauseAnalysisRetrieveActionTaskReference = null;

  private Object servicingRootCauseAnalysisRetrieveActionTaskRecord = null;

  private String servicingRootCauseAnalysisRetrieveActionResponse = null;

  private CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord servicingRootCauseAnalysisInstanceReportRecord = null;

  private CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis servicingRootCauseAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Root Cause Analysis instance retrieve service call 
   * @return servicingRootCauseAnalysisRetrieveActionTaskReference
  **/

  public String getServicingRootCauseAnalysisRetrieveActionTaskReference() {
    return servicingRootCauseAnalysisRetrieveActionTaskReference;
  }

  public void setServicingRootCauseAnalysisRetrieveActionTaskReference(String servicingRootCauseAnalysisRetrieveActionTaskReference) {
    this.servicingRootCauseAnalysisRetrieveActionTaskReference = servicingRootCauseAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return servicingRootCauseAnalysisRetrieveActionTaskRecord
  **/

  public Object getServicingRootCauseAnalysisRetrieveActionTaskRecord() {
    return servicingRootCauseAnalysisRetrieveActionTaskRecord;
  }

  public void setServicingRootCauseAnalysisRetrieveActionTaskRecord(Object servicingRootCauseAnalysisRetrieveActionTaskRecord) {
    this.servicingRootCauseAnalysisRetrieveActionTaskRecord = servicingRootCauseAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return servicingRootCauseAnalysisRetrieveActionResponse
  **/

  public String getServicingRootCauseAnalysisRetrieveActionResponse() {
    return servicingRootCauseAnalysisRetrieveActionResponse;
  }

  public void setServicingRootCauseAnalysisRetrieveActionResponse(String servicingRootCauseAnalysisRetrieveActionResponse) {
    this.servicingRootCauseAnalysisRetrieveActionResponse = servicingRootCauseAnalysisRetrieveActionResponse;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceReportRecord
   * @return servicingRootCauseAnalysisInstanceReportRecord
  **/

  public CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord getServicingRootCauseAnalysisInstanceReportRecord() {
    return servicingRootCauseAnalysisInstanceReportRecord;
  }

  public void setServicingRootCauseAnalysisInstanceReportRecord(CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord servicingRootCauseAnalysisInstanceReportRecord) {
    this.servicingRootCauseAnalysisInstanceReportRecord = servicingRootCauseAnalysisInstanceReportRecord;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceAnalysis
   * @return servicingRootCauseAnalysisInstanceAnalysis
  **/

  public CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis getServicingRootCauseAnalysisInstanceAnalysis() {
    return servicingRootCauseAnalysisInstanceAnalysis;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysis(CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis servicingRootCauseAnalysisInstanceAnalysis) {
    this.servicingRootCauseAnalysisInstanceAnalysis = servicingRootCauseAnalysisInstanceAnalysis;
  }


}

