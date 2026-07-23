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

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateExternalStorageSetRequest extends Request {

    /** CSI插件地址，存储集群CSI插件的访问地址，格式为IP:Port，支持多个地址用逗号分隔 */
    @NotEmpty
    @OpenAPIParam("CSIPluginAddress")
    private String cSIPluginAddressParam;

    /** 租户ID，外置存储集群所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** IQN禁用列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("DisableTargetIQNs")
    private List<String> disableTargetIQNsParam;

    /** IQN启用列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("EnableTargetIQNs")
    private List<String> enableTargetIQNsParam;

    /** 名称，存储集群名称，1-128个字符，仅支持中文、英文字母、数字、点（.）、下划线（_）和中划线（-） */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 密码，登录存储集群的密码，最多50个字符 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 用户名，登录存储集群的用户名，最多50个字符 */
    
    @OpenAPIParam("UserName")
    private String userNameParam;


    public String getCSIPluginAddress() {
        return cSIPluginAddressParam;
    }

    public void setCSIPluginAddress(String cSIPluginAddressParam) {
        this.cSIPluginAddressParam = cSIPluginAddressParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDisableTargetIQNs() {
        return disableTargetIQNsParam;
    }

    public void setDisableTargetIQNs(List<String> disableTargetIQNsParam) {
        this.disableTargetIQNsParam = disableTargetIQNsParam;
    }

    public List<String> getEnableTargetIQNs() {
        return enableTargetIQNsParam;
    }

    public void setEnableTargetIQNs(List<String> enableTargetIQNsParam) {
        this.enableTargetIQNsParam = enableTargetIQNsParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getUserName() {
        return userNameParam;
    }

    public void setUserName(String userNameParam) {
        this.userNameParam = userNameParam;
    }

}
