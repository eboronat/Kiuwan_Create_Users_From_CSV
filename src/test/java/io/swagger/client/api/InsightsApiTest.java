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
import java.io.File;
import io.swagger.client.model.ListInsightsComponentsResponse;
import io.swagger.client.model.ListLicensesResponse;
import io.swagger.client.model.ListObsolescencesResponse;
import io.swagger.client.model.ListSecuritiesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InsightsApi
 */
@Ignore
public class InsightsApiTest {

    private final InsightsApi api = new InsightsApi();

    
    /**
     * Get PDF report of insight
     *
     * Obtains an insight report for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insightReportSummaryTest() throws ApiException {
        String application = null;
        String analysisCode = null;
        File response = api.insightReportSummary(application, analysisCode);

        // TODO: test validations
    }
    
    /**
     * Get list of components
     *
     * List components in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInsightsComponentsTest() throws ApiException {
        String application = null;
        String analysisCode = null;
        ListInsightsComponentsResponse response = api.listInsightsComponents(application, analysisCode);

        // TODO: test validations
    }
    
    /**
     * Get list of licenses
     *
     * List licenses in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLicensesTest() throws ApiException {
        String application = null;
        String analysisCode = null;
        ListLicensesResponse response = api.listLicenses(application, analysisCode);

        // TODO: test validations
    }
    
    /**
     * Get list of obsolescences
     *
     * List obsolescences in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listObsolescencesTest() throws ApiException {
        String application = null;
        String analysisCode = null;
        ListObsolescencesResponse response = api.listObsolescences(application, analysisCode);

        // TODO: test validations
    }
    
    /**
     * Get insight security detail list
     *
     * List security in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVulnerabilitiesTest() throws ApiException {
        String application = null;
        String analysisCode = null;
        ListSecuritiesResponse response = api.listVulnerabilities(application, analysisCode);

        // TODO: test validations
    }
    
}
