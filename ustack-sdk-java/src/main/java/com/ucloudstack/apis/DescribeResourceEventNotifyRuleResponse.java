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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeResourceEventNotifyRuleResponse extends Response {

    /** 资源事件通知规则详情，规则列表 */
    @SerializedName("Infos")
    private List<ResourceEventNotifyRuleInfo> infosParam;

    /** 资源总数，查询到的规则总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<ResourceEventNotifyRuleInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<ResourceEventNotifyRuleInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
