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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateInstallProfileRequest extends Request {

    /** 租户ID，预留字段，当前不生效 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 模板描述，可选，若不传则不更新 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 镜像ID，可选，若不传则不更新 */
    
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 镜像名称，可选，若不传则不更新 */
    
    @OpenAPIParam("ImageName")
    private String imageNameParam;

    /** 镜像操作系统发行版，可选，若不传则不更新 */
    
    @OpenAPIParam("ImageOSDistribution")
    private String imageOSDistributionParam;

    /** 镜像操作系统名称，可选，若不传则不更新 */
    
    @OpenAPIParam("ImageOSName")
    private String imageOSNameParam;

    /** Kickstart模板ID，可选，若不传则不更新 */
    
    @OpenAPIParam("KickstartTemplateID")
    private String kickstartTemplateIDParam;

    /** 模板名称，可选，若不传则不更新 */
    
    @OpenAPIParam("Name")
    private String nameParam;

    /** 系统镜像ID，可选，若不传则不更新 */
    
    @OpenAPIParam("OSMediaID")
    private String oSMediaIDParam;

    /** 分区模板ID，可选，若不传则不更新 */
    
    @OpenAPIParam("PartitionTemplateID")
    private String partitionTemplateIDParam;

    /** 模板ID，指定要更新的模板 */
    @NotEmpty
    @OpenAPIParam("ProfileID")
    private String profileIDParam;

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

    public String getProfileID() {
        return profileIDParam;
    }

    public void setProfileID(String profileIDParam) {
        this.profileIDParam = profileIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
