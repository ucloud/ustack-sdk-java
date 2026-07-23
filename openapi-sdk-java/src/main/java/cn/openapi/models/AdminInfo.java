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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class AdminInfo {

    /** 创建时间，管理员账号创建的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 授权等级，标识管理员授权层级，取值：System（系统级）、Region（区域级） */
    @SerializedName("GrantLevel")
    private String grantLevelParam;

    /** 账号邮箱，管理员登录邮箱 */
    @SerializedName("MemberEmail")
    private String memberEmailParam;

    /** 管理员ID，管理员账号唯一标识 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 成员名称，管理员展示名称 */
    @SerializedName("MemberName")
    private String memberNameParam;

    /** 手机号，用于安全通知或验证码接收 */
    @SerializedName("Phone")
    private String phoneParam;

    /** 权限级别，标识管理员在系统内的权限层级，取值：Admin、RegionAdmin、SystemAdmin */
    @SerializedName("Privilege")
    private String privilegeParam;

    /** 是否只读，标识管理员是否仅有查看权限 */
    @SerializedName("ReadOnly")
    private Boolean readOnlyParam;

    /** 账号状态，标识管理员账号可用性，取值：Available（可用）、Freeze（冻结）、Locked（锁定）、Deleted（已删除） */
    @SerializedName("Status")
    private String statusParam;

    /** 更新时间，管理员账号信息更新的Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getGrantLevel() {
        return grantLevelParam;
    }

    public void setGrantLevel(String grantLevelParam) {
        this.grantLevelParam = grantLevelParam;
    }

    public String getMemberEmail() {
        return memberEmailParam;
    }

    public void setMemberEmail(String memberEmailParam) {
        this.memberEmailParam = memberEmailParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getMemberName() {
        return memberNameParam;
    }

    public void setMemberName(String memberNameParam) {
        this.memberNameParam = memberNameParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public String getPrivilege() {
        return privilegeParam;
    }

    public void setPrivilege(String privilegeParam) {
        this.privilegeParam = privilegeParam;
    }

    public Boolean getReadOnly() {
        return readOnlyParam;
    }

    public void setReadOnly(Boolean readOnlyParam) {
        this.readOnlyParam = readOnlyParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
