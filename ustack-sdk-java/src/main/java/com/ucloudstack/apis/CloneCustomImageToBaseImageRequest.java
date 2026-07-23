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

public class CloneCustomImageToBaseImageRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目标镜像名称，用于创建基础镜像资源，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("DestImageName")
    private String destImageNameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 源镜像ID，作为复制来源的自制镜像标识，用于生成基础镜像 */
    @NotEmpty
    @OpenAPIParam("SourceImageID")
    private String sourceImageIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDestImageName() {
        return destImageNameParam;
    }

    public void setDestImageName(String destImageNameParam) {
        this.destImageNameParam = destImageNameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSourceImageID() {
        return sourceImageIDParam;
    }

    public void setSourceImageID(String sourceImageIDParam) {
        this.sourceImageIDParam = sourceImageIDParam;
    }

}
