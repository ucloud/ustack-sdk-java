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

public class IP {

    /** IP地址，网卡IP地址 */
    @SerializedName("Address")
    private String addressParam;

    /** 掩码，网卡子网掩码 */
    @SerializedName("Mask")
    private String maskParam;


    public String getAddress() {
        return addressParam;
    }

    public void setAddress(String addressParam) {
        this.addressParam = addressParam;
    }

    public String getMask() {
        return maskParam;
    }

    public void setMask(String maskParam) {
        this.maskParam = maskParam;
    }

}
