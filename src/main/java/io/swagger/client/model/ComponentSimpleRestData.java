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
 * ComponentSimpleRestData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class ComponentSimpleRestData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("description")
  private String description = null;

  public ComponentSimpleRestData id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Component identifier
   * @return id
  **/
  @ApiModelProperty(example = "357", value = "Component identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ComponentSimpleRestData artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * Artifact name
   * @return artifact
  **/
  @ApiModelProperty(example = "org.springframework:spring-core", value = "Artifact name")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public ComponentSimpleRestData version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Artifact version
   * @return version
  **/
  @ApiModelProperty(example = "3.2.13.RELEASE", value = "Artifact version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ComponentSimpleRestData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Artifact description
   * @return description
  **/
  @ApiModelProperty(example = "Spring Core", value = "Artifact description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentSimpleRestData componentSimpleRestData = (ComponentSimpleRestData) o;
    return Objects.equals(this.id, componentSimpleRestData.id) &&
        Objects.equals(this.artifact, componentSimpleRestData.artifact) &&
        Objects.equals(this.version, componentSimpleRestData.version) &&
        Objects.equals(this.description, componentSimpleRestData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, artifact, version, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentSimpleRestData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
