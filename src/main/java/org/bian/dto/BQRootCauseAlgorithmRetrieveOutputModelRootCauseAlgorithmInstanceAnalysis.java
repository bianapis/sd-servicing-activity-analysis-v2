package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis
 */
public class BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceAnalysis   {
  private Object rootCauseAlgorithmInstanceAnalysisRecord = null;

  private String rootCauseAlgorithmInstanceAnalysisReportType = null;

  private String rootCauseAlgorithmInstanceAnalysisParameters = null;

  private Object rootCauseAlgorithmInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return rootCauseAlgorithmInstanceAnalysisRecord
  **/

  public Object getRootCauseAlgorithmInstanceAnalysisRecord() {
    return rootCauseAlgorithmInstanceAnalysisRecord;
  }

  public void setRootCauseAlgorithmInstanceAnalysisRecord(Object rootCauseAlgorithmInstanceAnalysisRecord) {
    this.rootCauseAlgorithmInstanceAnalysisRecord = rootCauseAlgorithmInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return rootCauseAlgorithmInstanceAnalysisReportType
  **/

  public String getRootCauseAlgorithmInstanceAnalysisReportType() {
    return rootCauseAlgorithmInstanceAnalysisReportType;
  }

  public void setRootCauseAlgorithmInstanceAnalysisReportType(String rootCauseAlgorithmInstanceAnalysisReportType) {
    this.rootCauseAlgorithmInstanceAnalysisReportType = rootCauseAlgorithmInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return rootCauseAlgorithmInstanceAnalysisParameters
  **/

  public String getRootCauseAlgorithmInstanceAnalysisParameters() {
    return rootCauseAlgorithmInstanceAnalysisParameters;
  }

  public void setRootCauseAlgorithmInstanceAnalysisParameters(String rootCauseAlgorithmInstanceAnalysisParameters) {
    this.rootCauseAlgorithmInstanceAnalysisParameters = rootCauseAlgorithmInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return rootCauseAlgorithmInstanceAnalysisReport
  **/

  public Object getRootCauseAlgorithmInstanceAnalysisReport() {
    return rootCauseAlgorithmInstanceAnalysisReport;
  }

  public void setRootCauseAlgorithmInstanceAnalysisReport(Object rootCauseAlgorithmInstanceAnalysisReport) {
    this.rootCauseAlgorithmInstanceAnalysisReport = rootCauseAlgorithmInstanceAnalysisReport;
  }


}

