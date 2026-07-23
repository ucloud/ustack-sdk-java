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

public class ASInstanceInfo {

    /** 成员创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 伸缩成员ID，虚拟机ID或RS节点ID */
    @SerializedName("ID")
    private String iDParam;

    /** IP信息列表，伸缩成员的网络地址信息 */
    @SerializedName("IPInfos")
    private List<ASInstanceIPInfo> iPInfosParam;

    /** 伸缩成员名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 成员来源，AsGroup表示伸缩组自动创建，Company表示租户手动添加 */
    @SerializedName("Origin")
    private String originParam;

    /** RS状态，当伸缩组类型为VS时有值，显示后端服务节点的状态 */
    @SerializedName("RSState")
    private String rSStateParam;

    /** 虚拟机模板ID，当成员由伸缩组自动创建时有值，手动添加的成员此字段为空 */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 虚拟机模板名称，当TemplateID有值时显示对应的模板名称 */
    @SerializedName("TemplateName")
    private String templateNameParam;

    /** 虚拟机状态，当伸缩组类型为VM时有值，显示虚拟机的运行状态（如Running、Stopped） */
    @SerializedName("VMState")
    private String vMStateParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public List<ASInstanceIPInfo> getIPInfos() {
        return iPInfosParam;
    }

    public void setIPInfos(List<ASInstanceIPInfo> iPInfosParam) {
        this.iPInfosParam = iPInfosParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOrigin() {
        return originParam;
    }

    public void setOrigin(String originParam) {
        this.originParam = originParam;
    }

    public String getRSState() {
        return rSStateParam;
    }

    public void setRSState(String rSStateParam) {
        this.rSStateParam = rSStateParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateName() {
        return templateNameParam;
    }

    public void setTemplateName(String templateNameParam) {
        this.templateNameParam = templateNameParam;
    }

    public String getVMState() {
        return vMStateParam;
    }

    public void setVMState(String vMStateParam) {
        this.vMStateParam = vMStateParam;
    }

}
