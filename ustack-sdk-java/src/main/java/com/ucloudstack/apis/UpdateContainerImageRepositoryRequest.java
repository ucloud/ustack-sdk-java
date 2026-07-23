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

public class UpdateContainerImageRepositoryRequest extends Request {

    /** 租户ID，资源所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像仓库ID，待更新的镜像仓库ID */
    @NotEmpty
    @OpenAPIParam("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** 是否为公有仓库，true 时为仓库追加公有标记并同步 Registry 以允许所有租户拉取镜像，false 时移除公有标记恢复为私有 */
    
    @OpenAPIParam("Public")
    private Boolean publicParam;

    /** 地域，镜像仓库所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getContainerImageRepositoryID() {
        return containerImageRepositoryIDParam;
    }

    public void setContainerImageRepositoryID(String containerImageRepositoryIDParam) {
        this.containerImageRepositoryIDParam = containerImageRepositoryIDParam;
    }

    public Boolean getPublic() {
        return publicParam;
    }

    public void setPublic(Boolean publicParam) {
        this.publicParam = publicParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
