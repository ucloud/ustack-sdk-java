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

public class CreatePartitionTemplateRequest extends Request {

    /** 分区配置，JSON格式字符串，包含分区列表、LVM卷组、RAID配置等信息，前端可提交展开后的点式路径字段（如Config.Scheme）或JSON字符串 */
    @NotEmpty
    @OpenAPIParam("Config")
    private String configParam;

    /** 模板描述，说明分区模板的用途和特点 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 模板名称，分区模板的唯一标识名称 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 操作系统发行版，指定该分区模板适用的操作系统类型 */
    @NotEmpty
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 分区方案类型，指定分区管理方式，standard：标准分区；lvm：LVM逻辑卷；raid：RAID阵列；btrfs：Btrfs文件系统 */
    @NotEmpty
    @OpenAPIParam("SchemeType")
    private String schemeTypeParam;


    public String getConfig() {
        return configParam;
    }

    public void setConfig(String configParam) {
        this.configParam = configParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSchemeType() {
        return schemeTypeParam;
    }

    public void setSchemeType(String schemeTypeParam) {
        this.schemeTypeParam = schemeTypeParam;
    }

}
