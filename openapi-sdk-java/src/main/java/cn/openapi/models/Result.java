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

public class Result {

    /** 检查项名称，检查对象的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 结果描述，检查结果的详细说明 */
    @SerializedName("Present")
    private String presentParam;

    /** 检查结果，检查的状态级别 */
    @SerializedName("Result")
    private String resultParam;

    /** 得分，该检查项的评分 */
    @SerializedName("Score")
    private Integer scoreParam;

    /** 排行榜信息，资源使用量Top排行(如CPU、内存等) */
    @SerializedName("Top")
    private List<TopMap> topParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPresent() {
        return presentParam;
    }

    public void setPresent(String presentParam) {
        this.presentParam = presentParam;
    }

    public String getResult() {
        return resultParam;
    }

    public void setResult(String resultParam) {
        this.resultParam = resultParam;
    }

    public Integer getScore() {
        return scoreParam;
    }

    public void setScore(Integer scoreParam) {
        this.scoreParam = scoreParam;
    }

    public List<TopMap> getTop() {
        return topParam;
    }

    public void setTop(List<TopMap> topParam) {
        this.topParam = topParam;
    }

}
