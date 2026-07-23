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

public class TagInfo {

    /** 租户邮箱地址，用于联系和通知的邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，标识标签所属的租户账户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，标签所属租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 标签键名，用于标识标签的名称 */
    @SerializedName("Key")
    private String keyParam;

    /** 资源数量，使用该标签的资源总数 */
    @SerializedName("ResourceCount")
    private Integer resourceCountParam;

    /** 标签值，与键名配对使用的标签值 */
    @SerializedName("Value")
    private String valueParam;


    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public Integer getResourceCount() {
        return resourceCountParam;
    }

    public void setResourceCount(Integer resourceCountParam) {
        this.resourceCountParam = resourceCountParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
