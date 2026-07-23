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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeParametersHistoriesResponse extends Response {

    /** 参数修改历史列表，来源于审计日志解析结果，按更新时间倒序排列 */
    @SerializedName("Infos")
    private List<ParametersHistoriesInfos> infosParam;

    /** 总数，匹配条件的参数修改条目数量，按照更新时间倒序统计 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<ParametersHistoriesInfos> getInfos() {
        return infosParam;
    }

    public void setInfos(List<ParametersHistoriesInfos> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
