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

public class IAMLoginWhitelist {

    /** 租户ID，白名单所属租户标识，用于租户归属展示 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，白名单创建的Unix时间戳，用于审计展示 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 更新时间，白名单最近一次更新的Unix时间戳，用于审计展示 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** IP白名单，允许登录的IP或网段列表；为空表示不限制 */
    @SerializedName("Whitelist")
    private String whitelistParam;

    /** 白名单ID，白名单记录的唯一标识 */
    @SerializedName("WhitelistID")
    private String whitelistIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getWhitelist() {
        return whitelistParam;
    }

    public void setWhitelist(String whitelistParam) {
        this.whitelistParam = whitelistParam;
    }

    public String getWhitelistID() {
        return whitelistIDParam;
    }

    public void setWhitelistID(String whitelistIDParam) {
        this.whitelistIDParam = whitelistIDParam;
    }

}
