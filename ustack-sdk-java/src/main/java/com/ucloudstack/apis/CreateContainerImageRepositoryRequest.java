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

public class CreateContainerImageRepositoryRequest extends Request {

    /** 租户ID，资源所属租户 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像仓库名称，作为仓库唯一标识且同地域内不可重名，不能使用系统保留名称，仅支持字母、数字和中划线，长度3-63 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目组ID，资源所属项目组，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 是否为公有仓库，true 时系统会在资源上打上公有标记并在 Registry 中创建允许所有租户拉取的命名空间，false 时仅仓库所属租户可访问 */
    
    @UCloudStackParam("Public")
    private Boolean publicParam;

    /** 地域，镜像仓库所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，镜像仓库的描述信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 标签键值对，用于资源标记和分类管理，格式为 key:value，传入 Base64 编码字符串 */
    
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

    public Boolean getPublic() {
        return publicParam;
    }

    public void setPublic(Boolean publicParam) {
        this.publicParam = publicParam;
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

}
