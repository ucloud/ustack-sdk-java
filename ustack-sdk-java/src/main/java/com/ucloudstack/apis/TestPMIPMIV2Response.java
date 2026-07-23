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

public class TestPMIPMIV2Response extends Response {

    /** BMC信息，包含BMC版本、厂商等详细信息 */
    @SerializedName("BMCInfo")
    private String bMCInfoParam;

    /** 序列号，从IPMI接口获取的物理机序列号 */
    @SerializedName("SerialNumber")
    private String serialNumberParam;

    /** 测试是否成功，true表示IPMI连接成功，false表示连接失败 */
    @SerializedName("Success")
    private Boolean successParam;


    public String getBMCInfo() {
        return bMCInfoParam;
    }

    public void setBMCInfo(String bMCInfoParam) {
        this.bMCInfoParam = bMCInfoParam;
    }

    public String getSerialNumber() {
        return serialNumberParam;
    }

    public void setSerialNumber(String serialNumberParam) {
        this.serialNumberParam = serialNumberParam;
    }

    public Boolean getSuccess() {
        return successParam;
    }

    public void setSuccess(Boolean successParam) {
        this.successParam = successParam;
    }

}
