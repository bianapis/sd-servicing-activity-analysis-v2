package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord;
import org.bian.dto.CRServicingRootCauseAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRootCauseAlgorithmRequestInputModel
 */
public class BQRootCauseAlgorithmRequestInputModel   {
  private String servicingRootCauseAnalysisInstanceReference = null;

  private String rootCauseAlgorithmInstanceReference = null;

  private BQRootCauseAlgorithmEvaluateOutputModelRootCauseAlgorithmInstanceRecord rootCauseAlgorithmInstanceRecord = null;

  private Object rootCauseAlgorithmRequestActionTaskRecord = null;

  private CRServicingRootCauseAnalysisRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Servicing Root Cause Analysis instance 
   * @return servicingRootCauseAnalysisInstanceReference
  **/

  public String getServicingRootCauseAnalysisInstanceReference() {
    return servicingRootCauseAnalysisInstanceReference;
  }

  public void setServicingRootCauseAnalysisInstanceReference(String servicingRootCauseAnalysisInstanceReference) {
    this.servicingRootCauseAnalysisInstanceReference = servicingRootCauseAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Root Cause Algorithm instance 
   * @return rootCauseAlgorithmInstanceReference
  **/

  public String getRootCauseAlgorithmInstanceReference() {
    return rootCauseAlgorithmInstanceReference;
  }

  public void setRootCauseAlgorithmInstanceReference(String rootCauseAlgorithmInstanceReference) {
    this.rootCauseAlgorithmInstanceReference = rootCauseAlgorithmInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRServicingRootCauseAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRServicingRootCauseAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

