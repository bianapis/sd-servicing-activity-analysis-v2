package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord
 */
public class BQRootCauseAlgorithmEvaluateInputModelRootCauseAlgorithmInstanceRecord   {
  private String servicingActivityRootCauseAlgorithmSpecification = null;

  private String servicingActivityRootCauseAnalysisWorkTaskType = null;

  private String servicingActivityRootCauseAnalysisWorkTask = null;

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

