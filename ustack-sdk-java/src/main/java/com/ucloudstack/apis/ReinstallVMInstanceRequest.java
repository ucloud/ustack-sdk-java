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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class ReinstallVMInstanceRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像ID，重装所使用的镜像标识 */
    @NotEmpty
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 管理员密码，重装后的系统管理员密码，密码强度规则由RegionConfigKeyVMPasswordLength与RegionConfigKeyVMPasswordComplexity配置决定 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** Cloud-Init脚本，用于自定义系统初始化配置，需 base64 编码后传入 */
    
    @OpenAPIParam("UserData")
    private String userDataParam;

    /** 虚拟机ID，待重装的虚拟机资源标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


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

    public String getUserData() {
        return userDataParam;
    }

    public void setUserData(String userDataParam) {
        this.userDataParam = userDataParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
