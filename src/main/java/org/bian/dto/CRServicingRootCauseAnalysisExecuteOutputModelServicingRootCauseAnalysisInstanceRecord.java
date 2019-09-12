package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord
 */
public class CRServicingRootCauseAnalysisExecuteOutputModelServicingRootCauseAnalysisInstanceRecord   {
  private String servicingActivityType = null;

  private String servicingActivityAnalysisPeriod = null;

  private String servicingActivityAnalysisType = null;

  private String servicingActivityAnalysisResult = null;

  private String servicingActivityAnalysisDetermination = null;

  private Object servicingActivityHistoryReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of servicing activity for which the analysis is performed (e.g. self service, contact center assisted, ATM access) 
   * @return servicingActivityType
  **/

  public String getServicingActivityType() {
    return servicingActivityType;
  }

  public void setServicingActivityType(String servicingActivityType) {
    this.servicingActivityType = servicingActivityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period covered by the analysis (from to date time) 
   * @return servicingActivityAnalysisPeriod
  **/

  public String getServicingActivityAnalysisPeriod() {
    return servicingActivityAnalysisPeriod;
  }

  public void setServicingActivityAnalysisPeriod(String servicingActivityAnalysisPeriod) {
    this.servicingActivityAnalysisPeriod = servicingActivityAnalysisPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of root cause analysis - defines the scope and type of root cause issue that is being detected (e.g. service dialogue, click-stream, product processing issues, servicing representative performance) 
   * @return servicingActivityAnalysisType
  **/

  public String getServicingActivityAnalysisType() {
    return servicingActivityAnalysisType;
  }

  public void setServicingActivityAnalysisType(String servicingActivityAnalysisType) {
    this.servicingActivityAnalysisType = servicingActivityAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the servicing activity analysis - typically the consolidated view from applying multiple underlying root cause algorithms to highlight patterns that indicate potential root cause issues 
   * @return servicingActivityAnalysisResult
  **/

  public String getServicingActivityAnalysisResult() {
    return servicingActivityAnalysisResult;
  }

  public void setServicingActivityAnalysisResult(String servicingActivityAnalysisResult) {
    this.servicingActivityAnalysisResult = servicingActivityAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An analysis of the root causes for the detected service anomalies 
   * @return servicingActivityAnalysisDetermination
  **/

  public String getServicingActivityAnalysisDetermination() {
    return servicingActivityAnalysisDetermination;
  }

  public void setServicingActivityAnalysisDetermination(String servicingActivityAnalysisDetermination) {
    this.servicingActivityAnalysisDetermination = servicingActivityAnalysisDetermination;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The raw data used in the analysis (retrieved from Servicing Activity History) 
   * @return servicingActivityHistoryReport
  **/

  public Object getServicingActivityHistoryReport() {
    return servicingActivityHistoryReport;
  }

  public void setServicingActivityHistoryReport(Object servicingActivityHistoryReport) {
    this.servicingActivityHistoryReport = servicingActivityHistoryReport;
  }


}

