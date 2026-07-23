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

public class CreateMulticastGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 接收方虚拟机ID列表，1-9个，所有虚拟机必须与VPCID匹配、不得包含发送方，且在同一VPC中IP+Port相同的组播组里不得重复，否则分别返回StatusMulticastGroupMemberVPCMismatch或StatusMulticastGroupMemberDuplicate；超过9个返回StatusMulticastGroupDestLimit */
    @NotEmpty
    @UCloudStackParam("MulticastDest")
    private List<String> multicastDestParam;

    /** 组播组IP地址，必须为IPv4并落在224.0.0.0/4网段，用作组播通信的目标地址，超出网段会被拒绝 */
    @NotEmpty
    @UCloudStackParam("MulticastIP")
    private String multicastIPParam;

    /** 组播组端口号，用于组播数据传输的目标端口，取值范围：0-65535 */
    @NotEmpty
    @UCloudStackParam("MulticastPort")
    private Integer multicastPortParam;

    /** 发送方虚拟机ID，组播数据的唯一源，必须与VPCID位于同一VPC且不得出现在接收方列表；同一VPC中若已存在IP+Port+Source完全一致的组播组将返回StatusMulticastGroupSourceRuleDuplicate */
    @NotEmpty
    @UCloudStackParam("MulticastSource")
    private String multicastSourceParam;

    /** 组播组名称，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目ID，用于实现资源的逻辑分组管理，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符，可为空 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 标签键值对，用于资源标记和分类管理，格式为 key:value 的字符串，传入​​ Base64 编码的字符串 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VPC ID，虚拟私有网络的唯一标识符，组播组只能在该VPC内部消费；同一VPC当前最多拥有9个组播组，达到上限会返回StatusMulticastGroupLimit错误 */
    @NotEmpty
    @UCloudStackParam("VPCID")
    private String vPCIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getMulticastDest() {
        return multicastDestParam;
    }

    public void setMulticastDest(List<String> multicastDestParam) {
        this.multicastDestParam = multicastDestParam;
    }

    public String getMulticastIP() {
        return multicastIPParam;
    }

    public void setMulticastIP(String multicastIPParam) {
        this.multicastIPParam = multicastIPParam;
    }

    public Integer getMulticastPort() {
        return multicastPortParam;
    }

    public void setMulticastPort(Integer multicastPortParam) {
        this.multicastPortParam = multicastPortParam;
    }

    public String getMulticastSource() {
        return multicastSourceParam;
    }

    public void setMulticastSource(String multicastSourceParam) {
        this.multicastSourceParam = multicastSourceParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
