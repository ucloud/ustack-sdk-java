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

public class CreatePlatformStorageDiskRequest extends Request {

    /** 磁盘大小，创建平台通用存储云盘的容量，单位GiB */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 集群类型，目标存储集群的类型标识 */
    @NotEmpty
    @OpenAPIParam("SetType")
    private String setTypeParam;


    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

}
