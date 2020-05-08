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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AnalysisDefectsResponse;
import io.swagger.client.model.AnalysisFilesResponse;
import io.swagger.client.model.AnalysisResponse;
import io.swagger.client.model.AnalysisResultResponse;
import io.swagger.client.model.ApplicationAnalysisResponse;
import io.swagger.client.model.DefectsDeltaDetailResponse;
import io.swagger.client.model.DefectsDeltaResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalysesApi
 */
@Ignore
public class AnalysesApiTest {

    private final AnalysesApi api = new AnalysesApi();

    
    /**
     * Get application analysis
     *
     * Retrieves analysis results for a concrete analysis specified by code parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysisTest() throws ApiException {
        String code = null;
        AnalysisResultResponse response = api.getAnalysis(code);

        // TODO: test validations
    }
    
    /**
     * Get list of analysis defects
     *
     * List analysis defects for a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysisDefectsTest() throws ApiException {
        String code = null;
        String characteristics = null;
        String languages = null;
        String priorities = null;
        String fileContains = null;
        String orderBy = null;
        Boolean asc = null;
        Integer page = null;
        Integer count = null;
        AnalysisDefectsResponse response = api.getAnalysisDefects(code, characteristics, languages, priorities, fileContains, orderBy, asc, page, count);

        // TODO: test validations
    }
    
    /**
     * Get the list of new/removed defects in a comparison
     *
     * Get the list of new/removed defects in an analysis from the previous analysis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysisDefectsDeltaTest() throws ApiException {
        String code = null;
        String previouscode = null;
        String defectstype = null;
        DefectsDeltaDetailResponse response = api.getAnalysisDefectsDelta(code, previouscode, defectstype);

        // TODO: test validations
    }
    
    /**
     * Get comparison of the defects found in two different analysis
     *
     * Get the net number of new and removed defects and violated rules after comparing 2 given analyses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysisDeltaTest() throws ApiException {
        String code = null;
        String previouscode = null;
        DefectsDeltaResponse response = api.getAnalysisDelta(code, previouscode);

        // TODO: test validations
    }
    
    /**
     * Get list of files with metric values and defects for a specific analysis
     *
     * List files with metric values and defects for a specific analysis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnalysisFilesTest() throws ApiException {
        String code = null;
        AnalysisFilesResponse response = api.getAnalysisFiles(code);

        // TODO: test validations
    }
    
    /**
     * Get list of files with metric values and defects of the latest analysis
     *
     * List files with metric values and defects of the latest analysis for the named application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesTest() throws ApiException {
        String application = null;
        AnalysisFilesResponse response = api.getFiles(application);

        // TODO: test validations
    }
    
    /**
     * Get last analysis
     *
     * Retrieves last analysis for the authenticated user and the application indicated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastAnalysisTest() throws ApiException {
        String application = null;
        ApplicationAnalysisResponse response = api.getLastAnalysis(application);

        // TODO: test validations
    }
    
    /**
     * Get list of all analysis codes for an application
     *
     * List all analysis codes for an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAnalysesTest() throws ApiException {
        String application = null;
        Boolean success = null;
        Boolean filterPurgedAnalyses = null;
        Integer count = null;
        List<AnalysisResponse> response = api.listAnalyses(application, success, filterPurgedAnalyses, count);

        // TODO: test validations
    }
    
    /**
     * Get list of analysis
     *
     * List analysis with different parameters to filter data. See parameters section.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAnalysisTest() throws ApiException {
        String applicationName = null;
        String initDate = null;
        String endDate = null;
        String status = null;
        String auditStatus = null;
        Boolean deliveries = null;
        Integer page = null;
        Integer count = null;
        List<AnalysisResultResponse> response = api.listAnalysis(applicationName, initDate, endDate, status, auditStatus, deliveries, page, count);

        // TODO: test validations
    }
    
}
