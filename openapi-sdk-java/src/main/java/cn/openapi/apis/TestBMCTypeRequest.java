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

public class TestBMCTypeRequest extends Request {

    /** IPMI IP地址 */
    @NotEmpty
    @OpenAPIParam("IPMIIP")
    private String iPMIIPParam;

    /** IPMI密码 */
    @NotEmpty
    @OpenAPIParam("IPMIPassword")
    private String iPMIPasswordParam;

    /** IPMI用户名 */
    @NotEmpty
    @OpenAPIParam("IPMIUsername")
    private String iPMIUsernameParam;

    /** BMC类型名称 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 是否分步骤测试, true, false */
    
    @OpenAPIParam("StepByStep")
    private String stepByStepParam;

    /** 步骤索引, 从 0 开始 (StepByStep为true时必填) */
    
    @OpenAPIParam("StepIndex")
    private Integer stepIndexParam;


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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getStepByStep() {
        return stepByStepParam;
    }

    public void setStepByStep(String stepByStepParam) {
        this.stepByStepParam = stepByStepParam;
    }

    public Integer getStepIndex() {
        return stepIndexParam;
    }

    public void setStepIndex(Integer stepIndexParam) {
        this.stepIndexParam = stepIndexParam;
    }

}
