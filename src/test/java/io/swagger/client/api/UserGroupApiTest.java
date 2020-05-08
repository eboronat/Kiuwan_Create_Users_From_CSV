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
import io.swagger.client.model.UserGroupRequest;
import io.swagger.client.model.UserGroupResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserGroupApi
 */
@Ignore
public class UserGroupApiTest {

    private final UserGroupApi api = new UserGroupApi();

    
    /**
     * Create user group
     *
     * Creates a new user group in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserGroupTest() throws ApiException {
        UserGroupRequest body = null;
        api.createUserGroup(body);

        // TODO: test validations
    }
    
    /**
     * Delete user group
     *
     * Deletes a user group of your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserGroupTest() throws ApiException {
        String name = null;
        api.deleteUserGroup(name);

        // TODO: test validations
    }
    
    /**
     * Get list of user groups
     *
     * List the user groups of your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserGroupsTest() throws ApiException {
        List<UserGroupResponse> response = api.listUserGroups();

        // TODO: test validations
    }
    
    /**
     * Update user group
     *
     * Modifies the information of an user group in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws ApiException {
        UserGroupRequest body = null;
        String name = null;
        api.updateUserGroup(body, name);

        // TODO: test validations
    }
    
}
