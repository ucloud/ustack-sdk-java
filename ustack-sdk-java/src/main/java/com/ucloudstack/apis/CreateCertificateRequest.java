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

public class CreateCertificateRequest extends Request {

    /** 证书内容，证书的PEM格式内容，必须为有效的PEM格式证书 */
    @NotEmpty
    @UCloudStackParam("Certificate")
    private String certificateParam;

    /** 证书类型，证书的类型，取值范围：ServerCrt（服务器证书）、CACrt（CA证书），CA证书仅在双向认证时有效 */
    @NotEmpty
    @UCloudStackParam("CertificateType")
    private String certificateTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 名称，证书的名称，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 私钥内容，证书的私钥，证书类型为ServerCrt时必填，CA证书时无效，必须为有效的PEM格式私钥，且必须与证书配对 */
    
    @UCloudStackParam("PrivateKey")
    private String privateKeyParam;

    /** 项目ID，证书所属项目分组标识，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，证书的描述信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public String getCertificate() {
        return certificateParam;
    }

    public void setCertificate(String certificateParam) {
        this.certificateParam = certificateParam;
    }

    public String getCertificateType() {
        return certificateTypeParam;
    }

    public void setCertificateType(String certificateTypeParam) {
        this.certificateTypeParam = certificateTypeParam;
    }

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

    public String getPrivateKey() {
        return privateKeyParam;
    }

    public void setPrivateKey(String privateKeyParam) {
        this.privateKeyParam = privateKeyParam;
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

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
