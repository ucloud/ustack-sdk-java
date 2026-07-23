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

public class DetectBMCTypeV2Request extends Request {

    /** IPMI管理IP地址，用于连接BMC进行类型检测，必须是有效的IPv4地址 */
    @NotEmpty
    @OpenAPIParam("IPMIIP")
    private String iPMIIPParam;

    /** IPMI密码，用于IPMI身份验证 */
    @NotEmpty
    @OpenAPIParam("IPMIPassword")
    private String iPMIPasswordParam;

    /** IPMI用户名，用于IPMI身份验证 */
    @NotEmpty
    @OpenAPIParam("IPMIUsername")
    private String iPMIUsernameParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getIPMIIP() {
        return iPMIIPParam;
    }

    public void setIPMIIP(String iPMIIPParam) {
        this.iPMIIPParam = iPMIIPParam;
    }

    public String getIPMIPassword() {
        return iPMIPasswordParam;
    }

    public void setIPMIPassword(String iPMIPasswordParam) {
        this.iPMIPasswordParam = iPMIPasswordParam;
    }

    public String getIPMIUsername() {
        return iPMIUsernameParam;
    }

    public void setIPMIUsername(String iPMIUsernameParam) {
        this.iPMIUsernameParam = iPMIUsernameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
