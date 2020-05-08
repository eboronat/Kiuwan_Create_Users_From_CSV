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
 * FrameData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class FrameData {
  @SerializedName("index")
  private Integer index = null;

  @SerializedName("file")
  private String file = null;

  @SerializedName("lineNumber")
  private Integer lineNumber = null;

  @SerializedName("lineText")
  private String lineText = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("container")
  private String container = null;

  @SerializedName("injectionPoint")
  private String injectionPoint = null;

  @SerializedName("variableDeclaration")
  private String variableDeclaration = null;

  public FrameData index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Frame index
   * @return index
  **/
  @ApiModelProperty(example = "0", value = "Frame index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public FrameData file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Frame file
   * @return file
  **/
  @ApiModelProperty(example = "FileSystemRepository.java", value = "Frame file")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public FrameData lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Line number
   * @return lineNumber
  **/
  @ApiModelProperty(example = "32", value = "Line number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public FrameData lineText(String lineText) {
    this.lineText = lineText;
    return this;
  }

   /**
   * Line text
   * @return lineText
  **/
  @ApiModelProperty(example = "   String val = request.getParameter(item);", value = "Line text")
  public String getLineText() {
    return lineText;
  }

  public void setLineText(String lineText) {
    this.lineText = lineText;
  }

  public FrameData category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Frame category
   * @return category
  **/
  @ApiModelProperty(example = "user_input", value = "Frame category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public FrameData resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource
   * @return resource
  **/
  @ApiModelProperty(example = "web", value = "Resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public FrameData container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Container
   * @return container
  **/
  @ApiModelProperty(example = "java.util.Map sanitizeNull(java.util.List,javax.servlet.http.HttpServletRequest)", value = "Container")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public FrameData injectionPoint(String injectionPoint) {
    this.injectionPoint = injectionPoint;
    return this;
  }

   /**
   * InjectionPoint
   * @return injectionPoint
  **/
  @ApiModelProperty(value = "InjectionPoint")
  public String getInjectionPoint() {
    return injectionPoint;
  }

  public void setInjectionPoint(String injectionPoint) {
    this.injectionPoint = injectionPoint;
  }

  public FrameData variableDeclaration(String variableDeclaration) {
    this.variableDeclaration = variableDeclaration;
    return this;
  }

   /**
   * Variable declaration
   * @return variableDeclaration
  **/
  @ApiModelProperty(value = "Variable declaration")
  public String getVariableDeclaration() {
    return variableDeclaration;
  }

  public void setVariableDeclaration(String variableDeclaration) {
    this.variableDeclaration = variableDeclaration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameData frameData = (FrameData) o;
    return Objects.equals(this.index, frameData.index) &&
        Objects.equals(this.file, frameData.file) &&
        Objects.equals(this.lineNumber, frameData.lineNumber) &&
        Objects.equals(this.lineText, frameData.lineText) &&
        Objects.equals(this.category, frameData.category) &&
        Objects.equals(this.resource, frameData.resource) &&
        Objects.equals(this.container, frameData.container) &&
        Objects.equals(this.injectionPoint, frameData.injectionPoint) &&
        Objects.equals(this.variableDeclaration, frameData.variableDeclaration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, file, lineNumber, lineText, category, resource, container, injectionPoint, variableDeclaration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameData {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    lineText: ").append(toIndentedString(lineText)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    injectionPoint: ").append(toIndentedString(injectionPoint)).append("\n");
    sb.append("    variableDeclaration: ").append(toIndentedString(variableDeclaration)).append("\n");
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

