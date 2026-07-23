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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetNativeNodePriceRequest extends Request {

    /** 系统盘集群ID */
    @NotEmpty
    @UCloudStackParam("BootDiskSetType")
    private String bootDiskSetTypeParam;

    /** 系统盘大小 */
    @NotEmpty
    @UCloudStackParam("BootDiskSpace")
    private Integer bootDiskSpaceParam;

    /** CPU核数 */
    @NotEmpty
    @UCloudStackParam("CPU")
    private Integer cPUParam;

    /** ClusterID */
    
    @UCloudStackParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型 */
    @NotEmpty
    @UCloudStackParam("ComputeclassType")
    private String computeclassTypeParam;

    /** 数量 */
    @NotEmpty
    @UCloudStackParam("Count")
    private Integer countParam;

    /** 数据盘集群ID */
    
    @UCloudStackParam("DataDiskSetType")
    private String dataDiskSetTypeParam;

    /** 数据盘大小 */
    
    @UCloudStackParam("DataDiskSpace")
    private Integer dataDiskSpaceParam;

    /** GPU数量 */
    
    @UCloudStackParam("GPU")
    private Integer gPUParam;

    /** GPU型号 */
    
    @UCloudStackParam("GPUMdevName")
    private String gPUMdevNameParam;

    /** 内存大小 */
    @NotEmpty
    @UCloudStackParam("Memory")
    private Integer memoryParam;

    /** 地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


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

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
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

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
