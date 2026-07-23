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

public class CreateSlaveRedisRequest extends Request {

    /** 计费类型，取值Dynamic/Month/Year，分别对应HOUR/MONTH/YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，从库实例所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群类型，从库实例数据盘所属存储集群类型 */
    
    @OpenAPIParam("DiskSetType")
    private String diskSetTypeParam;

    /** 外网IP资源ID，用于绑定公网IP */
    
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** 内存容量，单位MiB，且不得小于主库内存 */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 名称，从库实例名称，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 密码，从库登录密码 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 主库ID，从库所属主库实例ID；必须为主库实例且状态为Running，单主库最多5个从库 */
    @NotEmpty
    @OpenAPIParam("RedisID")
    private String redisIDParam;

    /** 地域ID，从库实例所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 描述，从库实例备注，长度为0-100个英文或中文字符，不能包含<script>、<a javascript:>等非法字符，用于XSS防护 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 标签键值对，资源标签键值对列表，格式为Base64编码的key:value */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 线程数量，Redis7.0有效 */
    
    @OpenAPIParam("Threads")
    private Integer threadsParam;

    /** 计算集群类型，从库实例所属计算集群类型 */
    @NotEmpty
    @OpenAPIParam("VMType")
    private String vMTypeParam;

    /** Redis版本，取值4.0或7.0，默认4.0；主库为7.0时从库版本必须为7.0 */
    
    @OpenAPIParam("Version")
    private String versionParam;

    /** 安全组ID，用于外网访问控制 */
    
    @OpenAPIParam("WANSGID")
    private String wANSGIDParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskSetType() {
        return diskSetTypeParam;
    }

    public void setDiskSetType(String diskSetTypeParam) {
        this.diskSetTypeParam = diskSetTypeParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
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

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public Integer getThreads() {
        return threadsParam;
    }

    public void setThreads(Integer threadsParam) {
        this.threadsParam = threadsParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
