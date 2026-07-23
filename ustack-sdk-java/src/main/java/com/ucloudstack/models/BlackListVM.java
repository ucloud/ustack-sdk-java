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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class BlackListVM {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 虚拟机名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 黑名单备注信息，原始Base64内容会在接口层解码展示 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 规则类型，Manual表示手工迁移保护，Ignore表示忽略DRS迁移 */
    @SerializedName("Type")
    private String typeParam;

    /** 虚拟机用途分类 */
    @SerializedName("Usage")
    private String usageParam;

    /** 虚拟机ID */
    @SerializedName("VMID")
    private String vMIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public String getUsage() {
        return usageParam;
    }

    public void setUsage(String usageParam) {
        this.usageParam = usageParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
