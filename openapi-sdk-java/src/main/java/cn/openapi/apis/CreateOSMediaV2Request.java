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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateOSMediaV2Request extends Request {

    /** 租户ID，用于在Taishan侧记录系统镜像归属，需与调用者所属租户一致以便后续权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像ID，Kunlun侧已有的基础镜像，创建系统镜像时会引用该镜像文件 */
    @NotEmpty
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 系统镜像名称，长度1-128个字符，仅支持中英文、数字、点（.）、下划线（_）、中划线（-），用于Kunlun与云管展示 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 操作系统发行版（如：CentOS、OpenEuler），用于区分不同系列的ISO镜像，可为空 */
    
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统完整名称（如：CentOS 7.4 x86_64），用于界面展示和后续筛选，可为空 */
    
    @OpenAPIParam("OSName")
    private String oSNameParam;

    /** 项目组ID，镜像所属项目，便于资源隔离和计费，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定系统镜像所属地域，系统会在该地域的Kunlun集群创建镜像并写入Taishan资源记录 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，0-100个中英文字符，禁止包含http://或https://，用于补充镜像用途说明 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value并以Base64编码传输 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 系统镜像类型，仅支持ISO，表示使用ISO安装介质 */
    @NotEmpty
    @OpenAPIParam("Type")
    private String typeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
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

    public String getOSName() {
        return oSNameParam;
    }

    public void setOSName(String oSNameParam) {
        this.oSNameParam = oSNameParam;
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

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

}
