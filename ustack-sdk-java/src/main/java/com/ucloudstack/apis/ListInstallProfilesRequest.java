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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class ListInstallProfilesRequest extends Request {

    /** 模板ID列表过滤 */
    
    @UCloudStackParam("IDs")
    private List<String> iDsParam;

    /** 关键词搜索，按模板名称进行模糊匹配 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 每页数量，指定每页返回记录数，默认20，最大100 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 偏移量，指定跳过记录数，最小值为0 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public List<String> getIDs() {
        return iDsParam;
    }

    public void setIDs(List<String> iDsParam) {
        this.iDsParam = iDsParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
