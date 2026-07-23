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

public class CreateDOSTokenRequest extends Request {

    /** 授权的桶，允许访问的桶列表 */
    @NotEmpty
    @OpenAPIParam("AllowBuckets")
    private List<String> allowBucketsParam;

    /** 授权的对象前缀，仅允许 "*" 或不含 "*" 的前缀 */
    @NotEmpty
    @OpenAPIParam("AllowObjectPrefix")
    private String allowObjectPrefixParam;

    /** 允许的操作，允许的S3操作列表 */
    @NotEmpty
    @OpenAPIParam("AllowOps")
    private List<String> allowOpsParam;

    /** IP黑名单，格式需包含 "/" 前缀长度 */
    
    @OpenAPIParam("BlackIPs")
    private List<String> blackIPsParam;

    /** 租户ID，用于标识令牌所属的租户上下文；公司级账号需填写自身CompanyID，系统/地域管理员可不填或指定目标租户 */
    
    @OpenAPIParam("CompanyID")
    private String companyIDParam;

    /** 过期时间，Unix 时间戳（毫秒） */
    @NotEmpty
    @OpenAPIParam("ExpireTime")
    private Integer expireTimeParam;

    /** 令牌名称，令牌展示名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** OSSID，对象存储实例标识 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** IP白名单，格式需包含 "/" 前缀长度 */
    
    @OpenAPIParam("WhiteIPs")
    private List<String> whiteIPsParam;


    public List<String> getAllowBuckets() {
        return allowBucketsParam;
    }

    public void setAllowBuckets(List<String> allowBucketsParam) {
        this.allowBucketsParam = allowBucketsParam;
    }

    public String getAllowObjectPrefix() {
        return allowObjectPrefixParam;
    }

    public void setAllowObjectPrefix(String allowObjectPrefixParam) {
        this.allowObjectPrefixParam = allowObjectPrefixParam;
    }

    public List<String> getAllowOps() {
        return allowOpsParam;
    }

    public void setAllowOps(List<String> allowOpsParam) {
        this.allowOpsParam = allowOpsParam;
    }

    public List<String> getBlackIPs() {
        return blackIPsParam;
    }

    public void setBlackIPs(List<String> blackIPsParam) {
        this.blackIPsParam = blackIPsParam;
    }

    public String getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(String companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getWhiteIPs() {
        return whiteIPsParam;
    }

    public void setWhiteIPs(List<String> whiteIPsParam) {
        this.whiteIPsParam = whiteIPsParam;
    }

}
