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
 * DefectNoteResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class DefectNoteResponse {
  @SerializedName("date")
  private String date = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("text")
  private String text = null;

  public DefectNoteResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Note date
   * @return date
  **/
  @ApiModelProperty(example = "2019/05/02 14:26", value = "Note date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DefectNoteResponse user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User name
   * @return user
  **/
  @ApiModelProperty(example = "John Smith", value = "User name")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DefectNoteResponse text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Note description
   * @return text
  **/
  @ApiModelProperty(example = "To review by security experts", value = "Note description")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectNoteResponse defectNoteResponse = (DefectNoteResponse) o;
    return Objects.equals(this.date, defectNoteResponse.date) &&
        Objects.equals(this.user, defectNoteResponse.user) &&
        Objects.equals(this.text, defectNoteResponse.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, user, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectNoteResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

