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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class PartitionTemplateConfig {

    /** Btrfs子卷配置 */
    @SerializedName("BtrfsSubvols")
    private List<PartitionTemplateBtrfsSubvol> btrfsSubvolsParam;

    /** LVM卷组名称 */
    @SerializedName("LVMVolumeGroup")
    private String lVMVolumeGroupParam;

    /** 分区列表 */
    @SerializedName("Partitions")
    private List<PartitionTemplatePartition> partitionsParam;

    /** RAID配置 */
    @SerializedName("RAIDConfigs")
    private List<PartitionTemplateRAIDConfig> rAIDConfigsParam;

    /** 分区方案: standard, lvm, raid, btrfs */
    @SerializedName("Scheme")
    private String schemeParam;


    public List<PartitionTemplateBtrfsSubvol> getBtrfsSubvols() {
        return btrfsSubvolsParam;
    }

    public void setBtrfsSubvols(List<PartitionTemplateBtrfsSubvol> btrfsSubvolsParam) {
        this.btrfsSubvolsParam = btrfsSubvolsParam;
    }

    public String getLVMVolumeGroup() {
        return lVMVolumeGroupParam;
    }

    public void setLVMVolumeGroup(String lVMVolumeGroupParam) {
        this.lVMVolumeGroupParam = lVMVolumeGroupParam;
    }

    public List<PartitionTemplatePartition> getPartitions() {
        return partitionsParam;
    }

    public void setPartitions(List<PartitionTemplatePartition> partitionsParam) {
        this.partitionsParam = partitionsParam;
    }

    public List<PartitionTemplateRAIDConfig> getRAIDConfigs() {
        return rAIDConfigsParam;
    }

    public void setRAIDConfigs(List<PartitionTemplateRAIDConfig> rAIDConfigsParam) {
        this.rAIDConfigsParam = rAIDConfigsParam;
    }

    public String getScheme() {
        return schemeParam;
    }

    public void setScheme(String schemeParam) {
        this.schemeParam = schemeParam;
    }

}
