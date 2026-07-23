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

public class DescribeImageRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像格式，用于筛选镜像格式，取值qcow2、iso、vmdk、raw */
    
    @UCloudStackParam("ImageFormat")
    private String imageFormatParam;

    /** 镜像ID列表，用于精确筛选指定镜像集合 */
    
    @UCloudStackParam("ImageIDs")
    private List<String> imageIDsParam;

    /** 镜像类型，用于筛选镜像类型，取值Base、Custom */
    
    @UCloudStackParam("ImageType")
    private String imageTypeParam;

    /** 关键词，用于对镜像名称或备注进行模糊检索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页记录数，用于限制单次返回条数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 起始偏移量，用于指定返回结果集的起始位置 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于筛选自定义镜像所属项目，基础镜像不生效 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 状态列表，用于筛选指定状态的镜像资源 */
    
    @UCloudStackParam("Status")
    private List<String> statusParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getImageFormat() {
        return imageFormatParam;
    }

    public void setImageFormat(String imageFormatParam) {
        this.imageFormatParam = imageFormatParam;
    }

    public List<String> getImageIDs() {
        return imageIDsParam;
    }

    public void setImageIDs(List<String> imageIDsParam) {
        this.imageIDsParam = imageIDsParam;
    }

    public String getImageType() {
        return imageTypeParam;
    }

    public void setImageType(String imageTypeParam) {
        this.imageTypeParam = imageTypeParam;
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

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getStatus() {
        return statusParam;
    }

    public void setStatus(List<String> statusParam) {
        this.statusParam = statusParam;
    }

}
