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
 * RelationRestData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class RelationRestData {
  @SerializedName("source")
  private Long source = null;

  @SerializedName("target")
  private Long target = null;

  @SerializedName("type")
  private String type = null;

  public RelationRestData source(Long source) {
    this.source = source;
    return this;
  }

   /**
   * Source
   * @return source
  **/
  @ApiModelProperty(example = "5473", value = "Source")
  public Long getSource() {
    return source;
  }

  public void setSource(Long source) {
    this.source = source;
  }

  public RelationRestData target(Long target) {
    this.target = target;
    return this;
  }

   /**
   * Target
   * @return target
  **/
  @ApiModelProperty(example = "5468", value = "Target")
  public Long getTarget() {
    return target;
  }

  public void setTarget(Long target) {
    this.target = target;
  }

  public RelationRestData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Relation type
   * @return type
  **/
  @ApiModelProperty(example = "uses", value = "Relation type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationRestData relationRestData = (RelationRestData) o;
    return Objects.equals(this.source, relationRestData.source) &&
        Objects.equals(this.target, relationRestData.target) &&
        Objects.equals(this.type, relationRestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationRestData {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

