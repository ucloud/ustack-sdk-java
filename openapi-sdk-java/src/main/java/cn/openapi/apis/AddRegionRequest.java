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

public class AddRegionRequest extends Request {

    /** 中心管理平台IP，用于地域向中心注册和心跳上报；未传入时优先使用系统配置CMPIP，仍为空时通过UDP连接RegionIP获取本地IP */
    
    @OpenAPIParam("CMPIP")
    private String cMPIPParam;

    /** 地域ID，请求传入待纳管物理地域唯一标识码，用于区分不同数据中心区域；纳管地域场景使用 */
    @NotEmpty
    @OpenAPIParam("RegionID")
    private String regionIDParam;

    /** 地域IP地址，请求传入地域管理平面入口地址，用于下载地域配置文件并上传告警回调配置 */
    @NotEmpty
    @OpenAPIParam("RegionIP")
    private String regionIPParam;

    /** 认证令牌，请求传入用于地域纳管身份认证，确保只有授权地域可加入系统；纳管地域场景使用 */
    @NotEmpty
    @OpenAPIParam("RegionToken")
    private String regionTokenParam;


    public String getCMPIP() {
        return cMPIPParam;
    }

    public void setCMPIP(String cMPIPParam) {
        this.cMPIPParam = cMPIPParam;
    }

    public String getRegionID() {
        return regionIDParam;
    }

    public void setRegionID(String regionIDParam) {
        this.regionIDParam = regionIDParam;
    }

    public String getRegionIP() {
        return regionIPParam;
    }

    public void setRegionIP(String regionIPParam) {
        this.regionIPParam = regionIPParam;
    }

    public String getRegionToken() {
        return regionTokenParam;
    }

    public void setRegionToken(String regionTokenParam) {
        this.regionTokenParam = regionTokenParam;
    }

}
