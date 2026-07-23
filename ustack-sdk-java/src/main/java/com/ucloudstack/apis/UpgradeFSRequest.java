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

public class UpgradeFSRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 存储容量，单位GiB，扩容后的容量必须大于当前容量，最小值100 */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 文件存储实例ID，要扩容的文件存储标识，文件存储状态必须为Running或Stopped */
    @NotEmpty
    @OpenAPIParam("FSID")
    private String fSIDParam;

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

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getFSID() {
        return fSIDParam;
    }

    public void setFSID(String fSIDParam) {
        this.fSIDParam = fSIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
