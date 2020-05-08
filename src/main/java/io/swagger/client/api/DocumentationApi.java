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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.RuleDocumentationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentationApi {
    private ApiClient apiClient;

    public DocumentationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getRuleDoc
     * @param modelId Model id (required)
     * @param code Rule code (required)
     * @param application Application name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRuleDocCall(String modelId, String code, String application, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/doc/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("modelId", modelId));
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("code", code));
        if (application != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("application", application));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Cookie", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRuleDocValidateBeforeCall(String modelId, String code, String application, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling getRuleDoc(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getRuleDoc(Async)");
        }
        
        // verify the required parameter 'application' is set
        if (application == null) {
            throw new ApiException("Missing the required parameter 'application' when calling getRuleDoc(Async)");
        }
        

        com.squareup.okhttp.Call call = getRuleDocCall(modelId, code, application, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get rule&#39;s documentation
     * Obtains the documentation of a rule.
     * @param modelId Model id (required)
     * @param code Rule code (required)
     * @param application Application name (required)
     * @return RuleDocumentationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RuleDocumentationResponse getRuleDoc(String modelId, String code, String application) throws ApiException {
        ApiResponse<RuleDocumentationResponse> resp = getRuleDocWithHttpInfo(modelId, code, application);
        return resp.getData();
    }

    /**
     * Get rule&#39;s documentation
     * Obtains the documentation of a rule.
     * @param modelId Model id (required)
     * @param code Rule code (required)
     * @param application Application name (required)
     * @return ApiResponse&lt;RuleDocumentationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RuleDocumentationResponse> getRuleDocWithHttpInfo(String modelId, String code, String application) throws ApiException {
        com.squareup.okhttp.Call call = getRuleDocValidateBeforeCall(modelId, code, application, null, null);
        Type localVarReturnType = new TypeToken<RuleDocumentationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get rule&#39;s documentation (asynchronously)
     * Obtains the documentation of a rule.
     * @param modelId Model id (required)
     * @param code Rule code (required)
     * @param application Application name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRuleDocAsync(String modelId, String code, String application, final ApiCallback<RuleDocumentationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRuleDocValidateBeforeCall(modelId, code, application, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RuleDocumentationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}