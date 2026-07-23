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

public class GetVMInstancePriceRequest extends Request {

    /** 系统盘集群ID，指定引导盘所在的存储池位置，影响磁盘的I/O性能和可靠性级别，若未指定，系统将根据策略自动选择 */
    
    @UCloudStackParam("BootDiskSetType")
    private String bootDiskSetTypeParam;

    /** 系统盘容量，虚拟机的启动盘大小，单位：GiB */
    
    @UCloudStackParam("BootDiskSpace")
    private Integer bootDiskSpaceParam;

    /** 核心数，虚拟机的vCPU核心数量 */
    @NotEmpty
    @UCloudStackParam("CPU")
    private Integer cPUParam;

    /** 计费类型，资源的计费模式，取值：Dynamic（按小时）、Month（按月）、Year（按年） */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 购买数量，批量购买的实例个数 */
    @NotEmpty
    @UCloudStackParam("Count")
    private Integer countParam;

    /** GPU数量，挂载的物理GPU数量，仅在GPUType为GPU时有效且必填 */
    
    @UCloudStackParam("GPU")
    private Integer gPUParam;

    /** GPU规格，挂载的物理GPU型号，仅在GPUType为GPU时有效且必填 */
    
    @UCloudStackParam("GPUMdevName")
    private String gPUMdevNameParam;

    /** GPU类型，虚拟机挂载的GPU资源类型，取值：GPU、VGPU，暂未支持VGPU */
    
    @UCloudStackParam("GPUType")
    private String gPUTypeParam;

    /** 镜像ID，创建虚拟机所使用的镜像标识 */
    
    @UCloudStackParam("ImageID")
    private String imageIDParam;

    /** vGPU规格，挂载的虚拟GPU规格，仅在GPUType为VGPU时有效且必填，预留字段，暂未支持 */
    
    @UCloudStackParam("MdevName")
    private String mdevNameParam;

    /** 内存容量，虚拟机的内存大小，单位：MiB */
    @NotEmpty
    @UCloudStackParam("Memory")
    private Integer memoryParam;

    /** 计费周期，购买的时长，按月/年计费时表示月数/年数，按小时计费时固定为1 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 存储类型，磁盘的存储介质类型 */
    
    @UCloudStackParam("StorageType")
    private String storageTypeParam;

    /** 计算集群ID，指定虚拟机所属的计算资源池，决定了虚拟机的CPU架构（如x86、ARM）和可用的宿主机范围 */
    @NotEmpty
    @UCloudStackParam("VMType")
    private String vMTypeParam;


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

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
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

    public String getGPUType() {
        return gPUTypeParam;
    }

    public void setGPUType(String gPUTypeParam) {
        this.gPUTypeParam = gPUTypeParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getStorageType() {
        return storageTypeParam;
    }

    public void setStorageType(String storageTypeParam) {
        this.storageTypeParam = storageTypeParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

}
