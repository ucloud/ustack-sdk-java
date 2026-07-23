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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class DetectBMCTypeV2Response extends Response {

    /** BMC信息 */
    @SerializedName("BMCInfo")
    private String bMCInfoParam;

    /** BMC类型名称，识别到的BMC类型标识，检测失败时可能为空字符串 */
    @SerializedName("BMCTypeName")
    private String bMCTypeNameParam;

    /** 生产厂商，从BMC/IPMI FRU信息采集 */
    @SerializedName("Manufacturer")
    private String manufacturerParam;

    /** 产品名称，从BMC/IPMI FRU信息采集 */
    @SerializedName("ProductName")
    private String productNameParam;

    /** 序列号，从硬件获取的物理机唯一序列号 */
    @SerializedName("SerialNumber")
    private String serialNumberParam;

    /** 检测是否成功，true表示成功识别BMC类型，false表示检测失败 */
    @SerializedName("Success")
    private Boolean successParam;


    public String getBMCInfo() {
        return bMCInfoParam;
    }

    public void setBMCInfo(String bMCInfoParam) {
        this.bMCInfoParam = bMCInfoParam;
    }

    public String getBMCTypeName() {
        return bMCTypeNameParam;
    }

    public void setBMCTypeName(String bMCTypeNameParam) {
        this.bMCTypeNameParam = bMCTypeNameParam;
    }

    public String getManufacturer() {
        return manufacturerParam;
    }

    public void setManufacturer(String manufacturerParam) {
        this.manufacturerParam = manufacturerParam;
    }

    public String getProductName() {
        return productNameParam;
    }

    public void setProductName(String productNameParam) {
        this.productNameParam = productNameParam;
    }

    public String getSerialNumber() {
        return serialNumberParam;
    }

    public void setSerialNumber(String serialNumberParam) {
        this.serialNumberParam = serialNumberParam;
    }

    public Boolean getSuccess() {
        return successParam;
    }

    public void setSuccess(Boolean successParam) {
        this.successParam = successParam;
    }

}
