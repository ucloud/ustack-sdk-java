/**
 * Copyright 2021 OpenAPI Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateBucketLifecycleRuleRequest extends Request {

    /** 桶名称，存储桶名称 */
    @NotEmpty
    @OpenAPIParam("BucketName")
    private String bucketNameParam;

    /** 过期天数，对象过期天数 */
    @NotEmpty
    @OpenAPIParam("ExpirationDays")
    private Integer expirationDaysParam;

    /** 过期类型，生命周期规则适用对象，取值范围：CurrentVersion（当前版本）、NonCurrentVersion（非当前版本）、Multipart（碎片） */
    @NotEmpty
    @OpenAPIParam("ExpirationType")
    private String expirationTypeParam;

    /** 对象存储ID，对象存储实例标识 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 对象名前缀，用于匹配生命周期规则 */
    
    @OpenAPIParam("ObjectKeyPrefix")
    private String objectKeyPrefixParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 归档存储类，生命周期转储的存储类型 */
    
    @OpenAPIParam("TransitionStorageClass")
    private String transitionStorageClassParam;


    public String getBucketName() {
        return bucketNameParam;
    }

    public void setBucketName(String bucketNameParam) {
        this.bucketNameParam = bucketNameParam;
    }

    public Integer getExpirationDays() {
        return expirationDaysParam;
    }

    public void setExpirationDays(Integer expirationDaysParam) {
        this.expirationDaysParam = expirationDaysParam;
    }

    public String getExpirationType() {
        return expirationTypeParam;
    }

    public void setExpirationType(String expirationTypeParam) {
        this.expirationTypeParam = expirationTypeParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public String getObjectKeyPrefix() {
        return objectKeyPrefixParam;
    }

    public void setObjectKeyPrefix(String objectKeyPrefixParam) {
        this.objectKeyPrefixParam = objectKeyPrefixParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTransitionStorageClass() {
        return transitionStorageClassParam;
    }

    public void setTransitionStorageClass(String transitionStorageClassParam) {
        this.transitionStorageClassParam = transitionStorageClassParam;
    }

}
