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

public class MenuTwo {

    /** 检查项列表，该分类下的具体检查项 */
    @SerializedName("Children")
    private List<ItemReport> childrenParam;

    /** 二级菜单ID，检查分类ID */
    @SerializedName("Key")
    private String keyParam;

    /** 二级菜单名称，检查分类名称 */
    @SerializedName("Title")
    private String titleParam;


    public List<ItemReport> getChildren() {
        return childrenParam;
    }

    public void setChildren(List<ItemReport> childrenParam) {
        this.childrenParam = childrenParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public String getTitle() {
        return titleParam;
    }

    public void setTitle(String titleParam) {
        this.titleParam = titleParam;
    }

}
