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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CloneBMCTypeRequest extends Request {

    /** 源BMC类型名称，需为已有的BMC类型名称（可通过ListBMCTypes/GetBMCType获取），克隆时会复制其登录脚本和校验步骤 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 新BMC类型名称，为克隆后生成的BMC类型唯一标识，需保证未被占用 */
    @NotEmpty
    @OpenAPIParam("NewName")
    private String newNameParam;

    /** 地域ID，指定要操作的Kunlun集群地域，确保在对应地域克隆BMC类型 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNewName() {
        return newNameParam;
    }

    public void setNewName(String newNameParam) {
        this.newNameParam = newNameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
