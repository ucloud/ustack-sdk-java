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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class DBSStorageInfo {

    /** 外部服务访问密钥，当StorageType为S3时使用 */
    @SerializedName("AccessKey")
    private String accessKeyParam;

    /** 外部服务存储桶名称，当StorageType为S3时使用 */
    @SerializedName("BucketName")
    private String bucketNameParam;

    /** 租户ID，存储池所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，存储池创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 外部服务地址，当StorageType为S3时使用 */
    @SerializedName("Endpoint")
    private String endpointParam;

    /** 名称，备份存储池名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 对象存储ID，绑定的OSS资源ID */
    @SerializedName("OSSID")
    private String oSSIDParam;

    /** 对象存储名称，绑定的OSS名称 */
    @SerializedName("OSSName")
    private String oSSNameParam;

    /** 地域ID，存储池所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备份计划ID列表，关联的备份计划ID */
    @SerializedName("RelatedPlanIDs")
    private List<String> relatedPlanIDsParam;

    /** 备注，备份存储池描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 外部服务私钥，当StorageType为S3时使用 */
    @SerializedName("SecretKey")
    private String secretKeyParam;

    /** 总空间，存储池总容量 */
    @SerializedName("Space")
    private Double spaceParam;

    /** 已用空间，存储池已使用容量 */
    @SerializedName("SpaceUsed")
    private Double spaceUsedParam;

    /** 状态，备份存储池状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 备份存储池ID，存储池唯一标识 */
    @SerializedName("StorageID")
    private String storageIDParam;

    /** 存储类型，取值OSS或S3 */
    @SerializedName("StorageType")
    private String storageTypeParam;

    /** 更新时间，存储池更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getAccessKey() {
        return accessKeyParam;
    }

    public void setAccessKey(String accessKeyParam) {
        this.accessKeyParam = accessKeyParam;
    }

    public String getBucketName() {
        return bucketNameParam;
    }

    public void setBucketName(String bucketNameParam) {
        this.bucketNameParam = bucketNameParam;
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

    public String getEndpoint() {
        return endpointParam;
    }

    public void setEndpoint(String endpointParam) {
        this.endpointParam = endpointParam;
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

    public String getOSSName() {
        return oSSNameParam;
    }

    public void setOSSName(String oSSNameParam) {
        this.oSSNameParam = oSSNameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getRelatedPlanIDs() {
        return relatedPlanIDsParam;
    }

    public void setRelatedPlanIDs(List<String> relatedPlanIDsParam) {
        this.relatedPlanIDsParam = relatedPlanIDsParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSecretKey() {
        return secretKeyParam;
    }

    public void setSecretKey(String secretKeyParam) {
        this.secretKeyParam = secretKeyParam;
    }

    public Double getSpace() {
        return spaceParam;
    }

    public void setSpace(Double spaceParam) {
        this.spaceParam = spaceParam;
    }

    public Double getSpaceUsed() {
        return spaceUsedParam;
    }

    public void setSpaceUsed(Double spaceUsedParam) {
        this.spaceUsedParam = spaceUsedParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageID() {
        return storageIDParam;
    }

    public void setStorageID(String storageIDParam) {
        this.storageIDParam = storageIDParam;
    }

    public String getStorageType() {
        return storageTypeParam;
    }

    public void setStorageType(String storageTypeParam) {
        this.storageTypeParam = storageTypeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
