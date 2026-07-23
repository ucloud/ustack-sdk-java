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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class BucketLifecycleRule {

    /** 过期天数，对象过期天数 */
    @SerializedName("ExpirationDays")
    private Integer expirationDaysParam;

    /** 过期类型，生命周期规则适用对象，取值范围：CurrentVersion（当前版本）、NonCurrentVersion（非当前版本）、Multipart（碎片） */
    @SerializedName("ExpirationType")
    private String expirationTypeParam;

    /** 生命周期ID，生命周期规则标识 */
    @SerializedName("LifeCycleID")
    private String lifeCycleIDParam;

    /** 对象名前缀，用于匹配生命周期规则 */
    @SerializedName("ObjectKeyPrefix")
    private String objectKeyPrefixParam;

    /** 归档存储类，生命周期转储的存储类型 */
    @SerializedName("TransitionStorageClass")
    private String transitionStorageClassParam;


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

    public String getLifeCycleID() {
        return lifeCycleIDParam;
    }

    public void setLifeCycleID(String lifeCycleIDParam) {
        this.lifeCycleIDParam = lifeCycleIDParam;
    }

    public String getObjectKeyPrefix() {
        return objectKeyPrefixParam;
    }

    public void setObjectKeyPrefix(String objectKeyPrefixParam) {
        this.objectKeyPrefixParam = objectKeyPrefixParam;
    }

    public String getTransitionStorageClass() {
        return transitionStorageClassParam;
    }

    public void setTransitionStorageClass(String transitionStorageClassParam) {
        this.transitionStorageClassParam = transitionStorageClassParam;
    }

}
