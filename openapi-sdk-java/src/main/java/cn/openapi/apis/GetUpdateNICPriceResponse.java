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

public class GetUpdateNICPriceResponse extends Response {

    /** 网卡价格信息列表，包含修改带宽后的价格详情 */
    @SerializedName("Infos")
    private List<NicPriceInfo> infosParam;


    public List<NicPriceInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<NicPriceInfo> infosParam) {
        this.infosParam = infosParam;
    }

}
