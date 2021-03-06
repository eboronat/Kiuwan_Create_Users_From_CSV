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
 * UserInformationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class UserInformationResponse {
  @SerializedName("username")
  private String username = null;

  @SerializedName("organization")
  private String organization = null;

  public UserInformationResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name
   * @return username
  **/
  @ApiModelProperty(example = "John Smith", value = "User name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserInformationResponse organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Organization name
   * @return organization
  **/
  @ApiModelProperty(example = "MyCompany", value = "Organization name")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInformationResponse userInformationResponse = (UserInformationResponse) o;
    return Objects.equals(this.username, userInformationResponse.username) &&
        Objects.equals(this.organization, userInformationResponse.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInformationResponse {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

