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

public class AllocatePMVNCSessionRequest extends Request {

    /** 裸金属ID，指定要创建VNC会话的裸金属实例 */
    @NotEmpty
    @OpenAPIParam("PMID")
    private String pMIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** VNC密码，用于身份验证，可选 */
    
    @OpenAPIParam("VNCPassword")
    private String vNCPasswordParam;

    /** VNC端口号，用于远程控制访问，有效端口范围 1-65535 */
    @NotEmpty
    @OpenAPIParam("VNCPort")
    private Integer vNCPortParam;


    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVNCPassword() {
        return vNCPasswordParam;
    }

    public void setVNCPassword(String vNCPasswordParam) {
        this.vNCPasswordParam = vNCPasswordParam;
    }

    public Integer getVNCPort() {
        return vNCPortParam;
    }

    public void setVNCPort(Integer vNCPortParam) {
        this.vNCPortParam = vNCPortParam;
    }

}
