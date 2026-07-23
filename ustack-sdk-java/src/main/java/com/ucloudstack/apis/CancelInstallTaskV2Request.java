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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CancelInstallTaskV2Request extends Request {

    /** 取消后是否清理已安装的系统，true 或 false，默认值为 false */
    
    @OpenAPIParam("CleanOnCancel")
    private String cleanOnCancelParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 序列号，裸金属的硬件序列号 */
    @NotEmpty
    @OpenAPIParam("SN")
    private String sNParam;

    /** 任务ID，指定要取消的装机任务 */
    @NotEmpty
    @OpenAPIParam("TaskID")
    private String taskIDParam;


    public String getCleanOnCancel() {
        return cleanOnCancelParam;
    }

    public void setCleanOnCancel(String cleanOnCancelParam) {
        this.cleanOnCancelParam = cleanOnCancelParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSN() {
        return sNParam;
    }

    public void setSN(String sNParam) {
        this.sNParam = sNParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
