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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeContainerImageTagRequest extends Request {

    /** 租户ID，用于权限验证；查询私有仓库时必须提供且需匹配仓库所有者，查询公有仓库时可传0 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像名称，查询镜像的标签 */
    @NotEmpty
    @OpenAPIParam("ContainerImageName")
    private String containerImageNameParam;

    /** 镜像仓库ID，镜像所属仓库ID；查询公有仓库时可传公共仓库名称常量 */
    @NotEmpty
    @OpenAPIParam("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** 关键词，用于内存过滤标签名称，支持模糊匹配 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，分页在内存过滤后执行 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，分页在内存过滤后执行 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域，镜像仓库所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getContainerImageName() {
        return containerImageNameParam;
    }

    public void setContainerImageName(String containerImageNameParam) {
        this.containerImageNameParam = containerImageNameParam;
    }

    public String getContainerImageRepositoryID() {
        return containerImageRepositoryIDParam;
    }

    public void setContainerImageRepositoryID(String containerImageRepositoryIDParam) {
        this.containerImageRepositoryIDParam = containerImageRepositoryIDParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
