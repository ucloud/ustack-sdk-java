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

public class ItemReport {

    /** 检查项描述，详细说明检查的内容和目的 */
    @SerializedName("ItemDesc")
    private String itemDescParam;

    /** 检查项名称，检查项的显示名称 */
    @SerializedName("ItemName")
    private String itemNameParam;

    /** 检查项序号，用于排序和标识 */
    @SerializedName("ItemNo")
    private Integer itemNoParam;

    /** 检查结果列表，包含该检查项的所有检查结果 */
    @SerializedName("Results")
    private List<Result> resultsParam;

    /** 建议，针对检查结果的优化建议 */
    @SerializedName("Suggest")
    private String suggestParam;


    public String getItemDesc() {
        return itemDescParam;
    }

    public void setItemDesc(String itemDescParam) {
        this.itemDescParam = itemDescParam;
    }

    public String getItemName() {
        return itemNameParam;
    }

    public void setItemName(String itemNameParam) {
        this.itemNameParam = itemNameParam;
    }

    public Integer getItemNo() {
        return itemNoParam;
    }

    public void setItemNo(Integer itemNoParam) {
        this.itemNoParam = itemNoParam;
    }

    public List<Result> getResults() {
        return resultsParam;
    }

    public void setResults(List<Result> resultsParam) {
        this.resultsParam = resultsParam;
    }

    public String getSuggest() {
        return suggestParam;
    }

    public void setSuggest(String suggestParam) {
        this.suggestParam = suggestParam;
    }

}
