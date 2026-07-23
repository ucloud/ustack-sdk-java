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

public class SetAccountQuotaRequest extends Request {

    /** 集群配额分配JSON字符串，指定计算或存储集群的配额分配，若不指定则默认为空对象{}，格式如{"cluster-1":50,"cluster-2":50} */
    
    @UCloudStackParam("Allocation")
    private String allocationParam;

    /** 租户ID，指定要设置配额的租户，用于多租户环境下的配额管理，0表示设置默认配额 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 配额因子，指定配额计量维度，取值范围：FACTOR_AMOUNT（资源个数）、FACTOR_CPU（vCPU核数）、FACTOR_MEMORY（内存GB）、FACTOR_DISK（磁盘容量GB）、FACTOR_EIP（公网带宽Mbps）、FACTOR_VGPU（虚拟GPU数）、FACTOR_GPU（GPU卡数） */
    @NotEmpty
    @UCloudStackParam("FactorType")
    private String factorTypeParam;

    /** 配额值，要设置的配额数量，不能小于当前已使用量 */
    @NotEmpty
    @UCloudStackParam("Quota")
    private Integer quotaParam;

    /** 地域ID，指定要设置配额的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源类型，指定配额的资源类型，如VM、DISK、IP等 */
    @NotEmpty
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;


    public String getAllocation() {
        return allocationParam;
    }

    public void setAllocation(String allocationParam) {
        this.allocationParam = allocationParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFactorType() {
        return factorTypeParam;
    }

    public void setFactorType(String factorTypeParam) {
        this.factorTypeParam = factorTypeParam;
    }

    public Integer getQuota() {
        return quotaParam;
    }

    public void setQuota(Integer quotaParam) {
        this.quotaParam = quotaParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
