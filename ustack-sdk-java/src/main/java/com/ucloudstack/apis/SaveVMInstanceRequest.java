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

public class SaveVMInstanceRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注信息，对快照的补充说明，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 快照名称，自定义的快照标识，长度1-128，支持中英文、数字、点、下划线、中划线 */
    
    @UCloudStackParam("SPName")
    private String sPNameParam;

    /** 虚拟机ID，待暂存/快照的虚拟机标识 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;

    /** 排除磁盘，标识是否暂存虚拟机而不创建快照，true：暂存虚拟机；false：创建快照 */
    
    @UCloudStackParam("WithoutDisk")
    private Boolean withoutDiskParam;

    /** 排除内存，标识是否不包含内存数据，暂存虚拟机时需设为false */
    
    @UCloudStackParam("WithoutMemory")
    private Boolean withoutMemoryParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSPName() {
        return sPNameParam;
    }

    public void setSPName(String sPNameParam) {
        this.sPNameParam = sPNameParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public Boolean getWithoutDisk() {
        return withoutDiskParam;
    }

    public void setWithoutDisk(Boolean withoutDiskParam) {
        this.withoutDiskParam = withoutDiskParam;
    }

    public Boolean getWithoutMemory() {
        return withoutMemoryParam;
    }

    public void setWithoutMemory(Boolean withoutMemoryParam) {
        this.withoutMemoryParam = withoutMemoryParam;
    }

}
