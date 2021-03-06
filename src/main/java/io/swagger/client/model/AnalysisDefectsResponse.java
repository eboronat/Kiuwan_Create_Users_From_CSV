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
import io.swagger.client.model.DefectDetailResponse;
import io.swagger.client.model.MetadataArchitectureData;
import io.swagger.client.model.MetadataInsightsData;
import io.swagger.client.model.MetricValueData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AnalysisDefectsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class AnalysisDefectsResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("auditName")
  private String auditName = null;

  /**
   * Application business value
   */
  @JsonAdapter(ApplicationBusinessValueEnum.Adapter.class)
  public enum ApplicationBusinessValueEnum {
    VERY_LOW("VERY LOW"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    ApplicationBusinessValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationBusinessValueEnum fromValue(String text) {
      for (ApplicationBusinessValueEnum b : ApplicationBusinessValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicationBusinessValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationBusinessValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationBusinessValueEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationBusinessValueEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("applicationBusinessValue")
  private ApplicationBusinessValueEnum applicationBusinessValue = null;

  @SerializedName("applicationProvider")
  private String applicationProvider = null;

  @SerializedName("applicationPortfolios")
  private Map<String, String> applicationPortfolios = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("modelId")
  private Long modelId = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("analysisCode")
  private String analysisCode = null;

  @SerializedName("analysisURL")
  private String analysisURL = null;

  @SerializedName("auditResultURL")
  private String auditResultURL = null;

  /**
   * Analysis business value
   */
  @JsonAdapter(AnalysisBusinessValueEnum.Adapter.class)
  public enum AnalysisBusinessValueEnum {
    VERY_LOW("VERY LOW"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    AnalysisBusinessValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnalysisBusinessValueEnum fromValue(String text) {
      for (AnalysisBusinessValueEnum b : AnalysisBusinessValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnalysisBusinessValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisBusinessValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnalysisBusinessValueEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnalysisBusinessValueEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("analysisBusinessValue")
  private AnalysisBusinessValueEnum analysisBusinessValue = null;

  @SerializedName("analysisProvider")
  private String analysisProvider = null;

  @SerializedName("analysisPortfolios")
  private Map<String, String> analysisPortfolios = null;

  /**
   * Analysis status
   */
  @JsonAdapter(AnalysisStatusEnum.Adapter.class)
  public enum AnalysisStatusEnum {
    EXECUTING("EXECUTING"),
    
    FINISHED("FINISHED"),
    
    FINISHED_WITH_ERROR("FINISHED_WITH_ERROR");

    private String value;

    AnalysisStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnalysisStatusEnum fromValue(String text) {
      for (AnalysisStatusEnum b : AnalysisStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnalysisStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnalysisStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnalysisStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("analysisStatus")
  private AnalysisStatusEnum analysisStatus = null;

  @SerializedName("languages")
  private List<MetricValueData> languages = null;

  @SerializedName("architecture")
  private MetadataArchitectureData architecture = null;

  @SerializedName("insightsData")
  private MetadataInsightsData insightsData = null;

  @SerializedName("defects_count")
  private Integer defectsCount = null;

  @SerializedName("activeDefects_count")
  private Integer activeDefectsCount = null;

  @SerializedName("supressedDefects_count")
  private Integer supressedDefectsCount = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("defects")
  private List<DefectDetailResponse> defects = null;

  @SerializedName("quality_model")
  private String qualityModel = null;

  @SerializedName("ordered_by")
  private String orderedBy = null;

  @SerializedName("Risk index")
  private MetricValueData riskIndex = null;

  @SerializedName("Quality indicator")
  private MetricValueData qualityIndicator = null;

  @SerializedName("Effort to target")
  private MetricValueData effortToTarget = null;

  @SerializedName("Main metrics")
  private List<MetricValueData> mainMetrics = null;

  @SerializedName("Security")
  private Map<String, Object> security = null;

  public AnalysisDefectsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application name
   * @return name
  **/
  @ApiModelProperty(example = "android", value = "Application name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnalysisDefectsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Application description
   * @return description
  **/
  @ApiModelProperty(example = "GitHub Android App", value = "Application description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AnalysisDefectsResponse auditName(String auditName) {
    this.auditName = auditName;
    return this;
  }

   /**
   * Application audit name
   * @return auditName
  **/
  @ApiModelProperty(example = "Kiuwan default audit", value = "Application audit name")
  public String getAuditName() {
    return auditName;
  }

  public void setAuditName(String auditName) {
    this.auditName = auditName;
  }

  public AnalysisDefectsResponse applicationBusinessValue(ApplicationBusinessValueEnum applicationBusinessValue) {
    this.applicationBusinessValue = applicationBusinessValue;
    return this;
  }

   /**
   * Application business value
   * @return applicationBusinessValue
  **/
  @ApiModelProperty(example = "CRITICAL", value = "Application business value")
  public ApplicationBusinessValueEnum getApplicationBusinessValue() {
    return applicationBusinessValue;
  }

  public void setApplicationBusinessValue(ApplicationBusinessValueEnum applicationBusinessValue) {
    this.applicationBusinessValue = applicationBusinessValue;
  }

  public AnalysisDefectsResponse applicationProvider(String applicationProvider) {
    this.applicationProvider = applicationProvider;
    return this;
  }

   /**
   * Application provider
   * @return applicationProvider
  **/
  @ApiModelProperty(example = "Lab", value = "Application provider")
  public String getApplicationProvider() {
    return applicationProvider;
  }

  public void setApplicationProvider(String applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  public AnalysisDefectsResponse applicationPortfolios(Map<String, String> applicationPortfolios) {
    this.applicationPortfolios = applicationPortfolios;
    return this;
  }

  public AnalysisDefectsResponse putApplicationPortfoliosItem(String key, String applicationPortfoliosItem) {
    if (this.applicationPortfolios == null) {
      this.applicationPortfolios = new HashMap<String, String>();
    }
    this.applicationPortfolios.put(key, applicationPortfoliosItem);
    return this;
  }

   /**
   * Map of application portfolios
   * @return applicationPortfolios
  **/
  @ApiModelProperty(example = "\"{ 'country': 'spain' }\"", value = "Map of application portfolios")
  public Map<String, String> getApplicationPortfolios() {
    return applicationPortfolios;
  }

  public void setApplicationPortfolios(Map<String, String> applicationPortfolios) {
    this.applicationPortfolios = applicationPortfolios;
  }

  public AnalysisDefectsResponse label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Analysis label
   * @return label
  **/
  @ApiModelProperty(example = "14.10.2019_1", value = "Analysis label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AnalysisDefectsResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Analysis creation date
   * @return date
  **/
  @ApiModelProperty(example = "2019-10-14T15:15:15Z", value = "Analysis creation date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AnalysisDefectsResponse modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Analysis model identifier
   * @return modelId
  **/
  @ApiModelProperty(example = "6252", value = "Analysis model identifier")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public AnalysisDefectsResponse encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Analysis encoding
   * @return encoding
  **/
  @ApiModelProperty(example = "UTF-8", value = "Analysis encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public AnalysisDefectsResponse analysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
    return this;
  }

   /**
   * Analysis code
   * @return analysisCode
  **/
  @ApiModelProperty(example = "A-ZBA-234820349", value = "Analysis code")
  public String getAnalysisCode() {
    return analysisCode;
  }

  public void setAnalysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
  }

  public AnalysisDefectsResponse analysisURL(String analysisURL) {
    this.analysisURL = analysisURL;
    return this;
  }

   /**
   * Kiuwan link to view the analysis detail
   * @return analysisURL
  **/
  @ApiModelProperty(example = "https://www.kiuwan.com/saas/web/dashboard/dashboard#$pe=application$sei=2401$mi=dashboard$ac=A-ZBA-234820349", value = "Kiuwan link to view the analysis detail")
  public String getAnalysisURL() {
    return analysisURL;
  }

  public void setAnalysisURL(String analysisURL) {
    this.analysisURL = analysisURL;
  }

  public AnalysisDefectsResponse auditResultURL(String auditResultURL) {
    this.auditResultURL = auditResultURL;
    return this;
  }

   /**
   * Kiuwan link to view the audit result of the analisys
   * @return auditResultURL
  **/
  @ApiModelProperty(value = "Kiuwan link to view the audit result of the analisys")
  public String getAuditResultURL() {
    return auditResultURL;
  }

  public void setAuditResultURL(String auditResultURL) {
    this.auditResultURL = auditResultURL;
  }

  public AnalysisDefectsResponse analysisBusinessValue(AnalysisBusinessValueEnum analysisBusinessValue) {
    this.analysisBusinessValue = analysisBusinessValue;
    return this;
  }

   /**
   * Analysis business value
   * @return analysisBusinessValue
  **/
  @ApiModelProperty(example = "CRITICAL", value = "Analysis business value")
  public AnalysisBusinessValueEnum getAnalysisBusinessValue() {
    return analysisBusinessValue;
  }

  public void setAnalysisBusinessValue(AnalysisBusinessValueEnum analysisBusinessValue) {
    this.analysisBusinessValue = analysisBusinessValue;
  }

  public AnalysisDefectsResponse analysisProvider(String analysisProvider) {
    this.analysisProvider = analysisProvider;
    return this;
  }

   /**
   * Analysis provider
   * @return analysisProvider
  **/
  @ApiModelProperty(example = "Lab", value = "Analysis provider")
  public String getAnalysisProvider() {
    return analysisProvider;
  }

  public void setAnalysisProvider(String analysisProvider) {
    this.analysisProvider = analysisProvider;
  }

  public AnalysisDefectsResponse analysisPortfolios(Map<String, String> analysisPortfolios) {
    this.analysisPortfolios = analysisPortfolios;
    return this;
  }

  public AnalysisDefectsResponse putAnalysisPortfoliosItem(String key, String analysisPortfoliosItem) {
    if (this.analysisPortfolios == null) {
      this.analysisPortfolios = new HashMap<String, String>();
    }
    this.analysisPortfolios.put(key, analysisPortfoliosItem);
    return this;
  }

   /**
   * Map of analysis portfolios
   * @return analysisPortfolios
  **/
  @ApiModelProperty(example = "\"{ 'country': 'spain' }\"", value = "Map of analysis portfolios")
  public Map<String, String> getAnalysisPortfolios() {
    return analysisPortfolios;
  }

  public void setAnalysisPortfolios(Map<String, String> analysisPortfolios) {
    this.analysisPortfolios = analysisPortfolios;
  }

  public AnalysisDefectsResponse analysisStatus(AnalysisStatusEnum analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

   /**
   * Analysis status
   * @return analysisStatus
  **/
  @ApiModelProperty(example = "FINISHED", value = "Analysis status")
  public AnalysisStatusEnum getAnalysisStatus() {
    return analysisStatus;
  }

  public void setAnalysisStatus(AnalysisStatusEnum analysisStatus) {
    this.analysisStatus = analysisStatus;
  }

  public AnalysisDefectsResponse languages(List<MetricValueData> languages) {
    this.languages = languages;
    return this;
  }

  public AnalysisDefectsResponse addLanguagesItem(MetricValueData languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<MetricValueData>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Languages metric list
   * @return languages
  **/
  @ApiModelProperty(value = "Languages metric list")
  public List<MetricValueData> getLanguages() {
    return languages;
  }

  public void setLanguages(List<MetricValueData> languages) {
    this.languages = languages;
  }

  public AnalysisDefectsResponse architecture(MetadataArchitectureData architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * Architecture detail
   * @return architecture
  **/
  @ApiModelProperty(value = "Architecture detail")
  public MetadataArchitectureData getArchitecture() {
    return architecture;
  }

  public void setArchitecture(MetadataArchitectureData architecture) {
    this.architecture = architecture;
  }

  public AnalysisDefectsResponse insightsData(MetadataInsightsData insightsData) {
    this.insightsData = insightsData;
    return this;
  }

   /**
   * Insights metadata
   * @return insightsData
  **/
  @ApiModelProperty(value = "Insights metadata")
  public MetadataInsightsData getInsightsData() {
    return insightsData;
  }

  public void setInsightsData(MetadataInsightsData insightsData) {
    this.insightsData = insightsData;
  }

  public AnalysisDefectsResponse defectsCount(Integer defectsCount) {
    this.defectsCount = defectsCount;
    return this;
  }

   /**
   * Defects count
   * @return defectsCount
  **/
  @ApiModelProperty(example = "581", value = "Defects count")
  public Integer getDefectsCount() {
    return defectsCount;
  }

  public void setDefectsCount(Integer defectsCount) {
    this.defectsCount = defectsCount;
  }

  public AnalysisDefectsResponse activeDefectsCount(Integer activeDefectsCount) {
    this.activeDefectsCount = activeDefectsCount;
    return this;
  }

   /**
   * Active defects count
   * @return activeDefectsCount
  **/
  @ApiModelProperty(example = "575", value = "Active defects count")
  public Integer getActiveDefectsCount() {
    return activeDefectsCount;
  }

  public void setActiveDefectsCount(Integer activeDefectsCount) {
    this.activeDefectsCount = activeDefectsCount;
  }

  public AnalysisDefectsResponse supressedDefectsCount(Integer supressedDefectsCount) {
    this.supressedDefectsCount = supressedDefectsCount;
    return this;
  }

   /**
   * Supressed defects count
   * @return supressedDefectsCount
  **/
  @ApiModelProperty(example = "6", value = "Supressed defects count")
  public Integer getSupressedDefectsCount() {
    return supressedDefectsCount;
  }

  public void setSupressedDefectsCount(Integer supressedDefectsCount) {
    this.supressedDefectsCount = supressedDefectsCount;
  }

  public AnalysisDefectsResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of defects in this response
   * @return count
  **/
  @ApiModelProperty(example = "500", value = "Number of defects in this response")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AnalysisDefectsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "Page number")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public AnalysisDefectsResponse defects(List<DefectDetailResponse> defects) {
    this.defects = defects;
    return this;
  }

  public AnalysisDefectsResponse addDefectsItem(DefectDetailResponse defectsItem) {
    if (this.defects == null) {
      this.defects = new ArrayList<DefectDetailResponse>();
    }
    this.defects.add(defectsItem);
    return this;
  }

   /**
   * Defects detail list
   * @return defects
  **/
  @ApiModelProperty(value = "Defects detail list")
  public List<DefectDetailResponse> getDefects() {
    return defects;
  }

  public void setDefects(List<DefectDetailResponse> defects) {
    this.defects = defects;
  }

  public AnalysisDefectsResponse qualityModel(String qualityModel) {
    this.qualityModel = qualityModel;
    return this;
  }

   /**
   * Application quality model name
   * @return qualityModel
  **/
  @ApiModelProperty(example = "CQM", value = "Application quality model name")
  public String getQualityModel() {
    return qualityModel;
  }

  public void setQualityModel(String qualityModel) {
    this.qualityModel = qualityModel;
  }

  public AnalysisDefectsResponse orderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

   /**
   * Analysis user invoker
   * @return orderedBy
  **/
  @ApiModelProperty(example = "github software", value = "Analysis user invoker")
  public String getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
  }

  public AnalysisDefectsResponse riskIndex(MetricValueData riskIndex) {
    this.riskIndex = riskIndex;
    return this;
  }

   /**
   * Risk index metric
   * @return riskIndex
  **/
  @ApiModelProperty(value = "Risk index metric")
  public MetricValueData getRiskIndex() {
    return riskIndex;
  }

  public void setRiskIndex(MetricValueData riskIndex) {
    this.riskIndex = riskIndex;
  }

  public AnalysisDefectsResponse qualityIndicator(MetricValueData qualityIndicator) {
    this.qualityIndicator = qualityIndicator;
    return this;
  }

   /**
   * Quality indicator metric
   * @return qualityIndicator
  **/
  @ApiModelProperty(value = "Quality indicator metric")
  public MetricValueData getQualityIndicator() {
    return qualityIndicator;
  }

  public void setQualityIndicator(MetricValueData qualityIndicator) {
    this.qualityIndicator = qualityIndicator;
  }

  public AnalysisDefectsResponse effortToTarget(MetricValueData effortToTarget) {
    this.effortToTarget = effortToTarget;
    return this;
  }

   /**
   * Effort to target metric
   * @return effortToTarget
  **/
  @ApiModelProperty(value = "Effort to target metric")
  public MetricValueData getEffortToTarget() {
    return effortToTarget;
  }

  public void setEffortToTarget(MetricValueData effortToTarget) {
    this.effortToTarget = effortToTarget;
  }

  public AnalysisDefectsResponse mainMetrics(List<MetricValueData> mainMetrics) {
    this.mainMetrics = mainMetrics;
    return this;
  }

  public AnalysisDefectsResponse addMainMetricsItem(MetricValueData mainMetricsItem) {
    if (this.mainMetrics == null) {
      this.mainMetrics = new ArrayList<MetricValueData>();
    }
    this.mainMetrics.add(mainMetricsItem);
    return this;
  }

   /**
   * Main metrics list
   * @return mainMetrics
  **/
  @ApiModelProperty(value = "Main metrics list")
  public List<MetricValueData> getMainMetrics() {
    return mainMetrics;
  }

  public void setMainMetrics(List<MetricValueData> mainMetrics) {
    this.mainMetrics = mainMetrics;
  }

   /**
   * Map of security metrics
   * @return security
  **/
  @ApiModelProperty(example = "\"{ 'Rating': 1, {'3Stars':104.6,'5Stars':255.9,'2Stars':64.89,'4Stars':247.4}\"", value = "Map of security metrics")
  public Map<String, Object> getSecurity() {
    return security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisDefectsResponse analysisDefectsResponse = (AnalysisDefectsResponse) o;
    return Objects.equals(this.name, analysisDefectsResponse.name) &&
        Objects.equals(this.description, analysisDefectsResponse.description) &&
        Objects.equals(this.auditName, analysisDefectsResponse.auditName) &&
        Objects.equals(this.applicationBusinessValue, analysisDefectsResponse.applicationBusinessValue) &&
        Objects.equals(this.applicationProvider, analysisDefectsResponse.applicationProvider) &&
        Objects.equals(this.applicationPortfolios, analysisDefectsResponse.applicationPortfolios) &&
        Objects.equals(this.label, analysisDefectsResponse.label) &&
        Objects.equals(this.date, analysisDefectsResponse.date) &&
        Objects.equals(this.modelId, analysisDefectsResponse.modelId) &&
        Objects.equals(this.encoding, analysisDefectsResponse.encoding) &&
        Objects.equals(this.analysisCode, analysisDefectsResponse.analysisCode) &&
        Objects.equals(this.analysisURL, analysisDefectsResponse.analysisURL) &&
        Objects.equals(this.auditResultURL, analysisDefectsResponse.auditResultURL) &&
        Objects.equals(this.analysisBusinessValue, analysisDefectsResponse.analysisBusinessValue) &&
        Objects.equals(this.analysisProvider, analysisDefectsResponse.analysisProvider) &&
        Objects.equals(this.analysisPortfolios, analysisDefectsResponse.analysisPortfolios) &&
        Objects.equals(this.analysisStatus, analysisDefectsResponse.analysisStatus) &&
        Objects.equals(this.languages, analysisDefectsResponse.languages) &&
        Objects.equals(this.architecture, analysisDefectsResponse.architecture) &&
        Objects.equals(this.insightsData, analysisDefectsResponse.insightsData) &&
        Objects.equals(this.defectsCount, analysisDefectsResponse.defectsCount) &&
        Objects.equals(this.activeDefectsCount, analysisDefectsResponse.activeDefectsCount) &&
        Objects.equals(this.supressedDefectsCount, analysisDefectsResponse.supressedDefectsCount) &&
        Objects.equals(this.count, analysisDefectsResponse.count) &&
        Objects.equals(this.page, analysisDefectsResponse.page) &&
        Objects.equals(this.defects, analysisDefectsResponse.defects) &&
        Objects.equals(this.qualityModel, analysisDefectsResponse.qualityModel) &&
        Objects.equals(this.orderedBy, analysisDefectsResponse.orderedBy) &&
        Objects.equals(this.riskIndex, analysisDefectsResponse.riskIndex) &&
        Objects.equals(this.qualityIndicator, analysisDefectsResponse.qualityIndicator) &&
        Objects.equals(this.effortToTarget, analysisDefectsResponse.effortToTarget) &&
        Objects.equals(this.mainMetrics, analysisDefectsResponse.mainMetrics) &&
        Objects.equals(this.security, analysisDefectsResponse.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, auditName, applicationBusinessValue, applicationProvider, applicationPortfolios, label, date, modelId, encoding, analysisCode, analysisURL, auditResultURL, analysisBusinessValue, analysisProvider, analysisPortfolios, analysisStatus, languages, architecture, insightsData, defectsCount, activeDefectsCount, supressedDefectsCount, count, page, defects, qualityModel, orderedBy, riskIndex, qualityIndicator, effortToTarget, mainMetrics, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisDefectsResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    auditName: ").append(toIndentedString(auditName)).append("\n");
    sb.append("    applicationBusinessValue: ").append(toIndentedString(applicationBusinessValue)).append("\n");
    sb.append("    applicationProvider: ").append(toIndentedString(applicationProvider)).append("\n");
    sb.append("    applicationPortfolios: ").append(toIndentedString(applicationPortfolios)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    analysisCode: ").append(toIndentedString(analysisCode)).append("\n");
    sb.append("    analysisURL: ").append(toIndentedString(analysisURL)).append("\n");
    sb.append("    auditResultURL: ").append(toIndentedString(auditResultURL)).append("\n");
    sb.append("    analysisBusinessValue: ").append(toIndentedString(analysisBusinessValue)).append("\n");
    sb.append("    analysisProvider: ").append(toIndentedString(analysisProvider)).append("\n");
    sb.append("    analysisPortfolios: ").append(toIndentedString(analysisPortfolios)).append("\n");
    sb.append("    analysisStatus: ").append(toIndentedString(analysisStatus)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    insightsData: ").append(toIndentedString(insightsData)).append("\n");
    sb.append("    defectsCount: ").append(toIndentedString(defectsCount)).append("\n");
    sb.append("    activeDefectsCount: ").append(toIndentedString(activeDefectsCount)).append("\n");
    sb.append("    supressedDefectsCount: ").append(toIndentedString(supressedDefectsCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    defects: ").append(toIndentedString(defects)).append("\n");
    sb.append("    qualityModel: ").append(toIndentedString(qualityModel)).append("\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
    sb.append("    riskIndex: ").append(toIndentedString(riskIndex)).append("\n");
    sb.append("    qualityIndicator: ").append(toIndentedString(qualityIndicator)).append("\n");
    sb.append("    effortToTarget: ").append(toIndentedString(effortToTarget)).append("\n");
    sb.append("    mainMetrics: ").append(toIndentedString(mainMetrics)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

