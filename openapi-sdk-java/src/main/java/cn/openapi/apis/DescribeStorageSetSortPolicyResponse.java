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

public class DescribeStorageSetSortPolicyResponse extends Response {

    /** 排序策略，当前配置的存储集群排序策略，值为default、available、ssd、hdd或defined之一 */
    @SerializedName("Policy")
    private String policyParam;

    /** 自定义集群ID列表，当Policy为defined时返回，表示存储集群的优先级顺序 */
    @SerializedName("SetIDs")
    private List<String> setIDsParam;


    public String getPolicy() {
        return policyParam;
    }

    public void setPolicy(String policyParam) {
        this.policyParam = policyParam;
    }

    public List<String> getSetIDs() {
        return setIDsParam;
    }

    public void setSetIDs(List<String> setIDsParam) {
        this.setIDsParam = setIDsParam;
    }

}
