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

public class UpgradeOSSRequest extends Request {

    /** CPU核数，扩容后的CPU核数需大于或等于当前值，取值范围：2、4、6、8、10、12、14、16 */
    
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 存储容量，单位GiB，扩容后容量需大于或等于当前容量，最小值100 */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 对象存储ID，要扩容的对象存储标识，对象存储状态必须为Running或Stopped */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
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

}
