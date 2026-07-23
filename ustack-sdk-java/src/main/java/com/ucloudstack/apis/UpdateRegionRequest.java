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

public class UpdateRegionRequest extends Request {

    /** 地址，请求传入并更新数据中心详细物理地址 */
    
    @OpenAPIParam("Address")
    private String addressParam;

    /** 城市，请求传入并更新地域所属行政城市名称 */
    @NotEmpty
    @OpenAPIParam("City")
    private String cityParam;

    /** 地域名称，请求传入并更新地域显示名称，用于展示地域信息，长度为1-30个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域ID，请求传入并定位要更新的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，请求传入并更新地域说明信息，可用于备注用途或状态，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符， */
    
    @OpenAPIParam("Remark")
    private String remarkParam;


    public String getAddress() {
        return addressParam;
    }

    public void setAddress(String addressParam) {
        this.addressParam = addressParam;
    }

    public String getCity() {
        return cityParam;
    }

    public void setCity(String cityParam) {
        this.cityParam = cityParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
