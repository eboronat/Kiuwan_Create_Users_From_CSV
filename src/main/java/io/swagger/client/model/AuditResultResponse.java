/*
 * Kiuwan REST API
 * Kiuwan REST API specification
 *
 * OpenAPI spec version: 2.8.1910.8-SNAPSHOT
 * Contact: support@kiuwan.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AuditResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class AuditResultResponse {
  @SerializedName("analysisCode")
  private String analysisCode = null;

  @SerializedName("passAudit")
  private Boolean passAudit = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("creationTimestamp")
  private String creationTimestamp = null;

  @SerializedName("metrics")
  private Map<String, Double> metrics = null;

  public AuditResultResponse analysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
    return this;
  }

   /**
   * Analysis code
   * @return analysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16e5b1aad2a", value = "Analysis code")
  public String getAnalysisCode() {
    return analysisCode;
  }

  public void setAnalysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
  }

  public AuditResultResponse passAudit(Boolean passAudit) {
    this.passAudit = passAudit;
    return this;
  }

   /**
   * Indicates if the audit has been passed
   * @return passAudit
  **/
  @ApiModelProperty(example = "false", value = "Indicates if the audit has been passed")
  public Boolean isPassAudit() {
    return passAudit;
  }

  public void setPassAudit(Boolean passAudit) {
    this.passAudit = passAudit;
  }

  public AuditResultResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Audit label
   * @return label
  **/
  @ApiModelProperty(example = "cr_21.11.2019", value = "Audit label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AuditResultResponse creationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Audit creation time
   * @return creationTimestamp
  **/
  @ApiModelProperty(example = "2019-11-21T12:51:40Z", value = "Audit creation time")
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public AuditResultResponse metrics(Map<String, Double> metrics) {
    this.metrics = metrics;
    return this;
  }

  public AuditResultResponse putMetricsItem(String key, Double metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<String, Double>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * Audit metrics
   * @return metrics
  **/
  @ApiModelProperty(example = "\"{'com.optimyth.CQM.defectsByPriority.Priority 2': 2,'com.optimyth.CQM.defectsByPriority.Priority 3': 1}\"", value = "Audit metrics")
  public Map<String, Double> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, Double> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditResultResponse auditResultResponse = (AuditResultResponse) o;
    return Objects.equals(this.analysisCode, auditResultResponse.analysisCode) &&
        Objects.equals(this.passAudit, auditResultResponse.passAudit) &&
        Objects.equals(this.label, auditResultResponse.label) &&
        Objects.equals(this.creationTimestamp, auditResultResponse.creationTimestamp) &&
        Objects.equals(this.metrics, auditResultResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisCode, passAudit, label, creationTimestamp, metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditResultResponse {\n");
    
    sb.append("    analysisCode: ").append(toIndentedString(analysisCode)).append("\n");
    sb.append("    passAudit: ").append(toIndentedString(passAudit)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

