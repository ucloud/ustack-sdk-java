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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateProductSpecificationRequest extends Request {

    /** 地域ID，指定规格所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 规格ID，要更新的产品规格唯一标识符 */
    @NotEmpty
    @OpenAPIParam("SpecificationID")
    private String specificationIDParam;

    /** 规格值，要设置的新规格值，需符合规格模板定义的格式要求 */
    @NotEmpty
    @OpenAPIParam("Value")
    private String valueParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSpecificationID() {
        return specificationIDParam;
    }

    public void setSpecificationID(String specificationIDParam) {
        this.specificationIDParam = specificationIDParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
