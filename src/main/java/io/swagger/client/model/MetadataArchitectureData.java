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
import io.swagger.client.model.ValueCountData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MetadataArchitectureData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class MetadataArchitectureData {
  @SerializedName("languages")
  private List<ValueCountData> languages = null;

  @SerializedName("types")
  private List<ValueCountData> types = null;

  @SerializedName("relations")
  private List<ValueCountData> relations = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("groupTags")
  private Map<String, List<String>> groupTags = null;

  public MetadataArchitectureData languages(List<ValueCountData> languages) {
    this.languages = languages;
    return this;
  }

  public MetadataArchitectureData addLanguagesItem(ValueCountData languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<ValueCountData>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Number of different languages
   * @return languages
  **/
  @ApiModelProperty(value = "Number of different languages")
  public List<ValueCountData> getLanguages() {
    return languages;
  }

  public void setLanguages(List<ValueCountData> languages) {
    this.languages = languages;
  }

  public MetadataArchitectureData types(List<ValueCountData> types) {
    this.types = types;
    return this;
  }

  public MetadataArchitectureData addTypesItem(ValueCountData typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<ValueCountData>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Number of different types
   * @return types
  **/
  @ApiModelProperty(value = "Number of different types")
  public List<ValueCountData> getTypes() {
    return types;
  }

  public void setTypes(List<ValueCountData> types) {
    this.types = types;
  }

  public MetadataArchitectureData relations(List<ValueCountData> relations) {
    this.relations = relations;
    return this;
  }

  public MetadataArchitectureData addRelationsItem(ValueCountData relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<ValueCountData>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Number of relations
   * @return relations
  **/
  @ApiModelProperty(value = "Number of relations")
  public List<ValueCountData> getRelations() {
    return relations;
  }

  public void setRelations(List<ValueCountData> relations) {
    this.relations = relations;
  }

  public MetadataArchitectureData tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetadataArchitectureData addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags
   * @return tags
  **/
  @ApiModelProperty(example = "\"tag1\"", value = "List of tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MetadataArchitectureData groupTags(Map<String, List<String>> groupTags) {
    this.groupTags = groupTags;
    return this;
  }

  public MetadataArchitectureData putGroupTagsItem(String key, List<String> groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new HashMap<String, List<String>>();
    }
    this.groupTags.put(key, groupTagsItem);
    return this;
  }

   /**
   * List of groups
   * @return groupTags
  **/
  @ApiModelProperty(example = "\"group1\"", value = "List of groups")
  public Map<String, List<String>> getGroupTags() {
    return groupTags;
  }

  public void setGroupTags(Map<String, List<String>> groupTags) {
    this.groupTags = groupTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataArchitectureData metadataArchitectureData = (MetadataArchitectureData) o;
    return Objects.equals(this.languages, metadataArchitectureData.languages) &&
        Objects.equals(this.types, metadataArchitectureData.types) &&
        Objects.equals(this.relations, metadataArchitectureData.relations) &&
        Objects.equals(this.tags, metadataArchitectureData.tags) &&
        Objects.equals(this.groupTags, metadataArchitectureData.groupTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languages, types, relations, tags, groupTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataArchitectureData {\n");
    
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
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

