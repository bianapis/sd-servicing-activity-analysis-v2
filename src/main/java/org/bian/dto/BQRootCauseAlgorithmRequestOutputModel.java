package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRequestOutputModel
 */
public class BQRootCauseAlgorithmRequestOutputModel   {
  private BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord = null;

  private String rootCauseAlgorithmRequestActionTaskReference = null;

  private Object rootCauseAlgorithmRequestActionTaskRecord = null;

  private String rootCauseAlgorithmRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get rootCauseAlgorithmInstanceRecord
   * @return rootCauseAlgorithmInstanceRecord
  **/

  public BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord getRootCauseAlgorithmInstanceRecord() {
    return rootCauseAlgorithmInstanceRecord;
  }

  public void setRootCauseAlgorithmInstanceRecord(BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord) {
    this.rootCauseAlgorithmInstanceRecord = rootCauseAlgorithmInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Root Cause Algorithm instance request service call 
   * @return rootCauseAlgorithmRequestActionTaskReference
  **/

  public String getRootCauseAlgorithmRequestActionTaskReference() {
    return rootCauseAlgorithmRequestActionTaskReference;
  }

  public void setRootCauseAlgorithmRequestActionTaskReference(String rootCauseAlgorithmRequestActionTaskReference) {
    this.rootCauseAlgorithmRequestActionTaskReference = rootCauseAlgorithmRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return rootCauseAlgorithmRequestActionTaskRecord
  **/

  public Object getRootCauseAlgorithmRequestActionTaskRecord() {
    return rootCauseAlgorithmRequestActionTaskRecord;
  }

  public void setRootCauseAlgorithmRequestActionTaskRecord(Object rootCauseAlgorithmRequestActionTaskRecord) {
    this.rootCauseAlgorithmRequestActionTaskRecord = rootCauseAlgorithmRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Root Cause Algorithm service request record 
   * @return rootCauseAlgorithmRequestRecordReference
  **/

  public String getRootCauseAlgorithmRequestRecordReference() {
    return rootCauseAlgorithmRequestRecordReference;
  }

  public void setRootCauseAlgorithmRequestRecordReference(String rootCauseAlgorithmRequestRecordReference) {
    this.rootCauseAlgorithmRequestRecordReference = rootCauseAlgorithmRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

