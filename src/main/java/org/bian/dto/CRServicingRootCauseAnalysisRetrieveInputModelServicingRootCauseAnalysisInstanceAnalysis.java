package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis
 */
public class CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceAnalysis   {
  private String servicingRootCauseAnalysisInstanceAnalysisReference = null;

  private String servicingRootCauseAnalysisInstanceAnalysisReportType = null;

  private String servicingRootCauseAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return servicingRootCauseAnalysisInstanceAnalysisReference
  **/

  public String getServicingRootCauseAnalysisInstanceAnalysisReference() {
    return servicingRootCauseAnalysisInstanceAnalysisReference;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysisReference(String servicingRootCauseAnalysisInstanceAnalysisReference) {
    this.servicingRootCauseAnalysisInstanceAnalysisReference = servicingRootCauseAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return servicingRootCauseAnalysisInstanceAnalysisParameters
  **/

  public String getServicingRootCauseAnalysisInstanceAnalysisParameters() {
    return servicingRootCauseAnalysisInstanceAnalysisParameters;
  }

  public void setServicingRootCauseAnalysisInstanceAnalysisParameters(String servicingRootCauseAnalysisInstanceAnalysisParameters) {
    this.servicingRootCauseAnalysisInstanceAnalysisParameters = servicingRootCauseAnalysisInstanceAnalysisParameters;
  }


}

