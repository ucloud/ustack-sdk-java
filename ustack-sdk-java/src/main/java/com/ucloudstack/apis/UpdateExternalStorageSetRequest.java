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

public class UpdateExternalStorageSetRequest extends Request {

    /** IQN新增列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("AddTargetIQNs")
    private List<String> addTargetIQNsParam;

    /** 租户ID，存储集群所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** IQN禁用列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("DisableTargetIQNs")
    private List<String> disableTargetIQNsParam;

    /** IQN启用列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("EnableTargetIQNs")
    private List<String> enableTargetIQNsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** IQN移除列表，符合iqn.YYYY-MM.domain[:suffix]格式的IQN列表 */
    
    @OpenAPIParam("RemoveTargetIQNs")
    private List<String> removeTargetIQNsParam;

    /** 存储集群ID，待更新的外置存储集群ID */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;


    public List<String> getAddTargetIQNs() {
        return addTargetIQNsParam;
    }

    public void setAddTargetIQNs(List<String> addTargetIQNsParam) {
        this.addTargetIQNsParam = addTargetIQNsParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDisableTargetIQNs() {
        return disableTargetIQNsParam;
    }

    public void setDisableTargetIQNs(List<String> disableTargetIQNsParam) {
        this.disableTargetIQNsParam = disableTargetIQNsParam;
    }

    public List<String> getEnableTargetIQNs() {
        return enableTargetIQNsParam;
    }

    public void setEnableTargetIQNs(List<String> enableTargetIQNsParam) {
        this.enableTargetIQNsParam = enableTargetIQNsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getRemoveTargetIQNs() {
        return removeTargetIQNsParam;
    }

    public void setRemoveTargetIQNs(List<String> removeTargetIQNsParam) {
        this.removeTargetIQNsParam = removeTargetIQNsParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

}
