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

public class DTSPrecheckItem {

    /** 检查结果，标识该检查项是否通过，true表示通过，false表示未通过 */
    @SerializedName("Passed")
    private Boolean passedParam;

    /** 检查项名称，说明该预检查项检查的具体内容 */
    @SerializedName("PreCheckName")
    private String preCheckNameParam;

    /** 失败原因，当Passed为false时说明未通过原因及建议处理方式 */
    @SerializedName("Reason")
    private String reasonParam;


    public Boolean getPassed() {
        return passedParam;
    }

    public void setPassed(Boolean passedParam) {
        this.passedParam = passedParam;
    }

    public String getPreCheckName() {
        return preCheckNameParam;
    }

    public void setPreCheckName(String preCheckNameParam) {
        this.preCheckNameParam = preCheckNameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

}
