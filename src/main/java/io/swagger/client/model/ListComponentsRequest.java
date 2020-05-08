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
import io.swagger.client.model.FilterData;
import io.swagger.client.model.PaginationData;
import java.io.IOException;

/**
 * It is necessary to indicate the name of the application or the analysis code
 */
@ApiModel(description = "It is necessary to indicate the name of the application or the analysis code")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class ListComponentsRequest {
  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("analysisCode")
  private String analysisCode = null;

  @SerializedName("pagination")
  private PaginationData pagination = null;

  @SerializedName("filter")
  private FilterData filter = null;

  public ListComponentsRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Application name
   * @return applicationName
  **/
  @ApiModelProperty(example = "myApp", value = "Application name")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public ListComponentsRequest analysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
    return this;
  }

   /**
   * Analysis Code
   * @return analysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16dc9e29131", value = "Analysis Code")
  public String getAnalysisCode() {
    return analysisCode;
  }

  public void setAnalysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
  }

  public ListComponentsRequest pagination(PaginationData pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "Pagination")
  public PaginationData getPagination() {
    return pagination;
  }

  public void setPagination(PaginationData pagination) {
    this.pagination = pagination;
  }

  public ListComponentsRequest filter(FilterData filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filter
   * @return filter
  **/
  @ApiModelProperty(value = "Filter")
  public FilterData getFilter() {
    return filter;
  }

  public void setFilter(FilterData filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListComponentsRequest listComponentsRequest = (ListComponentsRequest) o;
    return Objects.equals(this.applicationName, listComponentsRequest.applicationName) &&
        Objects.equals(this.analysisCode, listComponentsRequest.analysisCode) &&
        Objects.equals(this.pagination, listComponentsRequest.pagination) &&
        Objects.equals(this.filter, listComponentsRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, analysisCode, pagination, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListComponentsRequest {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    analysisCode: ").append(toIndentedString(analysisCode)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

