package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis;
import org.bian.dto.BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRetrieveInputModel
 */
public class BQRootCauseAlgorithmRetrieveInputModel   {
  private Object rootCauseAlgorithmRetrieveActionTaskRecord = null;

  private String rootCauseAlgorithmRetrieveActionRequest = null;

  private BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceReport rootCauseAlgorithmInstanceReport = null;

  private BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis rootCauseAlgorithmInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rootCauseAlgorithmRetrieveActionTaskRecord
  **/

  public Object getRootCauseAlgorithmRetrieveActionTaskRecord() {
    return rootCauseAlgorithmRetrieveActionTaskRecord;
  }

  public void setRootCauseAlgorithmRetrieveActionTaskRecord(Object rootCauseAlgorithmRetrieveActionTaskRecord) {
    this.rootCauseAlgorithmRetrieveActionTaskRecord = rootCauseAlgorithmRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rootCauseAlgorithmRetrieveActionRequest
  **/

  public String getRootCauseAlgorithmRetrieveActionRequest() {
    return rootCauseAlgorithmRetrieveActionRequest;
  }

  public void setRootCauseAlgorithmRetrieveActionRequest(String rootCauseAlgorithmRetrieveActionRequest) {
    this.rootCauseAlgorithmRetrieveActionRequest = rootCauseAlgorithmRetrieveActionRequest;
  }


  /**
   * Get rootCauseAlgorithmInstanceReport
   * @return rootCauseAlgorithmInstanceReport
  **/

  public BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceReport getRootCauseAlgorithmInstanceReport() {
    return rootCauseAlgorithmInstanceReport;
  }

  public void setRootCauseAlgorithmInstanceReport(BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceReport rootCauseAlgorithmInstanceReport) {
    this.rootCauseAlgorithmInstanceReport = rootCauseAlgorithmInstanceReport;
  }


  /**
   * Get rootCauseAlgorithmInstanceAnalysis
   * @return rootCauseAlgorithmInstanceAnalysis
  **/

  public BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis getRootCauseAlgorithmInstanceAnalysis() {
    return rootCauseAlgorithmInstanceAnalysis;
  }

  public void setRootCauseAlgorithmInstanceAnalysis(BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis rootCauseAlgorithmInstanceAnalysis) {
    this.rootCauseAlgorithmInstanceAnalysis = rootCauseAlgorithmInstanceAnalysis;
  }


}

