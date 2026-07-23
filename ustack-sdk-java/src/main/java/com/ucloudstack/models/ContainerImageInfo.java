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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ContainerImageInfo {

    /** 租户ID，镜像所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 镜像拉取次数，镜像被拉取的次数 */
    @SerializedName("ContainerImagePullNumbers")
    private Integer containerImagePullNumbersParam;

    /** 镜像仓库ID，镜像所属仓库ID */
    @SerializedName("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** 创建时间，镜像创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 镜像完整名字，镜像外网完整地址 */
    @SerializedName("FullName")
    private String fullNameParam;

    /** 镜像完整名字，镜像内网完整地址 */
    @SerializedName("InternalFullName")
    private String internalFullNameParam;

    /** 最新tag名称，镜像最新标签 */
    @SerializedName("LatestTag")
    private String latestTagParam;

    /** 名称，镜像名称 */
    @SerializedName("Name")
    private String nameParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getContainerImagePullNumbers() {
        return containerImagePullNumbersParam;
    }

    public void setContainerImagePullNumbers(Integer containerImagePullNumbersParam) {
        this.containerImagePullNumbersParam = containerImagePullNumbersParam;
    }

    public String getContainerImageRepositoryID() {
        return containerImageRepositoryIDParam;
    }

    public void setContainerImageRepositoryID(String containerImageRepositoryIDParam) {
        this.containerImageRepositoryIDParam = containerImageRepositoryIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getFullName() {
        return fullNameParam;
    }

    public void setFullName(String fullNameParam) {
        this.fullNameParam = fullNameParam;
    }

    public String getInternalFullName() {
        return internalFullNameParam;
    }

    public void setInternalFullName(String internalFullNameParam) {
        this.internalFullNameParam = internalFullNameParam;
    }

    public String getLatestTag() {
        return latestTagParam;
    }

    public void setLatestTag(String latestTagParam) {
        this.latestTagParam = latestTagParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

}
