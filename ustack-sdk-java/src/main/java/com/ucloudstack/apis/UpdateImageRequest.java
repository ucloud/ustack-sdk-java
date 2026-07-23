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

public class UpdateImageRequest extends Request {

    /** 引导类型，取值bios、uefi */
    
    @UCloudStackParam("BootloaderType")
    private String bootloaderTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像ID，需修改属性的目标镜像标识，镜像需处于可用状态 */
    @NotEmpty
    @UCloudStackParam("ImageID")
    private String imageIDParam;

    /** 操作系统发行版，如Ubuntu、CentOS */
    @NotEmpty
    @UCloudStackParam("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统类型，如Linux、Windows */
    @NotEmpty
    @UCloudStackParam("OSType")
    private String oSTypeParam;

    /** 操作系统版本，标识内部安装的具体补丁或版本号 */
    @NotEmpty
    @UCloudStackParam("OSVersion")
    private String oSVersionParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 架构类型，基于计算集群支持的指令集，如x86_64、aarch64 */
    @NotEmpty
    @UCloudStackParam("SetArch")
    private String setArchParam;

    /** Cloud-Init支持，标识镜像是否支持自动化初始化 */
    
    @UCloudStackParam("SupportCloudInit")
    private Boolean supportCloudInitParam;

    /** QEMU Guest Agent支持，标识镜像是否支持QGA通讯 */
    
    @UCloudStackParam("SupportQGA")
    private Boolean supportQGAParam;


    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public String getOSVersion() {
        return oSVersionParam;
    }

    public void setOSVersion(String oSVersionParam) {
        this.oSVersionParam = oSVersionParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public Boolean getSupportCloudInit() {
        return supportCloudInitParam;
    }

    public void setSupportCloudInit(Boolean supportCloudInitParam) {
        this.supportCloudInitParam = supportCloudInitParam;
    }

    public Boolean getSupportQGA() {
        return supportQGAParam;
    }

    public void setSupportQGA(Boolean supportQGAParam) {
        this.supportQGAParam = supportQGAParam;
    }

}
