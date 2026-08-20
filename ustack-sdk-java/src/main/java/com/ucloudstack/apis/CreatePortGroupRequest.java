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

public class CreatePortGroupRequest extends Request {

    /** 租户ID，标识端口组所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 端口组名称，用于标识端口组，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目ID，端口组所属项目分组标识 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识端口组所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于说明和注释，长度0-100字符，禁止http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 端口组规则，定义端口组包含的协议与端口组合，格式为协议:端口或协议:端口范围，多条规则以逗号分隔 */
    @NotEmpty
    @UCloudStackParam("Rules")
    private String rulesParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getRules() {
        return rulesParam;
    }

    public void setRules(String rulesParam) {
        this.rulesParam = rulesParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
