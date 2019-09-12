package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis
 */
public class CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceAnalysis   {
  private String servicingRootCauseAnalysisInstanceAnalysisData = null;

  private String servicingRootCauseAnalysisInstanceAnalysisReportType = null;

  private Object servicingRootCauseAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return servicingRootCauseAnalysisInstanceAnalysisData
  **/

  public String getServicingRootCauseAnalysisInstanceAnalysisData() {
    return servicingRootCauseAnalysisInstanceAnalysisData;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysisData(String servicingRootCauseAnalysisInstanceAnalysisData) {
    this.servicingRootCauseAnalysisInstanceAnalysisData = servicingRootCauseAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return servicingRootCauseAnalysisInstanceAnalysisReportType
  **/

  public String getServicingRootCauseAnalysisInstanceAnalysisReportType() {
    return servicingRootCauseAnalysisInstanceAnalysisReportType;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysisReportType(String servicingRootCauseAnalysisInstanceAnalysisReportType) {
    this.servicingRootCauseAnalysisInstanceAnalysisReportType = servicingRootCauseAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return servicingRootCauseAnalysisInstanceAnalysisReport
  **/

  public Object getServicingRootCauseAnalysisInstanceAnalysisReport() {
    return servicingRootCauseAnalysisInstanceAnalysisReport;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysisReport(Object servicingRootCauseAnalysisInstanceAnalysisReport) {
    this.servicingRootCauseAnalysisInstanceAnalysisReport = servicingRootCauseAnalysisInstanceAnalysisReport;
  }


}

