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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class GetDataCheckTaskResultResponse extends Response {

    /** 详细差异日志列表，包含数据表级别差异详情，当Result为Inconsistent时返回 */
    @SerializedName("Logs")
    private List<String> logsParam;

    /** 校验结果，数据一致性校验的最终结果，取值范围：Consistent（数据一致）、Inconsistent（数据不一致） */
    @SerializedName("Result")
    private String resultParam;


    public List<String> getLogs() {
        return logsParam;
    }

    public void setLogs(List<String> logsParam) {
        this.logsParam = logsParam;
    }

    public String getResult() {
        return resultParam;
    }

    public void setResult(String resultParam) {
        this.resultParam = resultParam;
    }

}
