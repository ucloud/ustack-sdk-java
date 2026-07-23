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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeContainerImageResponse extends Response {

    /** 仓库地址，仓库外网地址 */
    @SerializedName("ContainerImageRepositoryAddress")
    private String containerImageRepositoryAddressParam;

    /** 仓库内网地址，仓库内网地址 */
    @SerializedName("ContainerImageRepositoryInternalAddress")
    private String containerImageRepositoryInternalAddressParam;

    /** 详情，镜像信息列表 */
    @SerializedName("Infos")
    private List<ContainerImageInfo> infosParam;

    /** 总数，查询到的镜像总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public String getContainerImageRepositoryAddress() {
        return containerImageRepositoryAddressParam;
    }

    public void setContainerImageRepositoryAddress(String containerImageRepositoryAddressParam) {
        this.containerImageRepositoryAddressParam = containerImageRepositoryAddressParam;
    }

    public String getContainerImageRepositoryInternalAddress() {
        return containerImageRepositoryInternalAddressParam;
    }

    public void setContainerImageRepositoryInternalAddress(String containerImageRepositoryInternalAddressParam) {
        this.containerImageRepositoryInternalAddressParam = containerImageRepositoryInternalAddressParam;
    }

    public List<ContainerImageInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<ContainerImageInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
