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

public class CreateIsolationGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 是否启用，标识隔离组策略是否生效 */
    
    @OpenAPIParam("IsEnable")
    private Boolean isEnableParam;

    /** 是否强制执行，强制模式下即使不满足策略也会执行 */
    
    @OpenAPIParam("IsForce")
    private Boolean isForceParam;

    /** 隔离组名称，用于标识隔离组并便于检索管理，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 策略对象，PolicyObjType为PolicyToVG时填写目标隔离组ID，PolicyToNode时由系统使用默认值 */
    
    @OpenAPIParam("PolicyObj")
    private String policyObjParam;

    /** 策略对象是否为自身，为true时系统将策略对象设置为当前隔离组 */
    
    @OpenAPIParam("PolicyObjIsSelf")
    private Boolean policyObjIsSelfParam;

    /** 策略对象类型，取值PolicyToNode（节点）、PolicyToVG（隔离组） */
    @NotEmpty
    @OpenAPIParam("PolicyObjType")
    private String policyObjTypeParam;

    /** 隔离组策略类型，取值VMAffinity（亲和）、VMAntiAffinity（反亲和） */
    @NotEmpty
    @OpenAPIParam("PolicyType")
    private String policyTypeParam;

    /** 项目ID，资源所属项目分组标识，不传则不绑定项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于补充说明隔离组用途，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 计算集群ID，隔离组所属的计算集群 */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;

    /** 标签键值对，用于资源分类与检索，格式为Base64编码的key:value字符串，列表项不能为空且key不得重复 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Boolean getIsEnable() {
        return isEnableParam;
    }

    public void setIsEnable(Boolean isEnableParam) {
        this.isEnableParam = isEnableParam;
    }

    public Boolean getIsForce() {
        return isForceParam;
    }

    public void setIsForce(Boolean isForceParam) {
        this.isForceParam = isForceParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPolicyObj() {
        return policyObjParam;
    }

    public void setPolicyObj(String policyObjParam) {
        this.policyObjParam = policyObjParam;
    }

    public Boolean getPolicyObjIsSelf() {
        return policyObjIsSelfParam;
    }

    public void setPolicyObjIsSelf(Boolean policyObjIsSelfParam) {
        this.policyObjIsSelfParam = policyObjIsSelfParam;
    }

    public String getPolicyObjType() {
        return policyObjTypeParam;
    }

    public void setPolicyObjType(String policyObjTypeParam) {
        this.policyObjTypeParam = policyObjTypeParam;
    }

    public String getPolicyType() {
        return policyTypeParam;
    }

    public void setPolicyType(String policyTypeParam) {
        this.policyTypeParam = policyTypeParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
