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

public class DeleteTagRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 标签键名，指定要删除的标签键，删除前会检查是否有资源绑定该标签，如有绑定则返回StatusTagHasBoundResource错误 */
    @NotEmpty
    @OpenAPIParam("Key")
    private String keyParam;

    /** 标签值列表，指定要删除的标签值，若为空则删除整个标签键及其所有值，删除时会检查该标签值是否还有资源绑定（通过uerrors.Error_TagHasBoundResource），若有绑定则无法删除并返回StatusTagHasBoundResource错误，可以批量删除多个值 */
    @NotEmpty
    @OpenAPIParam("Values")
    private List<String> valuesParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public List<String> getValues() {
        return valuesParam;
    }

    public void setValues(List<String> valuesParam) {
        this.valuesParam = valuesParam;
    }

}
