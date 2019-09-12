package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord
 */
public class CRServicingRootCauseAnalysisRetrieveOutputModelServicingRootCauseAnalysisInstanceReportRecord   {
  private String servicingRootCauseAnalysisInstanceReportData = null;

  private String servicingRootCauseAnalysisInstanceReportType = null;

  private Object servicingRootCauseAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return servicingRootCauseAnalysisInstanceReportData
  **/

  public String getServicingRootCauseAnalysisInstanceReportData() {
    return servicingRootCauseAnalysisInstanceReportData;
  }

  public void setServicingRootCauseAnalysisInstanceReportData(String servicingRootCauseAnalysisInstanceReportData) {
    this.servicingRootCauseAnalysisInstanceReportData = servicingRootCauseAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingRootCauseAnalysisInstanceReportType
  **/

  public String getServicingRootCauseAnalysisInstanceReportType() {
    return servicingRootCauseAnalysisInstanceReportType;
  }

  public void setServicingRootCauseAnalysisInstanceReportType(String servicingRootCauseAnalysisInstanceReportType) {
    this.servicingRootCauseAnalysisInstanceReportType = servicingRootCauseAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return servicingRootCauseAnalysisInstanceReport
  **/

  public Object getServicingRootCauseAnalysisInstanceReport() {
    return servicingRootCauseAnalysisInstanceReport;
  }

  public void setServicingRootCauseAnalysisInstanceReport(Object servicingRootCauseAnalysisInstanceReport) {
    this.servicingRootCauseAnalysisInstanceReport = servicingRootCauseAnalysisInstanceReport;
  }


}

