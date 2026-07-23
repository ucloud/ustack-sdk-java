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

public class TestBMCTypeResult {

    /** JNLP文件内容 */
    @SerializedName("JNLPContent")
    private String jNLPContentParam;

    /** 消息 */
    @SerializedName("Message")
    private String messageParam;

    /** 步骤结果列表 */
    @SerializedName("StepResults")
    private List<BMCTypeTestStepResult> stepResultsParam;

    /** 测试是否成功 */
    @SerializedName("Success")
    private Boolean successParam;

    /** 总步骤数 */
    @SerializedName("TotalSteps")
    private Integer totalStepsParam;


    public String getJNLPContent() {
        return jNLPContentParam;
    }

    public void setJNLPContent(String jNLPContentParam) {
        this.jNLPContentParam = jNLPContentParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public List<BMCTypeTestStepResult> getStepResults() {
        return stepResultsParam;
    }

    public void setStepResults(List<BMCTypeTestStepResult> stepResultsParam) {
        this.stepResultsParam = stepResultsParam;
    }

    public Boolean getSuccess() {
        return successParam;
    }

    public void setSuccess(Boolean successParam) {
        this.successParam = successParam;
    }

    public Integer getTotalSteps() {
        return totalStepsParam;
    }

    public void setTotalSteps(Integer totalStepsParam) {
        this.totalStepsParam = totalStepsParam;
    }

}
