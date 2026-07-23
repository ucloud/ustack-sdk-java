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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateInstallProfileRequest extends Request {

    /** 租户ID，可选；用于记录模板归属，不传时由登录上下文推断 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 模板描述，可选 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 镜像ID，clone模式必填 */
    
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 镜像名称，clone模式必填 */
    
    @OpenAPIParam("ImageName")
    private String imageNameParam;

    /** 镜像操作系统发行版，clone模式必填 */
    
    @OpenAPIParam("ImageOSDistribution")
    private String imageOSDistributionParam;

    /** 镜像操作系统名称，clone模式必填 */
    
    @OpenAPIParam("ImageOSName")
    private String imageOSNameParam;

    /** 安装模式，kickstart：Kickstart自动化安装；clone：克隆安装 */
    @NotEmpty
    @OpenAPIParam("InstallMode")
    private String installModeParam;

    /** Kickstart模板ID，kickstart模式必填 */
    
    @OpenAPIParam("KickstartTemplateID")
    private String kickstartTemplateIDParam;

    /** 模板名称，同租户内唯一 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 系统镜像ID，kickstart模式必填 */
    
    @OpenAPIParam("OSMediaID")
    private String oSMediaIDParam;

    /** 分区模板ID，kickstart模式必填 */
    
    @OpenAPIParam("PartitionTemplateID")
    private String partitionTemplateIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
    }

    public String getImageOSDistribution() {
        return imageOSDistributionParam;
    }

    public void setImageOSDistribution(String imageOSDistributionParam) {
        this.imageOSDistributionParam = imageOSDistributionParam;
    }

    public String getImageOSName() {
        return imageOSNameParam;
    }

    public void setImageOSName(String imageOSNameParam) {
        this.imageOSNameParam = imageOSNameParam;
    }

    public String getInstallMode() {
        return installModeParam;
    }

    public void setInstallMode(String installModeParam) {
        this.installModeParam = installModeParam;
    }

    public String getKickstartTemplateID() {
        return kickstartTemplateIDParam;
    }

    public void setKickstartTemplateID(String kickstartTemplateIDParam) {
        this.kickstartTemplateIDParam = kickstartTemplateIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSMediaID() {
        return oSMediaIDParam;
    }

    public void setOSMediaID(String oSMediaIDParam) {
        this.oSMediaIDParam = oSMediaIDParam;
    }

    public String getPartitionTemplateID() {
        return partitionTemplateIDParam;
    }

    public void setPartitionTemplateID(String partitionTemplateIDParam) {
        this.partitionTemplateIDParam = partitionTemplateIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
