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

public class CreateBucketRequest extends Request {

    /** 访问类型，桶访问权限级别，取值范围：Private、PublicRead、PublicReadWrite */
    @NotEmpty
    @OpenAPIParam("AccessType")
    private String accessTypeParam;

    /** 桶加密开关，是否开启服务端加密 */
    
    @OpenAPIParam("BucketCryptEnabled")
    private Boolean bucketCryptEnabledParam;

    /** 桶名称，创建后不可修改 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 对象存储ID，对象存储实例标识 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 对象锁定时间，单位天，用于设置对象保留时长 */
    
    @OpenAPIParam("ObjectLockDays")
    private Integer objectLockDaysParam;

    /** 对象锁定开关，是否启用对象锁定 */
    
    @OpenAPIParam("ObjectLockEnabled")
    private Boolean objectLockEnabledParam;

    /** 桶配额，单位GB */
    
    @OpenAPIParam("Quota")
    private Integer quotaParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 多版本开关，是否开启多版本管理 */
    
    @OpenAPIParam("Versioning")
    private Boolean versioningParam;


    public String getAccessType() {
        return accessTypeParam;
    }

    public void setAccessType(String accessTypeParam) {
        this.accessTypeParam = accessTypeParam;
    }

    public Boolean getBucketCryptEnabled() {
        return bucketCryptEnabledParam;
    }

    public void setBucketCryptEnabled(Boolean bucketCryptEnabledParam) {
        this.bucketCryptEnabledParam = bucketCryptEnabledParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public Integer getObjectLockDays() {
        return objectLockDaysParam;
    }

    public void setObjectLockDays(Integer objectLockDaysParam) {
        this.objectLockDaysParam = objectLockDaysParam;
    }

    public Boolean getObjectLockEnabled() {
        return objectLockEnabledParam;
    }

    public void setObjectLockEnabled(Boolean objectLockEnabledParam) {
        this.objectLockEnabledParam = objectLockEnabledParam;
    }

    public Integer getQuota() {
        return quotaParam;
    }

    public void setQuota(Integer quotaParam) {
        this.quotaParam = quotaParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Boolean getVersioning() {
        return versioningParam;
    }

    public void setVersioning(Boolean versioningParam) {
        this.versioningParam = versioningParam;
    }

}
