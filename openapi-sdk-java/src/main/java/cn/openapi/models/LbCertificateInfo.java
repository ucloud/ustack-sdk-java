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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class LbCertificateInfo {

    /** 证书内容，证书的PEM格式内容 */
    @SerializedName("CertificateContent")
    private String certificateContentParam;

    /** 证书ID，用于标识证书 */
    @SerializedName("CertificateID")
    private String certificateIDParam;

    /** 证书类型，证书的类型，取值范围：ServerCrt（服务器证书）、CACrt（CA证书） */
    @SerializedName("CertificateType")
    private String certificateTypeParam;

    /** 主域名，证书的主域名（CN字段） */
    @SerializedName("CommonName")
    private String commonNameParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，证书在平台上的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 邮箱，资源所有者的邮箱地址，用于展示联系人信息 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，证书内容的秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 证书指纹，证书的指纹（通常为SHA-1哈希值） */
    @SerializedName("Fingerprint")
    private String fingerprintParam;

    /** 名称，证书的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 私钥内容，证书的私钥内容 */
    @SerializedName("Privatekey")
    private String privatekeyParam;

    /** 项目ID，用于标识证书所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，用于展示证书所属项目分组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，证书的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 状态，证书的生命周期状态 */
    @SerializedName("State")
    private String stateParam;

    /** 备选域名列表，证书的SANs（Subject Alternative Names） */
    @SerializedName("SubjectAlternativeNames")
    private List<String> subjectAlternativeNamesParam;

    /** 标签列表，用于展示证书关联标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 虚拟服务器绑定列表，证书关联的虚拟服务器列表 */
    @SerializedName("VSInfos")
    private List<LbBindVSInfo> vSInfosParam;


    public String getCertificateContent() {
        return certificateContentParam;
    }

    public void setCertificateContent(String certificateContentParam) {
        this.certificateContentParam = certificateContentParam;
    }

    public String getCertificateID() {
        return certificateIDParam;
    }

    public void setCertificateID(String certificateIDParam) {
        this.certificateIDParam = certificateIDParam;
    }

    public String getCertificateType() {
        return certificateTypeParam;
    }

    public void setCertificateType(String certificateTypeParam) {
        this.certificateTypeParam = certificateTypeParam;
    }

    public String getCommonName() {
        return commonNameParam;
    }

    public void setCommonName(String commonNameParam) {
        this.commonNameParam = commonNameParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getFingerprint() {
        return fingerprintParam;
    }

    public void setFingerprint(String fingerprintParam) {
        this.fingerprintParam = fingerprintParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPrivatekey() {
        return privatekeyParam;
    }

    public void setPrivatekey(String privatekeyParam) {
        this.privatekeyParam = privatekeyParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
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

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNamesParam;
    }

    public void setSubjectAlternativeNames(List<String> subjectAlternativeNamesParam) {
        this.subjectAlternativeNamesParam = subjectAlternativeNamesParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public List<LbBindVSInfo> getVSInfos() {
        return vSInfosParam;
    }

    public void setVSInfos(List<LbBindVSInfo> vSInfosParam) {
        this.vSInfosParam = vSInfosParam;
    }

}
