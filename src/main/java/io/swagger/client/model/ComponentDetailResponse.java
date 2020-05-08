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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ComponentDetailResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class ComponentDetailResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("dn")
  private String dn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("tags")
  private List<Object> tags = null;

  @SerializedName("grouptags")
  private Map<String, String> grouptags = null;

  @SerializedName("artifacts")
  private List<Object> artifacts = null;

  @SerializedName("analyzed")
  private Boolean analyzed = null;

  @SerializedName("loc")
  private Double loc = null;

  @SerializedName("quality")
  private Double quality = null;

  @SerializedName("dupCode")
  private Double dupCode = null;

  @SerializedName("ccn")
  private Double ccn = null;

  @SerializedName("effort")
  private Double effort = null;

  @SerializedName("groupedCount")
  private Integer groupedCount = null;

  @SerializedName("other")
  private Map<String, Object> other = null;

  public ComponentDetailResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(example = "23", value = "Identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ComponentDetailResponse dn(String dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Name identifier description
   * @return dn
  **/
  @ApiModelProperty(example = "app=myApp,class=com.myCompany.myApp.file.CSRFServlet", value = "Name identifier description")
  public String getDn() {
    return dn;
  }

  public void setDn(String dn) {
    this.dn = dn;
  }

  public ComponentDetailResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Component name
   * @return name
  **/
  @ApiModelProperty(example = "com.myCompany.myApp.CSRFServlet", value = "Component name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentDetailResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Component type
   * @return type
  **/
  @ApiModelProperty(example = "class", value = "Component type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ComponentDetailResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language
   * @return language
  **/
  @ApiModelProperty(example = "java", value = "Language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ComponentDetailResponse tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public ComponentDetailResponse addTagsItem(Object tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Object>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Component Tags
   * @return tags
  **/
  @ApiModelProperty(example = "\"Security,CSRF\"", value = "Component Tags")
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public ComponentDetailResponse grouptags(Map<String, String> grouptags) {
    this.grouptags = grouptags;
    return this;
  }

  public ComponentDetailResponse putGrouptagsItem(String key, String grouptagsItem) {
    if (this.grouptags == null) {
      this.grouptags = new HashMap<String, String>();
    }
    this.grouptags.put(key, grouptagsItem);
    return this;
  }

   /**
   * Map of group tags
   * @return grouptags
  **/
  @ApiModelProperty(example = "\"{'Servlet': 'FileServlet'}\"", value = "Map of group tags")
  public Map<String, String> getGrouptags() {
    return grouptags;
  }

  public void setGrouptags(Map<String, String> grouptags) {
    this.grouptags = grouptags;
  }

  public ComponentDetailResponse artifacts(List<Object> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public ComponentDetailResponse addArtifactsItem(Object artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<Object>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Artifacts list
   * @return artifacts
  **/
  @ApiModelProperty(example = "\"{0}/src/main/java/com/myCompany/myApp/CSRFServlet\"", value = "Artifacts list")
  public List<Object> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Object> artifacts) {
    this.artifacts = artifacts;
  }

  public ComponentDetailResponse analyzed(Boolean analyzed) {
    this.analyzed = analyzed;
    return this;
  }

   /**
   * Analyzed
   * @return analyzed
  **/
  @ApiModelProperty(example = "true", value = "Analyzed")
  public Boolean isAnalyzed() {
    return analyzed;
  }

  public void setAnalyzed(Boolean analyzed) {
    this.analyzed = analyzed;
  }

  public ComponentDetailResponse loc(Double loc) {
    this.loc = loc;
    return this;
  }

   /**
   * Lines of code
   * @return loc
  **/
  @ApiModelProperty(example = "210.0", value = "Lines of code")
  public Double getLoc() {
    return loc;
  }

  public void setLoc(Double loc) {
    this.loc = loc;
  }

  public ComponentDetailResponse quality(Double quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality indicator value
   * @return quality
  **/
  @ApiModelProperty(value = "Quality indicator value")
  public Double getQuality() {
    return quality;
  }

  public void setQuality(Double quality) {
    this.quality = quality;
  }

  public ComponentDetailResponse dupCode(Double dupCode) {
    this.dupCode = dupCode;
    return this;
  }

   /**
   * Duplicated code
   * @return dupCode
  **/
  @ApiModelProperty(value = "Duplicated code")
  public Double getDupCode() {
    return dupCode;
  }

  public void setDupCode(Double dupCode) {
    this.dupCode = dupCode;
  }

  public ComponentDetailResponse ccn(Double ccn) {
    this.ccn = ccn;
    return this;
  }

   /**
   * Cyclomatic complexity number
   * @return ccn
  **/
  @ApiModelProperty(example = "15.0", value = "Cyclomatic complexity number")
  public Double getCcn() {
    return ccn;
  }

  public void setCcn(Double ccn) {
    this.ccn = ccn;
  }

  public ComponentDetailResponse effort(Double effort) {
    this.effort = effort;
    return this;
  }

   /**
   * Effort value
   * @return effort
  **/
  @ApiModelProperty(value = "Effort value")
  public Double getEffort() {
    return effort;
  }

  public void setEffort(Double effort) {
    this.effort = effort;
  }

  public ComponentDetailResponse groupedCount(Integer groupedCount) {
    this.groupedCount = groupedCount;
    return this;
  }

   /**
   * Grouped count
   * @return groupedCount
  **/
  @ApiModelProperty(example = "1", value = "Grouped count")
  public Integer getGroupedCount() {
    return groupedCount;
  }

  public void setGroupedCount(Integer groupedCount) {
    this.groupedCount = groupedCount;
  }

  public ComponentDetailResponse other(Map<String, Object> other) {
    this.other = other;
    return this;
  }

  public ComponentDetailResponse putOtherItem(String key, Object otherItem) {
    if (this.other == null) {
      this.other = new HashMap<String, Object>();
    }
    this.other.put(key, otherItem);
    return this;
  }

   /**
   * Map of additional properties
   * @return other
  **/
  @ApiModelProperty(example = "\"{ 'componentType': 'class', 'j2eeType': 'class', 'description': 'class java' }\"", value = "Map of additional properties")
  public Map<String, Object> getOther() {
    return other;
  }

  public void setOther(Map<String, Object> other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDetailResponse componentDetailResponse = (ComponentDetailResponse) o;
    return Objects.equals(this.id, componentDetailResponse.id) &&
        Objects.equals(this.dn, componentDetailResponse.dn) &&
        Objects.equals(this.name, componentDetailResponse.name) &&
        Objects.equals(this.type, componentDetailResponse.type) &&
        Objects.equals(this.language, componentDetailResponse.language) &&
        Objects.equals(this.tags, componentDetailResponse.tags) &&
        Objects.equals(this.grouptags, componentDetailResponse.grouptags) &&
        Objects.equals(this.artifacts, componentDetailResponse.artifacts) &&
        Objects.equals(this.analyzed, componentDetailResponse.analyzed) &&
        Objects.equals(this.loc, componentDetailResponse.loc) &&
        Objects.equals(this.quality, componentDetailResponse.quality) &&
        Objects.equals(this.dupCode, componentDetailResponse.dupCode) &&
        Objects.equals(this.ccn, componentDetailResponse.ccn) &&
        Objects.equals(this.effort, componentDetailResponse.effort) &&
        Objects.equals(this.groupedCount, componentDetailResponse.groupedCount) &&
        Objects.equals(this.other, componentDetailResponse.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dn, name, type, language, tags, grouptags, artifacts, analyzed, loc, quality, dupCode, ccn, effort, groupedCount, other);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDetailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    grouptags: ").append(toIndentedString(grouptags)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    analyzed: ").append(toIndentedString(analyzed)).append("\n");
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    dupCode: ").append(toIndentedString(dupCode)).append("\n");
    sb.append("    ccn: ").append(toIndentedString(ccn)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    groupedCount: ").append(toIndentedString(groupedCount)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
