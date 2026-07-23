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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class PodInfo {

    /** CPU资源上限，单位核 */
    @SerializedName("CPULimit")
    private Integer cPULimitParam;

    /** CPU资源下限，单位核 */
    @SerializedName("CPURequest")
    private Integer cPURequestParam;

    /** 容器详情列表，展示Pod内容器资源信息 */
    @SerializedName("Containers")
    private List<ContainerInfo> containersParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 物理机ID，宿主机标识 */
    @SerializedName("HostID")
    private String hostIDParam;

    /** 物理机IP地址，宿主机IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 内存资源上限，单位GiB */
    @SerializedName("MemoryLimit")
    private Integer memoryLimitParam;

    /** 内存资源下限，单位GiB */
    @SerializedName("MemoryRequest")
    private Integer memoryRequestParam;

    /** Pod名称，用于展示Pod名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 命名空间，Pod所属命名空间 */
    @SerializedName("NameSpace")
    private String nameSpaceParam;

    /** Pod状态，标识当前状态 */
    @SerializedName("Phase")
    private String phaseParam;

    /** PodIP，Pod内网IP地址 */
    @SerializedName("PodIP")
    private String podIPParam;


    public Integer getCPULimit() {
        return cPULimitParam;
    }

    public void setCPULimit(Integer cPULimitParam) {
        this.cPULimitParam = cPULimitParam;
    }

    public Integer getCPURequest() {
        return cPURequestParam;
    }

    public void setCPURequest(Integer cPURequestParam) {
        this.cPURequestParam = cPURequestParam;
    }

    public List<ContainerInfo> getContainers() {
        return containersParam;
    }

    public void setContainers(List<ContainerInfo> containersParam) {
        this.containersParam = containersParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getHostID() {
        return hostIDParam;
    }

    public void setHostID(String hostIDParam) {
        this.hostIDParam = hostIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public Integer getMemoryLimit() {
        return memoryLimitParam;
    }

    public void setMemoryLimit(Integer memoryLimitParam) {
        this.memoryLimitParam = memoryLimitParam;
    }

    public Integer getMemoryRequest() {
        return memoryRequestParam;
    }

    public void setMemoryRequest(Integer memoryRequestParam) {
        this.memoryRequestParam = memoryRequestParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNameSpace() {
        return nameSpaceParam;
    }

    public void setNameSpace(String nameSpaceParam) {
        this.nameSpaceParam = nameSpaceParam;
    }

    public String getPhase() {
        return phaseParam;
    }

    public void setPhase(String phaseParam) {
        this.phaseParam = phaseParam;
    }

    public String getPodIP() {
        return podIPParam;
    }

    public void setPodIP(String podIPParam) {
        this.podIPParam = podIPParam;
    }

}
