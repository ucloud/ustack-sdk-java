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

public class UsedSGIDInfo {

    /** 安全组ID，引用IP组或端口组的安全组唯一标识符 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称，引用IP组或端口组的安全组显示名称 */
    @SerializedName("SGName")
    private String sGNameParam;


    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

}
