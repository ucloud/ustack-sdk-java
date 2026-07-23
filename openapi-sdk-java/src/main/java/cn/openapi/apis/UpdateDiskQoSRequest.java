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

public class UpdateDiskQoSRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 硬盘带宽限制，单位MBps，取值范围0-1000，0表示不限制 */
    
    @OpenAPIParam("DiskBandwidth")
    private Integer diskBandwidthParam;

    /** 磁盘ID，要更新QoS配置的磁盘标识 */
    @NotEmpty
    @OpenAPIParam("DiskID")
    private String diskIDParam;

    /** 硬盘IOPS限制，取值范围0-50000，0表示不限制 */
    
    @OpenAPIParam("DiskIOPS")
    private Integer diskIOPSParam;

    /** 硬盘QoS限速读带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("DiskReadBandwidth")
    private Integer diskReadBandwidthParam;

    /** 硬盘QoS限速读IOPS，0表示不限制 */
    
    @OpenAPIParam("DiskReadIOPS")
    private Integer diskReadIOPSParam;

    /** 硬盘QoS限速总带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("DiskTotalBandwidth")
    private Integer diskTotalBandwidthParam;

    /** 硬盘QoS限速总IOPS，0表示不限制 */
    
    @OpenAPIParam("DiskTotalIOPS")
    private Integer diskTotalIOPSParam;

    /** 硬盘QoS限速写带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("DiskWriteBandwidth")
    private Integer diskWriteBandwidthParam;

    /** 硬盘QoS限速写IOPS，0表示不限制 */
    
    @OpenAPIParam("DiskWriteIOPS")
    private Integer diskWriteIOPSParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public Integer getDiskIOPS() {
        return diskIOPSParam;
    }

    public void setDiskIOPS(Integer diskIOPSParam) {
        this.diskIOPSParam = diskIOPSParam;
    }

    public Integer getDiskReadBandwidth() {
        return diskReadBandwidthParam;
    }

    public void setDiskReadBandwidth(Integer diskReadBandwidthParam) {
        this.diskReadBandwidthParam = diskReadBandwidthParam;
    }

    public Integer getDiskReadIOPS() {
        return diskReadIOPSParam;
    }

    public void setDiskReadIOPS(Integer diskReadIOPSParam) {
        this.diskReadIOPSParam = diskReadIOPSParam;
    }

    public Integer getDiskTotalBandwidth() {
        return diskTotalBandwidthParam;
    }

    public void setDiskTotalBandwidth(Integer diskTotalBandwidthParam) {
        this.diskTotalBandwidthParam = diskTotalBandwidthParam;
    }

    public Integer getDiskTotalIOPS() {
        return diskTotalIOPSParam;
    }

    public void setDiskTotalIOPS(Integer diskTotalIOPSParam) {
        this.diskTotalIOPSParam = diskTotalIOPSParam;
    }

    public Integer getDiskWriteBandwidth() {
        return diskWriteBandwidthParam;
    }

    public void setDiskWriteBandwidth(Integer diskWriteBandwidthParam) {
        this.diskWriteBandwidthParam = diskWriteBandwidthParam;
    }

    public Integer getDiskWriteIOPS() {
        return diskWriteIOPSParam;
    }

    public void setDiskWriteIOPS(Integer diskWriteIOPSParam) {
        this.diskWriteIOPSParam = diskWriteIOPSParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
