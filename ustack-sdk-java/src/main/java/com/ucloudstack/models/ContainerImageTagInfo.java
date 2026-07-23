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

public class ContainerImageTagInfo {

    /** 租户ID，镜像所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 镜像名，镜像名称 */
    @SerializedName("ContainerImage")
    private String containerImageParam;

    /** 镜像仓库ID，镜像所属仓库ID */
    @SerializedName("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** TagDigest，标签摘要 */
    @SerializedName("ContainerImageTagDigest")
    private String containerImageTagDigestParam;

    /** 镜像Tag拉取次数，标签被拉取的次数 */
    @SerializedName("ContainerImageTagPullNumbers")
    private Integer containerImageTagPullNumbersParam;

    /** 创建时间，标签创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 镜像完整名字，标签外网完整地址 */
    @SerializedName("FullName")
    private String fullNameParam;

    /** 镜像完整名字，标签内网完整地址 */
    @SerializedName("InternalFullName")
    private String internalFullNameParam;

    /** 镜像Size，镜像大小 */
    @SerializedName("Size")
    private Integer sizeParam;

    /** Tag名称，镜像标签名称 */
    @SerializedName("TagName")
    private String tagNameParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getContainerImage() {
        return containerImageParam;
    }

    public void setContainerImage(String containerImageParam) {
        this.containerImageParam = containerImageParam;
    }

    public String getContainerImageRepositoryID() {
        return containerImageRepositoryIDParam;
    }

    public void setContainerImageRepositoryID(String containerImageRepositoryIDParam) {
        this.containerImageRepositoryIDParam = containerImageRepositoryIDParam;
    }

    public String getContainerImageTagDigest() {
        return containerImageTagDigestParam;
    }

    public void setContainerImageTagDigest(String containerImageTagDigestParam) {
        this.containerImageTagDigestParam = containerImageTagDigestParam;
    }

    public Integer getContainerImageTagPullNumbers() {
        return containerImageTagPullNumbersParam;
    }

    public void setContainerImageTagPullNumbers(Integer containerImageTagPullNumbersParam) {
        this.containerImageTagPullNumbersParam = containerImageTagPullNumbersParam;
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

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getTagName() {
        return tagNameParam;
    }

    public void setTagName(String tagNameParam) {
        this.tagNameParam = tagNameParam;
    }

}
