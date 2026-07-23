/**
 * Copyright 2026 UCloud Technology Co., Ltd.
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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class FlushBucketRequest extends Request {

    /** 桶名称，存储桶名称 */
    @NotEmpty
    @UCloudStackParam("BucketName")
    private String bucketNameParam;

    /** 租户ID，用于匹配被清理桶所属的租户并清理该租户在本地的上传缓存；公司级账号需填写自身CompanyID，系统/地域管理员可不填或传0 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 对象存储ID，对象存储实例标识 */
    @NotEmpty
    @UCloudStackParam("OSSID")
    private String oSSIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public String getBucketName() {
        return bucketNameParam;
    }

    public void setBucketName(String bucketNameParam) {
        this.bucketNameParam = bucketNameParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
