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

public class AllocateRedisConsoleSessionRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** Redis实例ID，待获取控制台会话的实例ID */
    @NotEmpty
    @OpenAPIParam("RedisID")
    private String redisIDParam;

    /** 地域ID，地域，一批可共享的物理资源使用集合 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRedisID() {
        return redisIDParam;
    }

    public void setRedisID(String redisIDParam) {
        this.redisIDParam = redisIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
