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
import io.swagger.client.model.AuditAnalysisResultResponse;
import io.swagger.client.model.DeliveryDefectsData;
import io.swagger.client.model.DeliveryFilesData;
import io.swagger.client.model.MetadataArchitectureData;
import io.swagger.client.model.MetadataInsightsData;
import io.swagger.client.model.MetricValueData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AnalysisResultResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T13:23:11.456Z")
public class AnalysisResultResponse {
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

  /**
   * Analysis scope
   */
  @JsonAdapter(AnalysisScopeEnum.Adapter.class)
  public enum AnalysisScopeEnum {
    BASELINE("Baseline"),
    
    COMPLETE_DELIVERY("Complete delivery"),
    
    PARTIAL_DELIVERY("Partial delivery");

    private String value;

    AnalysisScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnalysisScopeEnum fromValue(String text) {
      for (AnalysisScopeEnum b : AnalysisScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnalysisScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnalysisScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnalysisScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("analysisScope")
  private AnalysisScopeEnum analysisScope = null;

  @SerializedName("changeRequest")
  private String changeRequest = null;

  /**
   * Delivery change request status
   */
  @JsonAdapter(ChangeRequestStatusEnum.Adapter.class)
  public enum ChangeRequestStatusEnum {
    RESOLVED("Resolved"),
    
    IN_PROGRESS("In progress");

    private String value;

    ChangeRequestStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeRequestStatusEnum fromValue(String text) {
      for (ChangeRequestStatusEnum b : ChangeRequestStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChangeRequestStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeRequestStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeRequestStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChangeRequestStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("changeRequestStatus")
  private ChangeRequestStatusEnum changeRequestStatus = null;

  @SerializedName("branchName")
  private String branchName = null;

  @SerializedName("baselineAnalysisCode")
  private String baselineAnalysisCode = null;

  @SerializedName("deliveryFiles")
  private DeliveryFilesData deliveryFiles = null;

  @SerializedName("deliveryDefects")
  private DeliveryDefectsData deliveryDefects = null;

  @SerializedName("auditResult")
  private AuditAnalysisResultResponse auditResult = null;

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

  public AnalysisResultResponse name(String name) {
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

  public AnalysisResultResponse description(String description) {
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

  public AnalysisResultResponse auditName(String auditName) {
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

  public AnalysisResultResponse applicationBusinessValue(ApplicationBusinessValueEnum applicationBusinessValue) {
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

  public AnalysisResultResponse applicationProvider(String applicationProvider) {
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

  public AnalysisResultResponse applicationPortfolios(Map<String, String> applicationPortfolios) {
    this.applicationPortfolios = applicationPortfolios;
    return this;
  }

  public AnalysisResultResponse putApplicationPortfoliosItem(String key, String applicationPortfoliosItem) {
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

  public AnalysisResultResponse label(String label) {
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

  public AnalysisResultResponse date(String date) {
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

  public AnalysisResultResponse modelId(Long modelId) {
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

  public AnalysisResultResponse encoding(String encoding) {
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

  public AnalysisResultResponse analysisCode(String analysisCode) {
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

  public AnalysisResultResponse analysisURL(String analysisURL) {
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

  public AnalysisResultResponse auditResultURL(String auditResultURL) {
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

  public AnalysisResultResponse analysisBusinessValue(AnalysisBusinessValueEnum analysisBusinessValue) {
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

  public AnalysisResultResponse analysisProvider(String analysisProvider) {
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

  public AnalysisResultResponse analysisPortfolios(Map<String, String> analysisPortfolios) {
    this.analysisPortfolios = analysisPortfolios;
    return this;
  }

  public AnalysisResultResponse putAnalysisPortfoliosItem(String key, String analysisPortfoliosItem) {
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

  public AnalysisResultResponse analysisStatus(AnalysisStatusEnum analysisStatus) {
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

  public AnalysisResultResponse languages(List<MetricValueData> languages) {
    this.languages = languages;
    return this;
  }

  public AnalysisResultResponse addLanguagesItem(MetricValueData languagesItem) {
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

  public AnalysisResultResponse architecture(MetadataArchitectureData architecture) {
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

  public AnalysisResultResponse insightsData(MetadataInsightsData insightsData) {
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

  public AnalysisResultResponse analysisScope(AnalysisScopeEnum analysisScope) {
    this.analysisScope = analysisScope;
    return this;
  }

   /**
   * Analysis scope
   * @return analysisScope
  **/
  @ApiModelProperty(example = "Complete delivery", value = "Analysis scope")
  public AnalysisScopeEnum getAnalysisScope() {
    return analysisScope;
  }

  public void setAnalysisScope(AnalysisScopeEnum analysisScope) {
    this.analysisScope = analysisScope;
  }

  public AnalysisResultResponse changeRequest(String changeRequest) {
    this.changeRequest = changeRequest;
    return this;
  }

   /**
   * Delivery change request
   * @return changeRequest
  **/
  @ApiModelProperty(example = "CR_13.01.2020", value = "Delivery change request")
  public String getChangeRequest() {
    return changeRequest;
  }

  public void setChangeRequest(String changeRequest) {
    this.changeRequest = changeRequest;
  }

  public AnalysisResultResponse changeRequestStatus(ChangeRequestStatusEnum changeRequestStatus) {
    this.changeRequestStatus = changeRequestStatus;
    return this;
  }

   /**
   * Delivery change request status
   * @return changeRequestStatus
  **/
  @ApiModelProperty(example = "Resolved", value = "Delivery change request status")
  public ChangeRequestStatusEnum getChangeRequestStatus() {
    return changeRequestStatus;
  }

  public void setChangeRequestStatus(ChangeRequestStatusEnum changeRequestStatus) {
    this.changeRequestStatus = changeRequestStatus;
  }

  public AnalysisResultResponse branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Delivery branch name
   * @return branchName
  **/
  @ApiModelProperty(example = "master", value = "Delivery branch name")
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public AnalysisResultResponse baselineAnalysisCode(String baselineAnalysisCode) {
    this.baselineAnalysisCode = baselineAnalysisCode;
    return this;
  }

   /**
   * Baseline analysis code
   * @return baselineAnalysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16dc9e29131", value = "Baseline analysis code")
  public String getBaselineAnalysisCode() {
    return baselineAnalysisCode;
  }

  public void setBaselineAnalysisCode(String baselineAnalysisCode) {
    this.baselineAnalysisCode = baselineAnalysisCode;
  }

  public AnalysisResultResponse deliveryFiles(DeliveryFilesData deliveryFiles) {
    this.deliveryFiles = deliveryFiles;
    return this;
  }

   /**
   * Delivery files detail
   * @return deliveryFiles
  **/
  @ApiModelProperty(value = "Delivery files detail")
  public DeliveryFilesData getDeliveryFiles() {
    return deliveryFiles;
  }

  public void setDeliveryFiles(DeliveryFilesData deliveryFiles) {
    this.deliveryFiles = deliveryFiles;
  }

  public AnalysisResultResponse deliveryDefects(DeliveryDefectsData deliveryDefects) {
    this.deliveryDefects = deliveryDefects;
    return this;
  }

   /**
   * Delivery defects
   * @return deliveryDefects
  **/
  @ApiModelProperty(value = "Delivery defects")
  public DeliveryDefectsData getDeliveryDefects() {
    return deliveryDefects;
  }

  public void setDeliveryDefects(DeliveryDefectsData deliveryDefects) {
    this.deliveryDefects = deliveryDefects;
  }

  public AnalysisResultResponse auditResult(AuditAnalysisResultResponse auditResult) {
    this.auditResult = auditResult;
    return this;
  }

   /**
   * Delivery audit result detail
   * @return auditResult
  **/
  @ApiModelProperty(value = "Delivery audit result detail")
  public AuditAnalysisResultResponse getAuditResult() {
    return auditResult;
  }

  public void setAuditResult(AuditAnalysisResultResponse auditResult) {
    this.auditResult = auditResult;
  }

  public AnalysisResultResponse qualityModel(String qualityModel) {
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

  public AnalysisResultResponse orderedBy(String orderedBy) {
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

  public AnalysisResultResponse riskIndex(MetricValueData riskIndex) {
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

  public AnalysisResultResponse qualityIndicator(MetricValueData qualityIndicator) {
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

  public AnalysisResultResponse effortToTarget(MetricValueData effortToTarget) {
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

  public AnalysisResultResponse mainMetrics(List<MetricValueData> mainMetrics) {
    this.mainMetrics = mainMetrics;
    return this;
  }

  public AnalysisResultResponse addMainMetricsItem(MetricValueData mainMetricsItem) {
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
    AnalysisResultResponse analysisResultResponse = (AnalysisResultResponse) o;
    return Objects.equals(this.name, analysisResultResponse.name) &&
        Objects.equals(this.description, analysisResultResponse.description) &&
        Objects.equals(this.auditName, analysisResultResponse.auditName) &&
        Objects.equals(this.applicationBusinessValue, analysisResultResponse.applicationBusinessValue) &&
        Objects.equals(this.applicationProvider, analysisResultResponse.applicationProvider) &&
        Objects.equals(this.applicationPortfolios, analysisResultResponse.applicationPortfolios) &&
        Objects.equals(this.label, analysisResultResponse.label) &&
        Objects.equals(this.date, analysisResultResponse.date) &&
        Objects.equals(this.modelId, analysisResultResponse.modelId) &&
        Objects.equals(this.encoding, analysisResultResponse.encoding) &&
        Objects.equals(this.analysisCode, analysisResultResponse.analysisCode) &&
        Objects.equals(this.analysisURL, analysisResultResponse.analysisURL) &&
        Objects.equals(this.auditResultURL, analysisResultResponse.auditResultURL) &&
        Objects.equals(this.analysisBusinessValue, analysisResultResponse.analysisBusinessValue) &&
        Objects.equals(this.analysisProvider, analysisResultResponse.analysisProvider) &&
        Objects.equals(this.analysisPortfolios, analysisResultResponse.analysisPortfolios) &&
        Objects.equals(this.analysisStatus, analysisResultResponse.analysisStatus) &&
        Objects.equals(this.languages, analysisResultResponse.languages) &&
        Objects.equals(this.architecture, analysisResultResponse.architecture) &&
        Objects.equals(this.insightsData, analysisResultResponse.insightsData) &&
        Objects.equals(this.analysisScope, analysisResultResponse.analysisScope) &&
        Objects.equals(this.changeRequest, analysisResultResponse.changeRequest) &&
        Objects.equals(this.changeRequestStatus, analysisResultResponse.changeRequestStatus) &&
        Objects.equals(this.branchName, analysisResultResponse.branchName) &&
        Objects.equals(this.baselineAnalysisCode, analysisResultResponse.baselineAnalysisCode) &&
        Objects.equals(this.deliveryFiles, analysisResultResponse.deliveryFiles) &&
        Objects.equals(this.deliveryDefects, analysisResultResponse.deliveryDefects) &&
        Objects.equals(this.auditResult, analysisResultResponse.auditResult) &&
        Objects.equals(this.qualityModel, analysisResultResponse.qualityModel) &&
        Objects.equals(this.orderedBy, analysisResultResponse.orderedBy) &&
        Objects.equals(this.riskIndex, analysisResultResponse.riskIndex) &&
        Objects.equals(this.qualityIndicator, analysisResultResponse.qualityIndicator) &&
        Objects.equals(this.effortToTarget, analysisResultResponse.effortToTarget) &&
        Objects.equals(this.mainMetrics, analysisResultResponse.mainMetrics) &&
        Objects.equals(this.security, analysisResultResponse.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, auditName, applicationBusinessValue, applicationProvider, applicationPortfolios, label, date, modelId, encoding, analysisCode, analysisURL, auditResultURL, analysisBusinessValue, analysisProvider, analysisPortfolios, analysisStatus, languages, architecture, insightsData, analysisScope, changeRequest, changeRequestStatus, branchName, baselineAnalysisCode, deliveryFiles, deliveryDefects, auditResult, qualityModel, orderedBy, riskIndex, qualityIndicator, effortToTarget, mainMetrics, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResultResponse {\n");
    
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
    sb.append("    analysisScope: ").append(toIndentedString(analysisScope)).append("\n");
    sb.append("    changeRequest: ").append(toIndentedString(changeRequest)).append("\n");
    sb.append("    changeRequestStatus: ").append(toIndentedString(changeRequestStatus)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    baselineAnalysisCode: ").append(toIndentedString(baselineAnalysisCode)).append("\n");
    sb.append("    deliveryFiles: ").append(toIndentedString(deliveryFiles)).append("\n");
    sb.append("    deliveryDefects: ").append(toIndentedString(deliveryDefects)).append("\n");
    sb.append("    auditResult: ").append(toIndentedString(auditResult)).append("\n");
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

