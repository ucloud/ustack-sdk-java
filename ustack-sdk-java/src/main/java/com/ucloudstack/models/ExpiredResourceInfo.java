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

public class ExpiredResourceInfo {

    /** 过期资源列表，包含该资源类型下的所有过期资源 */
    @SerializedName("Items")
    private List<BaseExpiredResourceInfo> itemsParam;

    /** 资源类型，资源的分类标识 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;


    public List<BaseExpiredResourceInfo> getItems() {
        return itemsParam;
    }

    public void setItems(List<BaseExpiredResourceInfo> itemsParam) {
        this.itemsParam = itemsParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
