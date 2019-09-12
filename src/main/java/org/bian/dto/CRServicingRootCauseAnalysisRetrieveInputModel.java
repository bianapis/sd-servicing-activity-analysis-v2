package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis;
import org.bian.dto.CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveInputModel
 */
public class CRServicingRootCauseAnalysisRetrieveInputModel   {
  private Object servicingRootCauseAnalysisRetrieveActionTaskRecord = null;

  private String servicingRootCauseAnalysisRetrieveActionRequest = null;

  private CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord servicingRootCauseAnalysisInstanceReportRecord = null;

  private CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis servicingRootCauseAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return servicingRootCauseAnalysisRetrieveActionRequest
  **/

  public String getServicingRootCauseAnalysisRetrieveActionRequest() {
    return servicingRootCauseAnalysisRetrieveActionRequest;
  }

  public void setServicingRootCauseAnalysisRetrieveActionRequest(String servicingRootCauseAnalysisRetrieveActionRequest) {
    this.servicingRootCauseAnalysisRetrieveActionRequest = servicingRootCauseAnalysisRetrieveActionRequest;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceReportRecord
   * @return servicingRootCauseAnalysisInstanceReportRecord
  **/

  public CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord getServicingRootCauseAnalysisInstanceReportRecord() {
    return servicingRootCauseAnalysisInstanceReportRecord;
  }

  public void setServicingRootCauseAnalysisInstanceReportRecord(CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord servicingRootCauseAnalysisInstanceReportRecord) {
    this.servicingRootCauseAnalysisInstanceReportRecord = servicingRootCauseAnalysisInstanceReportRecord;
  }


  /**
   * Get servicingRootCauseAnalysisInstanceAnalysis
   * @return servicingRootCauseAnalysisInstanceAnalysis
  **/

  public CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis getServicingRootCauseAnalysisInstanceAnalysis() {
    return servicingRootCauseAnalysisInstanceAnalysis;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysis(CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis servicingRootCauseAnalysisInstanceAnalysis) {
    this.servicingRootCauseAnalysisInstanceAnalysis = servicingRootCauseAnalysisInstanceAnalysis;
  }


}

