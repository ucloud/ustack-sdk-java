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

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateProductSpecificationRequest extends Request {

    /** 地域ID，指定规格所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源类型，指定规格的资源类型 */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;

    /** 集群类型，指定规格所属的集群类型 */
    @NotEmpty
    @OpenAPIParam("SetType")
    private String setTypeParam;

    /** 规格名称，需与规格模板中定义的名称一致 */
    @NotEmpty
    @OpenAPIParam("SpecificationName")
    private String specificationNameParam;

    /** 规格值，需符合规格模板定义的格式要求 */
    @NotEmpty
    @OpenAPIParam("Value")
    private String valueParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getSpecificationName() {
        return specificationNameParam;
    }

    public void setSpecificationName(String specificationNameParam) {
        this.specificationNameParam = specificationNameParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
