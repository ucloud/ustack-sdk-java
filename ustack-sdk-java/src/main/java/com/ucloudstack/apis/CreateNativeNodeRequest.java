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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateNativeNodeRequest extends Request {

    /** 系统盘集群ID */
    @NotEmpty
    @OpenAPIParam("BootDiskSetType")
    private String bootDiskSetTypeParam;

    /** 系统盘大小 */
    @NotEmpty
    @OpenAPIParam("BootDiskSpace")
    private Integer bootDiskSpaceParam;

    /** 原生节点CPU数量 */
    
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 集群Id */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型 */
    @NotEmpty
    @OpenAPIParam("ComputeclassType")
    private String computeclassTypeParam;

    /** 数据盘集群ID */
    
    @OpenAPIParam("DataDiskSetType")
    private String dataDiskSetTypeParam;

    /** 数据盘大小 */
    
    @OpenAPIParam("DataDiskSpace")
    private Integer dataDiskSpaceParam;

    /** 原生节点外网IP */
    
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** GPU数量 */
    
    @OpenAPIParam("GPU")
    private Integer gPUParam;

    /** GPU型号 */
    
    @OpenAPIParam("GPUMdevName")
    private String gPUMdevNameParam;

    /** 镜像ID */
    @NotEmpty
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 原生节点pod数量 */
    
    @OpenAPIParam("MaxPods")
    private Integer maxPodsParam;

    /** 原生节点内存容量 */
    
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 节点名称 */
    @NotEmpty
    @OpenAPIParam("NodeName")
    private String nodeNameParam;

    /** 密码 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /**  */
    
    @OpenAPIParam("SGID")
    private String sGIDParam;

    /** 容器子网Id 列表 */
    
    @OpenAPIParam("SubnetIDs")
    private List<String> subnetIDsParam;


    public String getBootDiskSetType() {
        return bootDiskSetTypeParam;
    }

    public void setBootDiskSetType(String bootDiskSetTypeParam) {
        this.bootDiskSetTypeParam = bootDiskSetTypeParam;
    }

    public Integer getBootDiskSpace() {
        return bootDiskSpaceParam;
    }

    public void setBootDiskSpace(Integer bootDiskSpaceParam) {
        this.bootDiskSpaceParam = bootDiskSpaceParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
    }

    public String getDataDiskSetType() {
        return dataDiskSetTypeParam;
    }

    public void setDataDiskSetType(String dataDiskSetTypeParam) {
        this.dataDiskSetTypeParam = dataDiskSetTypeParam;
    }

    public Integer getDataDiskSpace() {
        return dataDiskSpaceParam;
    }

    public void setDataDiskSpace(Integer dataDiskSpaceParam) {
        this.dataDiskSpaceParam = dataDiskSpaceParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public Integer getMaxPods() {
        return maxPodsParam;
    }

    public void setMaxPods(Integer maxPodsParam) {
        this.maxPodsParam = maxPodsParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getNodeName() {
        return nodeNameParam;
    }

    public void setNodeName(String nodeNameParam) {
        this.nodeNameParam = nodeNameParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public List<String> getSubnetIDs() {
        return subnetIDsParam;
    }

    public void setSubnetIDs(List<String> subnetIDsParam) {
        this.subnetIDsParam = subnetIDsParam;
    }

}
