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

public class SetTypeInfo {

    /** 权限控制，该计算集群类型的访问权限，值为all表示所有租户可用，或以逗号分隔的租户ID列表 */
    @SerializedName("Permission")
    private String permissionParam;

    /** 地域ID，计算集群类型所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 计算集群架构，计算集群的硬件架构类型 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 计算集群类型名称，计算集群的类型标识 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** 计算集群类型别名，计算集群类型的自定义名称 */
    @SerializedName("VMTypeAlias")
    private String vMTypeAliasParam;


    public String getPermission() {
        return permissionParam;
    }

    public void setPermission(String permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

    public String getVMTypeAlias() {
        return vMTypeAliasParam;
    }

    public void setVMTypeAlias(String vMTypeAliasParam) {
        this.vMTypeAliasParam = vMTypeAliasParam;
    }

}
