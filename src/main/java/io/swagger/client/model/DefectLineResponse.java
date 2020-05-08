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

/**
 * DefectLineResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class DefectLineResponse {
  @SerializedName("code")
  private String code = null;

  @SerializedName("line")
  private Integer line = null;

  @SerializedName("muted")
  private Boolean muted = null;

  public DefectLineResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Defect code
   * @return code
  **/
  @ApiModelProperty(example = "\\t\\t\\te.printStackTrace();", value = "Defect code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DefectLineResponse line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Defect line
   * @return line
  **/
  @ApiModelProperty(example = "101", value = "Defect line")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public DefectLineResponse muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Indicates if the defect is muted
   * @return muted
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the defect is muted")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectLineResponse defectLineResponse = (DefectLineResponse) o;
    return Objects.equals(this.code, defectLineResponse.code) &&
        Objects.equals(this.line, defectLineResponse.line) &&
        Objects.equals(this.muted, defectLineResponse.muted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, line, muted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectLineResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
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

