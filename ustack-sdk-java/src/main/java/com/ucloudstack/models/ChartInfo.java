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

public class ChartInfo {

    /** 图表唯一标识，用于区分不同图表类型，如CPU、内存、存储等 */
    @SerializedName("ID")
    private String iDParam;

    /** 图表元素列表，包含图表的具体数据项 */
    @SerializedName("Items")
    private List<ChartItem> itemsParam;

    /** 额外的标签列表，用于标识图表的附加属性，如集群的resource_id或监控大屏的tab栏位置 */
    @SerializedName("Labels")
    private List<ChartLabel> labelsParam;

    /** 图表标题，图表的显示名称 */
    @SerializedName("Title")
    private String titleParam;


    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public List<ChartItem> getItems() {
        return itemsParam;
    }

    public void setItems(List<ChartItem> itemsParam) {
        this.itemsParam = itemsParam;
    }

    public List<ChartLabel> getLabels() {
        return labelsParam;
    }

    public void setLabels(List<ChartLabel> labelsParam) {
        this.labelsParam = labelsParam;
    }

    public String getTitle() {
        return titleParam;
    }

    public void setTitle(String titleParam) {
        this.titleParam = titleParam;
    }

}
