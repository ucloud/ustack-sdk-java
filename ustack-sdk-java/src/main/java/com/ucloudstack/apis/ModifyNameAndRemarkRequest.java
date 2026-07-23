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

public class ModifyNameAndRemarkRequest extends Request {

    /** 资源名称，请求传入并更新资源显示名称，用于展示资源信息，长度为1-30个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 地域ID，请求传入并定位资源所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，请求传入并更新资源说明信息，可用于备注用途或状态，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符， */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 资源ID，请求传入并定位要修改名称或备注的资源 */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;


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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
