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

public class UpdatePaaSDiskQoSRequest extends Request {

    /** 租户唯一标识ID，保留字段，当前不会作为后端校验条件 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘带宽（MB/s），0表示不限速，其他值会写入资源注解AK_BandWidth并将状态置为UpdatingQoS */
    
    @OpenAPIParam("DiskBandwidth")
    private Integer diskBandwidthParam;

    /** 磁盘IOPS，0表示不限速，其他值会写入资源注解AK_IOPS并将状态置为UpdatingQoS */
    
    @OpenAPIParam("DiskIOPS")
    private Integer diskIOPSParam;

    /** 地域ID，保留字段；资源所属地域由ResourceID决定，但仍需按标准传入 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，指定要设置磁盘QoS的PaaS资源，仅支持FS/OSS/MYSQL类型，其余类型会返回错误 */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getDiskBandwidth() {
        return diskBandwidthParam;
    }

    public void setDiskBandwidth(Integer diskBandwidthParam) {
        this.diskBandwidthParam = diskBandwidthParam;
    }

    public Integer getDiskIOPS() {
        return diskIOPSParam;
    }

    public void setDiskIOPS(Integer diskIOPSParam) {
        this.diskIOPSParam = diskIOPSParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
