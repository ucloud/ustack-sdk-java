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

public class CreatePMV2Response extends Response {

    /** 裸金属ID，创建成功的裸金属实例标识 */
    @SerializedName("PMID")
    private String pMIDParam;

    /** 序列号，从硬件获取的物理机唯一序列号 */
    @SerializedName("SN")
    private String sNParam;


    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getSN() {
        return sNParam;
    }

    public void setSN(String sNParam) {
        this.sNParam = sNParam;
    }

}
