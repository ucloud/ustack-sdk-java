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

public class BindStorageToDBSRequest extends Request {

    /** 外部服务访问密钥，当StorageType为S3时必填 */
    
    @OpenAPIParam("AccessKey")
    private String accessKeyParam;

    /** 外部服务存储桶名称，当StorageType为S3时可选，空值默认dbs */
    
    @OpenAPIParam("BucketName")
    private String bucketNameParam;

    /** 租户ID，备份存储池所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 外部服务地址，当StorageType为S3时必填 */
    
    @OpenAPIParam("Endpoint")
    private String endpointParam;

    /** 名称，备份存储池名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 对象存储ID，当StorageType为OSS时必填 */
    
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 地域ID，备份存储池所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，备份存储池描述信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 外部服务私钥，当StorageType为S3时必填 */
    
    @OpenAPIParam("SecretKey")
    private String secretKeyParam;

    /** 存储类型，取值OSS或S3 */
    @NotEmpty
    @OpenAPIParam("StorageType")
    private String storageTypeParam;


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

    public String getSecretKey() {
        return secretKeyParam;
    }

    public void setSecretKey(String secretKeyParam) {
        this.secretKeyParam = secretKeyParam;
    }

    public String getStorageType() {
        return storageTypeParam;
    }

    public void setStorageType(String storageTypeParam) {
        this.storageTypeParam = storageTypeParam;
    }

}
