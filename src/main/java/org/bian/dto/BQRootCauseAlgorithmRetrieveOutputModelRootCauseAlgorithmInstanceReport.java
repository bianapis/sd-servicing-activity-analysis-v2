package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport
 */
public class BQRootCauseAlgorithmRetrieveOutputModelRootCauseAlgorithmInstanceReport   {
  private Object rootCauseAlgorithmInstanceReportRecord = null;

  private String rootCauseAlgorithmInstanceReportType = null;

  private String rootCauseAlgorithmInstanceReportParameters = null;

  private Object rootCauseAlgorithmInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return rootCauseAlgorithmInstanceReportRecord
  **/

  public Object getRootCauseAlgorithmInstanceReportRecord() {
    return rootCauseAlgorithmInstanceReportRecord;
  }

  public void setRootCauseAlgorithmInstanceReportRecord(Object rootCauseAlgorithmInstanceReportRecord) {
    this.rootCauseAlgorithmInstanceReportRecord = rootCauseAlgorithmInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rootCauseAlgorithmInstanceReportType
  **/

  public String getRootCauseAlgorithmInstanceReportType() {
    return rootCauseAlgorithmInstanceReportType;
  }

  public void setRootCauseAlgorithmInstanceReportType(String rootCauseAlgorithmInstanceReportType) {
    this.rootCauseAlgorithmInstanceReportType = rootCauseAlgorithmInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return rootCauseAlgorithmInstanceReportParameters
  **/

  public String getRootCauseAlgorithmInstanceReportParameters() {
    return rootCauseAlgorithmInstanceReportParameters;
  }

  public void setRootCauseAlgorithmInstanceReportParameters(String rootCauseAlgorithmInstanceReportParameters) {
    this.rootCauseAlgorithmInstanceReportParameters = rootCauseAlgorithmInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return rootCauseAlgorithmInstanceReport
  **/

  public Object getRootCauseAlgorithmInstanceReport() {
    return rootCauseAlgorithmInstanceReport;
  }

  public void setRootCauseAlgorithmInstanceReport(Object rootCauseAlgorithmInstanceReport) {
    this.rootCauseAlgorithmInstanceReport = rootCauseAlgorithmInstanceReport;
  }


}

