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

public class UpdateVMSetBoundImageRequest extends Request {

    /** 镜像ID列表，指定要绑定到该计算集群的镜像ID，支持两种格式：1）特殊值all表示绑定所有镜像；2）以逗号分隔的多个镜像ID（不支持空字符串），通过UpdateVMSetBoundImage接口实现镜像绑定限制 */
    @NotEmpty
    @OpenAPIParam("ImageIDs")
    private String imageIDsParam;

    /** 地域ID，指定计算集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要绑定镜像的计算集群唯一标识 */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;


    public String getImageIDs() {
        return imageIDsParam;
    }

    public void setImageIDs(String imageIDsParam) {
        this.imageIDsParam = imageIDsParam;
    }

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

}
