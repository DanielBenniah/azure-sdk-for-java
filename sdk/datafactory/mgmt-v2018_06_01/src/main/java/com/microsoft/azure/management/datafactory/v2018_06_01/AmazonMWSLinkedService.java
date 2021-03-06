/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Amazon Marketplace Web Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AmazonMWSLinkedService.class)
@JsonTypeName("AmazonMWS")
@JsonFlatten
public class AmazonMWSLinkedService extends LinkedServiceInner {
    /**
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve
     * data from multiple Marketplace IDs, separate them with a comma (,).
     * (i.e. A2EUQ1WTGCTBG2).
     */
    @JsonProperty(value = "typeProperties.marketplaceID", required = true)
    private Object marketplaceID;

    /**
     * The Amazon seller ID.
     */
    @JsonProperty(value = "typeProperties.sellerID", required = true)
    private Object sellerID;

    /**
     * The Amazon MWS authentication token.
     */
    @JsonProperty(value = "typeProperties.mwsAuthToken")
    private SecretBase mwsAuthToken;

    /**
     * The access key id used to access data.
     */
    @JsonProperty(value = "typeProperties.accessKeyId", required = true)
    private Object accessKeyId;

    /**
     * The secret key used to access data.
     */
    @JsonProperty(value = "typeProperties.secretKey")
    private SecretBase secretKey;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @return the endpoint value
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @param endpoint the endpoint value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @return the marketplaceID value
     */
    public Object marketplaceID() {
        return this.marketplaceID;
    }

    /**
     * Set the Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @param marketplaceID the marketplaceID value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withMarketplaceID(Object marketplaceID) {
        this.marketplaceID = marketplaceID;
        return this;
    }

    /**
     * Get the Amazon seller ID.
     *
     * @return the sellerID value
     */
    public Object sellerID() {
        return this.sellerID;
    }

    /**
     * Set the Amazon seller ID.
     *
     * @param sellerID the sellerID value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withSellerID(Object sellerID) {
        this.sellerID = sellerID;
        return this;
    }

    /**
     * Get the Amazon MWS authentication token.
     *
     * @return the mwsAuthToken value
     */
    public SecretBase mwsAuthToken() {
        return this.mwsAuthToken;
    }

    /**
     * Set the Amazon MWS authentication token.
     *
     * @param mwsAuthToken the mwsAuthToken value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withMwsAuthToken(SecretBase mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the access key id used to access data.
     *
     * @return the accessKeyId value
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the access key id used to access data.
     *
     * @param accessKeyId the accessKeyId value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secret key used to access data.
     *
     * @return the secretKey value
     */
    public SecretBase secretKey() {
        return this.secretKey;
    }

    /**
     * Set the secret key used to access data.
     *
     * @param secretKey the secretKey value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withSecretKey(SecretBase secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
