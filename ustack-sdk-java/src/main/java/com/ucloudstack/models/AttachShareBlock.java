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

public class AttachShareBlock {

    /** 已挂载资源ID，挂载目标资源标识 */
    @SerializedName("AttachResourceID")
    private String attachResourceIDParam;

    /** 已挂载资源名称，挂载目标资源名称 */
    @SerializedName("AttachResourceName")
    private String attachResourceNameParam;

    /** 已挂载资源类型，挂载目标资源类型 */
    @SerializedName("AttachResourceType")
    private String attachResourceTypeParam;

    /** 挂载状态，共享盘挂载状态 */
    @SerializedName("AttachStatus")
    private String attachStatusParam;


    public String getAttachResourceID() {
        return attachResourceIDParam;
    }

    public void setAttachResourceID(String attachResourceIDParam) {
        this.attachResourceIDParam = attachResourceIDParam;
    }

    public String getAttachResourceName() {
        return attachResourceNameParam;
    }

    public void setAttachResourceName(String attachResourceNameParam) {
        this.attachResourceNameParam = attachResourceNameParam;
    }

    public String getAttachResourceType() {
        return attachResourceTypeParam;
    }

    public void setAttachResourceType(String attachResourceTypeParam) {
        this.attachResourceTypeParam = attachResourceTypeParam;
    }

    public String getAttachStatus() {
        return attachStatusParam;
    }

    public void setAttachStatus(String attachStatusParam) {
        this.attachStatusParam = attachStatusParam;
    }

}
