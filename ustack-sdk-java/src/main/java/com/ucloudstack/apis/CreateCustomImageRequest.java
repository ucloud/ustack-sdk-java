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

public class CreateCustomImageRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘ID，用于指定制作镜像的源磁盘 */
    
    @UCloudStackParam("DiskID")
    private String diskIDParam;

    /** 镜像描述，用于补充说明，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @UCloudStackParam("ImageDescription")
    private String imageDescriptionParam;

    /** 镜像名称，用于新建自制镜像资源，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("ImageName")
    private String imageNameParam;

    /** 项目ID，资源所属的项目分组标识 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 存储集群类型，用于指定镜像落盘的目标存储集群 */
    
    @UCloudStackParam("StorageSetType")
    private String storageSetTypeParam;

    /** 标签键值对，用于资源标签管理与检索，格式为Base64的key:value，列表项不能为空且key不可重复 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 虚拟机ID，用于指定制作镜像的源虚拟机 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public String getImageDescription() {
        return imageDescriptionParam;
    }

    public void setImageDescription(String imageDescriptionParam) {
        this.imageDescriptionParam = imageDescriptionParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
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

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
