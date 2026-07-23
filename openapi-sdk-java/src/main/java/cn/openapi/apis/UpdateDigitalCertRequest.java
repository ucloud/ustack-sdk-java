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

public class UpdateDigitalCertRequest extends Request {

    /** 证书ID列表，多个ID用逗号分隔，总长度不超过255字符且数量不超过系统限制 */
    
    @OpenAPIParam("CertIDs")
    private String certIDsParam;


    public String getCertIDs() {
        return certIDsParam;
    }

    public void setCertIDs(String certIDsParam) {
        this.certIDsParam = certIDsParam;
    }

}
