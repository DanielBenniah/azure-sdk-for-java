/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ComponentCurrentBillingFeatures.
 */
public class ComponentCurrentBillingFeaturesInner {
    /** The Retrofit service to perform REST calls. */
    private ComponentCurrentBillingFeaturesService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ComponentCurrentBillingFeaturesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ComponentCurrentBillingFeaturesInner(Retrofit retrofit, ApplicationInsightsManagementClientImpl client) {
        this.service = retrofit.create(ComponentCurrentBillingFeaturesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ComponentCurrentBillingFeatures to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ComponentCurrentBillingFeaturesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentCurrentBillingFeatures get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/currentbillingfeatures")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentCurrentBillingFeatures update" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/currentbillingfeatures")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Body ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentBillingFeaturesInner object if successful.
     */
    public ApplicationInsightsComponentBillingFeaturesInner get(String resourceGroupName, String resourceName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentBillingFeaturesInner> getAsync(String resourceGroupName, String resourceName, final ServiceCallback<ApplicationInsightsComponentBillingFeaturesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentBillingFeaturesInner object
     */
    public Observable<ApplicationInsightsComponentBillingFeaturesInner> getAsync(String resourceGroupName, String resourceName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>, ApplicationInsightsComponentBillingFeaturesInner>() {
            @Override
            public ApplicationInsightsComponentBillingFeaturesInner call(ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentBillingFeaturesInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>> getWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentBillingFeaturesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentBillingFeaturesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentBillingFeaturesInner object if successful.
     */
    public ApplicationInsightsComponentBillingFeaturesInner update(String resourceGroupName, String resourceName, ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, billingFeaturesProperties).toBlocking().single().body();
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentBillingFeaturesInner> updateAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties, final ServiceCallback<ApplicationInsightsComponentBillingFeaturesInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, resourceName, billingFeaturesProperties), serviceCallback);
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentBillingFeaturesInner object
     */
    public Observable<ApplicationInsightsComponentBillingFeaturesInner> updateAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, billingFeaturesProperties).map(new Func1<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>, ApplicationInsightsComponentBillingFeaturesInner>() {
            @Override
            public ApplicationInsightsComponentBillingFeaturesInner call(ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentBillingFeaturesInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>> updateWithServiceResponseAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (billingFeaturesProperties == null) {
            throw new IllegalArgumentException("Parameter billingFeaturesProperties is required and cannot be null.");
        }
        Validator.validate(billingFeaturesProperties);
        return service.update(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), billingFeaturesProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentBillingFeaturesInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentBillingFeaturesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentBillingFeaturesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
