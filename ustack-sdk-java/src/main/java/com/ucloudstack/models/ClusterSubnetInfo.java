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

public class ClusterSubnetInfo {

    /** 子网Id */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;


    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getSubnetName() {
        return subnetNameParam;
    }

    public void setSubnetName(String subnetNameParam) {
        this.subnetNameParam = subnetNameParam;
    }

}
