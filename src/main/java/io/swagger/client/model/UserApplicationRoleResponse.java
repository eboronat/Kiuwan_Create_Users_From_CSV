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
 * UserApplicationRoleResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class UserApplicationRoleResponse {
  @SerializedName("username")
  private String username = null;

  @SerializedName("roleName")
  private String roleName = null;

  @SerializedName("override")
  private Boolean override = null;

  public UserApplicationRoleResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name
   * @return username
  **/
  @ApiModelProperty(example = "username", value = "User name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserApplicationRoleResponse roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Role name
   * @return roleName
  **/
  @ApiModelProperty(example = "None", value = "Role name")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public UserApplicationRoleResponse override(Boolean override) {
    this.override = override;
    return this;
  }

   /**
   * Indicates if override the configuration or not
   * @return override
  **/
  @ApiModelProperty(example = "true", value = "Indicates if override the configuration or not")
  public Boolean isOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserApplicationRoleResponse userApplicationRoleResponse = (UserApplicationRoleResponse) o;
    return Objects.equals(this.username, userApplicationRoleResponse.username) &&
        Objects.equals(this.roleName, userApplicationRoleResponse.roleName) &&
        Objects.equals(this.override, userApplicationRoleResponse.override);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, roleName, override);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserApplicationRoleResponse {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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
