package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis
 */
public class BQRootCauseAlgorithmRetrieveInputModelRootCauseAlgorithmInstanceAnalysis   {
  private String rootCauseAlgorithmInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return rootCauseAlgorithmInstanceAnalysisReference
  **/

  public String getRootCauseAlgorithmInstanceAnalysisReference() {
    return rootCauseAlgorithmInstanceAnalysisReference;
  }

  public void setRootCauseAlgorithmInstanceAnalysisReference(String rootCauseAlgorithmInstanceAnalysisReference) {
    this.rootCauseAlgorithmInstanceAnalysisReference = rootCauseAlgorithmInstanceAnalysisReference;
  }


}

