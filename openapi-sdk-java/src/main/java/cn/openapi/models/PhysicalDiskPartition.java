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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class PhysicalDiskPartition {

    /** 挂载点，分区挂载路径 */
    @SerializedName("Mountpoint")
    private String mountpointParam;

    /** 分区名，磁盘分区名称 */
    @SerializedName("Partition")
    private String partitionParam;

    /** 大小，单位GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 已用大小，单位GiB */
    @SerializedName("Used")
    private Integer usedParam;


    public String getMountpoint() {
        return mountpointParam;
    }

    public void setMountpoint(String mountpointParam) {
        this.mountpointParam = mountpointParam;
    }

    public String getPartition() {
        return partitionParam;
    }

    public void setPartition(String partitionParam) {
        this.partitionParam = partitionParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public Integer getUsed() {
        return usedParam;
    }

    public void setUsed(Integer usedParam) {
        this.usedParam = usedParam;
    }

}
