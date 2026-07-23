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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ValidatePartitionConfigResult {

    /** 错误列表 */
    @SerializedName("Errors")
    private List<String> errorsParam;

    /** 消息 */
    @SerializedName("Message")
    private String messageParam;

    /** 是否有效 */
    @SerializedName("Valid")
    private Boolean validParam;

    /** 警告列表 */
    @SerializedName("Warnings")
    private List<String> warningsParam;


    public List<String> getErrors() {
        return errorsParam;
    }

    public void setErrors(List<String> errorsParam) {
        this.errorsParam = errorsParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public Boolean getValid() {
        return validParam;
    }

    public void setValid(Boolean validParam) {
        this.validParam = validParam;
    }

    public List<String> getWarnings() {
        return warningsParam;
    }

    public void setWarnings(List<String> warningsParam) {
        this.warningsParam = warningsParam;
    }

}
