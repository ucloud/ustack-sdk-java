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

public class ImportImageRequest extends Request {

    /** 引导类型，取值bios、uefi，未指定时默认bios */
    
    @OpenAPIParam("BootloaderType")
    private String bootloaderTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像描述，用于补充说明，需符合uremark规则（0-100字符，禁止包含<script>/javascript） */
    
    @OpenAPIParam("ImageDescription")
    private String imageDescriptionParam;

    /** 镜像格式，指定导入的虚拟化文件格式，取值qcow2、iso、vmdk、raw */
    @NotEmpty
    @OpenAPIParam("ImageFormat")
    private String imageFormatParam;

    /** 镜像名称，用于标识导入的镜像资源 */
    @NotEmpty
    @OpenAPIParam("ImageName")
    private String imageNameParam;

    /** 镜像大小，单位GiB，最大不超过2000，Remote模式下由系统根据URL探测 */
    
    @OpenAPIParam("ImageSize")
    private Integer imageSizeParam;

    /** 上传类型，Remote表示远程URL，Local表示本地分片上传 */
    @NotEmpty
    @OpenAPIParam("ImportType")
    private String importTypeParam;

    /** 来源URL，仅在远程模式下有效，当ImportType为Remote时必填，用于拉取镜像文件 */
    
    @OpenAPIParam("LoadURL")
    private String loadURLParam;

    /** 操作系统发行版，如Ubuntu、CentOS */
    @NotEmpty
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统类型，如Linux、Windows */
    @NotEmpty
    @OpenAPIParam("OSType")
    private String oSTypeParam;

    /** 操作系统版本，指定镜像内部安装的具体发行版本号 */
    
    @OpenAPIParam("OSVersion")
    private String oSVersionParam;

    /** 项目ID，资源所属的项目分组标识 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 镜像密钥，用于镜像在存储层的解密与使用 */
    
    @OpenAPIParam("Secret")
    private String secretParam;

    /** 架构类型，基于计算集群支持的指令集，如x86_64、aarch64 */
    
    @OpenAPIParam("SetArch")
    private String setArchParam;

    /** Cloud-Init支持，标识镜像是否支持自动化初始化配置 */
    
    @OpenAPIParam("SupportCloudInit")
    private Boolean supportCloudInitParam;

    /** QEMU Guest Agent支持，标识镜像内是否预装QGA组件 */
    
    @OpenAPIParam("SupportQGA")
    private Boolean supportQGAParam;

    /** 标签键值对，用于资源标签管理与检索，格式为Base64的key:value，列表项不能为空且key不可重复 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getImageDescription() {
        return imageDescriptionParam;
    }

    public void setImageDescription(String imageDescriptionParam) {
        this.imageDescriptionParam = imageDescriptionParam;
    }

    public String getImageFormat() {
        return imageFormatParam;
    }

    public void setImageFormat(String imageFormatParam) {
        this.imageFormatParam = imageFormatParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
    }

    public Integer getImageSize() {
        return imageSizeParam;
    }

    public void setImageSize(Integer imageSizeParam) {
        this.imageSizeParam = imageSizeParam;
    }

    public String getImportType() {
        return importTypeParam;
    }

    public void setImportType(String importTypeParam) {
        this.importTypeParam = importTypeParam;
    }

    public String getLoadURL() {
        return loadURLParam;
    }

    public void setLoadURL(String loadURLParam) {
        this.loadURLParam = loadURLParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public String getOSVersion() {
        return oSVersionParam;
    }

    public void setOSVersion(String oSVersionParam) {
        this.oSVersionParam = oSVersionParam;
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

    public String getSecret() {
        return secretParam;
    }

    public void setSecret(String secretParam) {
        this.secretParam = secretParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public Boolean getSupportCloudInit() {
        return supportCloudInitParam;
    }

    public void setSupportCloudInit(Boolean supportCloudInitParam) {
        this.supportCloudInitParam = supportCloudInitParam;
    }

    public Boolean getSupportQGA() {
        return supportQGAParam;
    }

    public void setSupportQGA(Boolean supportQGAParam) {
        this.supportQGAParam = supportQGAParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
