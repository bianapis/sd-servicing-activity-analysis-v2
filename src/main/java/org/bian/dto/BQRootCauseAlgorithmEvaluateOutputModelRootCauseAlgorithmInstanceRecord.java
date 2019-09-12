package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord
 */
public class BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord   {
  private String servicingActivityRootCauseAlgorithmSpecification = null;

  private String servicingActivityRootCauseAnalysisWorkTaskType = null;

  private String servicingActivityRootCauseAnalysisWorkTask = null;

  private String servicingActivityRootCauseAnalysisWorkTaskWorkProducts = null;

  private String servicingActivityRootCauseAnalysisWorkTaskResult = null;

  private String servicingActivityRootCauseAnalysisWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the algorithm used and its intended analytical insights 
   * @return servicingActivityRootCauseAlgorithmSpecification
  **/

  public String getServicingActivityRootCauseAlgorithmSpecification() {
    return servicingActivityRootCauseAlgorithmSpecification;
  }

  public void setServicingActivityRootCauseAlgorithmSpecification(String servicingActivityRootCauseAlgorithmSpecification) {
    this.servicingActivityRootCauseAlgorithmSpecification = servicingActivityRootCauseAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. consolidate servicing activity history, apply pattern detection, refine/qualify detected servicing pattern definition) 
   * @return servicingActivityRootCauseAnalysisWorkTaskType
  **/

  public String getServicingActivityRootCauseAnalysisWorkTaskType() {
    return servicingActivityRootCauseAnalysisWorkTaskType;
  }

  public void setServicingActivityRootCauseAnalysisWorkTaskType(String servicingActivityRootCauseAnalysisWorkTaskType) {
    this.servicingActivityRootCauseAnalysisWorkTaskType = servicingActivityRootCauseAnalysisWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make-up/schedule of the work task performed 
   * @return servicingActivityRootCauseAnalysisWorkTask
  **/

  public String getServicingActivityRootCauseAnalysisWorkTask() {
    return servicingActivityRootCauseAnalysisWorkTask;
  }

  public void setServicingActivityRootCauseAnalysisWorkTask(String servicingActivityRootCauseAnalysisWorkTask) {
    this.servicingActivityRootCauseAnalysisWorkTask = servicingActivityRootCauseAnalysisWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, evaluations and findings for the work task 
   * @return servicingActivityRootCauseAnalysisWorkTaskWorkProducts
  **/

  public String getServicingActivityRootCauseAnalysisWorkTaskWorkProducts() {
    return servicingActivityRootCauseAnalysisWorkTaskWorkProducts;
  }

  public void setServicingActivityRootCauseAnalysisWorkTaskWorkProducts(String servicingActivityRootCauseAnalysisWorkTaskWorkProducts) {
    this.servicingActivityRootCauseAnalysisWorkTaskWorkProducts = servicingActivityRootCauseAnalysisWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - indication of the nature of any identified servicing patterns and the associated root cause hypotheses 
   * @return servicingActivityRootCauseAnalysisWorkTaskResult
  **/

  public String getServicingActivityRootCauseAnalysisWorkTaskResult() {
    return servicingActivityRootCauseAnalysisWorkTaskResult;
  }

  public void setServicingActivityRootCauseAnalysisWorkTaskResult(String servicingActivityRootCauseAnalysisWorkTaskResult) {
    this.servicingActivityRootCauseAnalysisWorkTaskResult = servicingActivityRootCauseAnalysisWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the specific work task is performed 
   * @return servicingActivityRootCauseAnalysisWorkTaskDateTime
  **/

  public String getServicingActivityRootCauseAnalysisWorkTaskDateTime() {
    return servicingActivityRootCauseAnalysisWorkTaskDateTime;
  }

  public void setServicingActivityRootCauseAnalysisWorkTaskDateTime(String servicingActivityRootCauseAnalysisWorkTaskDateTime) {
    this.servicingActivityRootCauseAnalysisWorkTaskDateTime = servicingActivityRootCauseAnalysisWorkTaskDateTime;
  }


}

