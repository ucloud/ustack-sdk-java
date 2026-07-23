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

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class GetInstallLogsV2Request extends Request {

    /** 日志行数，限制返回的日志行数，0表示不限制 */
    
    @OpenAPIParam("Lines")
    private Integer linesParam;

    /** 裸金属ID，物理机唯一标识 */
    @NotEmpty
    @OpenAPIParam("PMID")
    private String pMIDParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 起始时间，RFC3339格式时间戳，例如2024-01-01T00:00:00Z，若不指定则从日志开始返回 */
    
    @OpenAPIParam("Since")
    private String sinceParam;

    /** 任务ID，安装任务唯一标识 */
    @NotEmpty
    @OpenAPIParam("TaskID")
    private String taskIDParam;


    public Integer getLines() {
        return linesParam;
    }

    public void setLines(Integer linesParam) {
        this.linesParam = linesParam;
    }

    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSince() {
        return sinceParam;
    }

    public void setSince(String sinceParam) {
        this.sinceParam = sinceParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
