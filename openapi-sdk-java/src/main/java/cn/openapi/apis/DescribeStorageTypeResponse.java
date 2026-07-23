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

public class DescribeStorageTypeResponse extends Response {

    /** 存储类型信息列表，包含存储集群类型的详细信息，如类型名称、别名、架构、权限等 */
    @SerializedName("Infos")
    private List<StorageSetTypeInfo> infosParam;

    /** 存储类型总数，返回符合权限的存储集群类型总数量 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<StorageSetTypeInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<StorageSetTypeInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
