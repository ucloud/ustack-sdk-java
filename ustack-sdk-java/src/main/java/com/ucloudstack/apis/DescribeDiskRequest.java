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

public class DescribeDiskRequest extends Request {

    /** 挂载的资源ID，用于筛选已挂载到指定资源（目前仅支持虚拟机）的磁盘；指定后会先查询该资源绑定的磁盘并以其DiskIDs为筛选条件 */
    
    @UCloudStackParam("AttachResourceID")
    private String attachResourceIDParam;

    /** 租户ID，资源所属租户标识 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 硬盘ID列表，用于查询指定磁盘信息 */
    
    @UCloudStackParam("DiskIDs")
    private List<String> diskIDsParam;

    /** 硬盘类型（已废弃参数），保留向后兼容，传值时会自动转换为DiskTypes */
    
    @UCloudStackParam("DiskType")
    private String diskTypeParam;

    /** 硬盘类型列表，多值过滤字段，取值范围：Boot、Data、cdrom、SaveMem、BootImage */
    
    @UCloudStackParam("DiskTypes")
    private List<String> diskTypesParam;

    /** 搜索关键词，用于模糊匹配磁盘名称或备注 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，为0时默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，用于筛选指定项目组下的磁盘资源 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 存储集群ID列表，用于筛选指定存储集群下的磁盘资源 */
    
    @UCloudStackParam("SetIDs")
    private List<String> setIDsParam;

    /** 筛选共享盘，取值true（仅返回共享盘）或false（仅返回普通盘），空值表示返回所有类型 */
    
    @UCloudStackParam("ShareAbleFilter")
    private String shareAbleFilterParam;


    public String getAttachResourceID() {
        return attachResourceIDParam;
    }

    public void setAttachResourceID(String attachResourceIDParam) {
        this.attachResourceIDParam = attachResourceIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDiskIDs() {
        return diskIDsParam;
    }

    public void setDiskIDs(List<String> diskIDsParam) {
        this.diskIDsParam = diskIDsParam;
    }

    public String getDiskType() {
        return diskTypeParam;
    }

    public void setDiskType(String diskTypeParam) {
        this.diskTypeParam = diskTypeParam;
    }

    public List<String> getDiskTypes() {
        return diskTypesParam;
    }

    public void setDiskTypes(List<String> diskTypesParam) {
        this.diskTypesParam = diskTypesParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSetIDs() {
        return setIDsParam;
    }

    public void setSetIDs(List<String> setIDsParam) {
        this.setIDsParam = setIDsParam;
    }

    public String getShareAbleFilter() {
        return shareAbleFilterParam;
    }

    public void setShareAbleFilter(String shareAbleFilterParam) {
        this.shareAbleFilterParam = shareAbleFilterParam;
    }

}
