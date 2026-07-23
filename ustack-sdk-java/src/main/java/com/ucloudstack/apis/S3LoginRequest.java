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

public class S3LoginRequest extends Request {

    /** 桶名称，Scenes=OSS 时指定目标桶；Scenes=ImageUpload 场景固定登录 mirror 桶，可不填 */
    
    @OpenAPIParam("Bucket")
    private String bucketParam;

    /** 租户ID，标识请求所属租户，Scenes=OSS 且当前登录账号为公司级权限时必须填写，用于校验对象存储资源归属 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目标S3资源ID，Scenes=OSS 时必填且必须以 oss- 开头，对应对象存储实例ID */
    
    @OpenAPIParam("ID")
    private String iDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 使用场景，ImageUpload 表示镜像上传使用 S3（系统自动使用 mirror 桶），OSS 表示访问指定对象存储实例并复用请求中的桶信息 */
    @NotEmpty
    @OpenAPIParam("Scenes")
    private String scenesParam;


    public String getBucket() {
        return bucketParam;
    }

    public void setBucket(String bucketParam) {
        this.bucketParam = bucketParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getScenes() {
        return scenesParam;
    }

    public void setScenes(String scenesParam) {
        this.scenesParam = scenesParam;
    }

}
