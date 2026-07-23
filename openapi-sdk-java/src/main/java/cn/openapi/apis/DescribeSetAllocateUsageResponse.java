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

public class DescribeSetAllocateUsageResponse extends Response {

    /** 内存使用情况列表 */
    @SerializedName("MemoryUsageInfos")
    private List<MemoryUsageInfo> memoryUsageInfosParam;

    /** 存储使用情况列表 */
    @SerializedName("StorageUsageInfos")
    private List<StorageUsageInfo> storageUsageInfosParam;

    /** vCPU使用情况列表 */
    @SerializedName("VCPUUsageInfos")
    private List<VCPUUsageInfo> vCPUUsageInfosParam;


    public List<MemoryUsageInfo> getMemoryUsageInfos() {
        return memoryUsageInfosParam;
    }

    public void setMemoryUsageInfos(List<MemoryUsageInfo> memoryUsageInfosParam) {
        this.memoryUsageInfosParam = memoryUsageInfosParam;
    }

    public List<StorageUsageInfo> getStorageUsageInfos() {
        return storageUsageInfosParam;
    }

    public void setStorageUsageInfos(List<StorageUsageInfo> storageUsageInfosParam) {
        this.storageUsageInfosParam = storageUsageInfosParam;
    }

    public List<VCPUUsageInfo> getVCPUUsageInfos() {
        return vCPUUsageInfosParam;
    }

    public void setVCPUUsageInfos(List<VCPUUsageInfo> vCPUUsageInfosParam) {
        this.vCPUUsageInfosParam = vCPUUsageInfosParam;
    }

}
