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

public class InspectionResourceUsageDetail {

    /** 资源用量表单列表，包含该资源的各项用量指标 */
    @SerializedName("Infos")
    private List<InspectionResourceUsageForm> infosParam;

    /** 资源ID，资源的唯一标识，包含资源类型前缀和14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，资源的显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 总数，该资源的用量数据条目数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<InspectionResourceUsageForm> getInfos() {
        return infosParam;
    }

    public void setInfos(List<InspectionResourceUsageForm> infosParam) {
        this.infosParam = infosParam;
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

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
