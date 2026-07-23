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

public class DescribePaaSInstanceResponse extends Response {

    /** PaaS实例列表，默认返回绑定的所有虚拟机及其迁移状态；平台管理员可看到更多诊断字段 */
    @SerializedName("Infos")
    private List<PaaSInstance> infosParam;


    public List<PaaSInstance> getInfos() {
        return infosParam;
    }

    public void setInfos(List<PaaSInstance> infosParam) {
        this.infosParam = infosParam;
    }

}
