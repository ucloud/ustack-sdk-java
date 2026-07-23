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

public class UpdateVMSetBoundStorageSetRequest extends Request {

    /** 地域ID，指定计算集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要绑定存储集群的计算集群唯一标识 */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;

    /** 存储集群ID列表，指定要绑定到该计算集群的存储集群ID列表，必须从该计算集群的物理绑定存储列表（StorageClassList）中选择，用于限制虚拟机可使用的存储资源，支持RBD、CJFS、Ustorbs、UDisk、QoL等存储Provider类型 */
    @NotEmpty
    @OpenAPIParam("StorageSetIDs")
    private List<String> storageSetIDsParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public List<String> getStorageSetIDs() {
        return storageSetIDsParam;
    }

    public void setStorageSetIDs(List<String> storageSetIDsParam) {
        this.storageSetIDsParam = storageSetIDsParam;
    }

}
