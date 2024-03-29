package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord
 */
public class CRServicingRootCauseAnalysisRetrieveInputModelServicingRootCauseAnalysisInstanceReportRecord   {
  private String servicingRootCauseAnalysisInstanceReportReference = null;

  private String servicingRootCauseAnalysisInstanceReportType = null;

  private String servicingRootCauseAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return servicingRootCauseAnalysisInstanceReportReference
  **/

  public String getServicingRootCauseAnalysisInstanceReportReference() {
    return servicingRootCauseAnalysisInstanceReportReference;
  }

  public void setServicingRootCauseAnalysisInstanceReportReference(String servicingRootCauseAnalysisInstanceReportReference) {
    this.servicingRootCauseAnalysisInstanceReportReference = servicingRootCauseAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return servicingRootCauseAnalysisInstanceReportParameters
  **/

  public String getServicingRootCauseAnalysisInstanceReportParameters() {
    return servicingRootCauseAnalysisInstanceReportParameters;
  }

  public void setServicingRootCauseAnalysisInstanceReportParameters(String servicingRootCauseAnalysisInstanceReportParameters) {
    this.servicingRootCauseAnalysisInstanceReportParameters = servicingRootCauseAnalysisInstanceReportParameters;
  }


}

