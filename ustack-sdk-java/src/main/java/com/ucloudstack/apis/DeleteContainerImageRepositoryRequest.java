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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DeleteContainerImageRepositoryRequest extends Request {

    /** 租户ID，资源所属租户 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 镜像仓库ID，待删除的镜像仓库ID */
    @NotEmpty
    @UCloudStackParam("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** 是否删除仓库内所有镜像，为true时强制删除仓库及其下所有镜像，为false时仅当仓库为空才允许删除 */
    
    @UCloudStackParam("DeleteAllImages")
    private Boolean deleteAllImagesParam;

    /** 地域，镜像仓库所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
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

    public Boolean getDeleteAllImages() {
        return deleteAllImagesParam;
    }

    public void setDeleteAllImages(Boolean deleteAllImagesParam) {
        this.deleteAllImagesParam = deleteAllImagesParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
