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

public class DescribeFSFileRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 文件存储实例ID，要查询的文件存储标识 */
    @NotEmpty
    @OpenAPIParam("FSID")
    private String fSIDParam;

    /** 文件路径，要查询的目录或文件的绝对路径 */
    @NotEmpty
    @OpenAPIParam("FilePath")
    private String filePathParam;

    /** 分页大小，指定每页返回的记录数，为0时默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 是否显示隐藏文件，true表示显示隐藏文件 */
    
    @OpenAPIParam("ShowHidden")
    private Boolean showHiddenParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFSID() {
        return fSIDParam;
    }

    public void setFSID(String fSIDParam) {
        this.fSIDParam = fSIDParam;
    }

    public String getFilePath() {
        return filePathParam;
    }

    public void setFilePath(String filePathParam) {
        this.filePathParam = filePathParam;
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

    public Boolean getShowHidden() {
        return showHiddenParam;
    }

    public void setShowHidden(Boolean showHiddenParam) {
        this.showHiddenParam = showHiddenParam;
    }

}
