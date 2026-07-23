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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class TagResourceInfo {

    /** 地域ID，表示资源所在的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的用户友好显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源ID，全局唯一的资源标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，用户自定义的资源显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型，标识资源的种类，支持包括DISK、VM等多种资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 标签数量，该资源绑定的标签总数 */
    @SerializedName("TagCount")
    private Integer tagCountParam;

    /** 标签列表，资源绑定的所有标签键值对信息 */
    @SerializedName("Tags")
    private List<Tag> tagsParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceName() {
        return resourceNameParam;
    }

    public void setResourceName(String resourceNameParam) {
        this.resourceNameParam = resourceNameParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public Integer getTagCount() {
        return tagCountParam;
    }

    public void setTagCount(Integer tagCountParam) {
        this.tagCountParam = tagCountParam;
    }

    public List<Tag> getTags() {
        return tagsParam;
    }

    public void setTags(List<Tag> tagsParam) {
        this.tagsParam = tagsParam;
    }

}
