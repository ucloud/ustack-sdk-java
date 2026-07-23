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

public class BucketInfo {

    /** 访问类型，桶访问权限级别，取值范围：Private、PublicRead、PublicReadWrite */
    @SerializedName("AccessType")
    private String accessTypeParam;

    /** 桶事件开关，是否开启事件日志 */
    @SerializedName("BucketEventLogEnabled")
    private Boolean bucketEventLogEnabledParam;

    /** 创建时间，Unix 时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 磁盘用量，单位字节 */
    @SerializedName("DiskUsage")
    private Integer diskUsageParam;

    /** 访问地址，桶访问端点列表 */
    @SerializedName("Endpoints")
    private List<String> endpointsParam;

    /** 桶名称，存储桶名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 对象锁定天数，对象锁定保留天数 */
    @SerializedName("ObjectLockDays")
    private Integer objectLockDaysParam;

    /** 对象锁定开关，是否启用对象锁定 */
    @SerializedName("ObjectLockEnabled")
    private Boolean objectLockEnabledParam;

    /** 对象数量，桶内对象总数 */
    @SerializedName("ObjectsCount")
    private Integer objectsCountParam;

    /** 桶配额，单位GB */
    @SerializedName("Quota")
    private Integer quotaParam;

    /** 地域，桶所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，用于展示 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 更新时间，Unix 时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 用户ID，桶所属用户标识 */
    @SerializedName("UserID")
    private String userIDParam;

    /** 多版本状态，取值范围：Closed、Enabled、Suspended */
    @SerializedName("VersionStatus")
    private String versionStatusParam;

    /** 多版本状态（废弃），请使用VersionStatus */
    @SerializedName("Versioning")
    private Boolean versioningParam;


    public String getAccessType() {
        return accessTypeParam;
    }

    public void setAccessType(String accessTypeParam) {
        this.accessTypeParam = accessTypeParam;
    }

    public Boolean getBucketEventLogEnabled() {
        return bucketEventLogEnabledParam;
    }

    public void setBucketEventLogEnabled(Boolean bucketEventLogEnabledParam) {
        this.bucketEventLogEnabledParam = bucketEventLogEnabledParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getDiskUsage() {
        return diskUsageParam;
    }

    public void setDiskUsage(Integer diskUsageParam) {
        this.diskUsageParam = diskUsageParam;
    }

    public List<String> getEndpoints() {
        return endpointsParam;
    }

    public void setEndpoints(List<String> endpointsParam) {
        this.endpointsParam = endpointsParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getObjectLockDays() {
        return objectLockDaysParam;
    }

    public void setObjectLockDays(Integer objectLockDaysParam) {
        this.objectLockDaysParam = objectLockDaysParam;
    }

    public Boolean getObjectLockEnabled() {
        return objectLockEnabledParam;
    }

    public void setObjectLockEnabled(Boolean objectLockEnabledParam) {
        this.objectLockEnabledParam = objectLockEnabledParam;
    }

    public Integer getObjectsCount() {
        return objectsCountParam;
    }

    public void setObjectsCount(Integer objectsCountParam) {
        this.objectsCountParam = objectsCountParam;
    }

    public Integer getQuota() {
        return quotaParam;
    }

    public void setQuota(Integer quotaParam) {
        this.quotaParam = quotaParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getUserID() {
        return userIDParam;
    }

    public void setUserID(String userIDParam) {
        this.userIDParam = userIDParam;
    }

    public String getVersionStatus() {
        return versionStatusParam;
    }

    public void setVersionStatus(String versionStatusParam) {
        this.versionStatusParam = versionStatusParam;
    }

    public Boolean getVersioning() {
        return versioningParam;
    }

    public void setVersioning(Boolean versioningParam) {
        this.versioningParam = versioningParam;
    }

}
