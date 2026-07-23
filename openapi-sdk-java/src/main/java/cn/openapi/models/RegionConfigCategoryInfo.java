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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class RegionConfigCategoryInfo {

    /** 类别标识，地域配置类别的唯一键 */
    @SerializedName("Category")
    private String categoryParam;

    /** 类别名称，地域配置类别的显示名称，支持国际化 */
    @SerializedName("CategoryName")
    private String categoryNameParam;

    /** 类别排序位置，用于前端展示排序 */
    @SerializedName("CategoryPosition")
    private Integer categoryPositionParam;

    /** 类别下的地域配置项列表 */
    @SerializedName("ConfigInfos")
    private List<RegionConfigInfo> configInfosParam;


    public String getCategory() {
        return categoryParam;
    }

    public void setCategory(String categoryParam) {
        this.categoryParam = categoryParam;
    }

    public String getCategoryName() {
        return categoryNameParam;
    }

    public void setCategoryName(String categoryNameParam) {
        this.categoryNameParam = categoryNameParam;
    }

    public Integer getCategoryPosition() {
        return categoryPositionParam;
    }

    public void setCategoryPosition(Integer categoryPositionParam) {
        this.categoryPositionParam = categoryPositionParam;
    }

    public List<RegionConfigInfo> getConfigInfos() {
        return configInfosParam;
    }

    public void setConfigInfos(List<RegionConfigInfo> configInfosParam) {
        this.configInfosParam = configInfosParam;
    }

}
