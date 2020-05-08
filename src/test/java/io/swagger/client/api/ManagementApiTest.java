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
import io.swagger.client.model.ApplicationManagementRequest;
import io.swagger.client.model.UserApplicationRoleResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementApi
 */
@Ignore
public class ManagementApiTest {

    private final ManagementApi api = new ManagementApi();

    
    /**
     * Create application
     *
     * Creates a new application in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApplicationNewTest() throws ApiException {
        ApplicationManagementRequest body = null;
        api.createApplicationNew(body);

        // TODO: test validations
    }
    
    /**
     * Delete application
     *
     * Deletes an application of your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApplicationTest() throws ApiException {
        String application = null;
        api.deleteApplication(application);

        // TODO: test validations
    }
    
    /**
     * Get users roles for application
     *
     * Get users roles for application. Use &#39;username&#39; and &#39;exactUsername&#39; to filter results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersRolesApplicationTest() throws ApiException {
        String application = null;
        String username = null;
        Boolean exactUsername = null;
        UserApplicationRoleResponse response = api.getUsersRolesApplication(application, username, exactUsername);

        // TODO: test validations
    }
    
    /**
     * Update application
     *
     * Modifies the information of an application in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateApplicationTest() throws ApiException {
        ApplicationManagementRequest body = null;
        String application = null;
        api.updateApplication(body, application);

        // TODO: test validations
    }
    
    /**
     * Update application with query parameter
     *
     * Modifies the information of an application in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateApplicationWithQueryParameterTest() throws ApiException {
        ApplicationManagementRequest body = null;
        api.updateApplicationWithQueryParameter(body);

        // TODO: test validations
    }
    
}
