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

public class DescribeParametersHistoriesRequest extends Request {

    /** 开始时间，Unix秒时间戳，配合结束时间筛选操作日志，必须早于EndTime */
    @NotEmpty
    @UCloudStackParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户唯一标识ID，作为审计日志查询条件之一 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 数据库实例ID，仅支持MySQL/Redis实例，后台会以该ID作为资源ID去审计日志服务中查询 */
    @NotEmpty
    @UCloudStackParam("DatabaseID")
    private String databaseIDParam;

    /** 结束时间，Unix秒时间戳，建议小于当前时间；若早于BeginTime且同时早于当前时间会直接返回参数错误 */
    @NotEmpty
    @UCloudStackParam("EndTime")
    private Integer endTimeParam;

    /** 关键词，仅对参数名称执行不区分大小写的包含匹配，用于在解析出来的参数变更列表中二次过滤 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，解析完全部审计日志后再按Offset+Limit返回结果 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，只影响最终返回的数据窗口 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 产品类型，当前仅支持MySQL或Redis，系统会根据取值限定操作类型（MySQL对应UpdateMySQLConfigParam，Redis对应UpdateRedisConfigParams） */
    @NotEmpty
    @UCloudStackParam("ProductType")
    private String productTypeParam;

    /** 地域ID，指定实例所在地域，后台会据此到对应审计日志库查询操作记录 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDatabaseID() {
        return databaseIDParam;
    }

    public void setDatabaseID(String databaseIDParam) {
        this.databaseIDParam = databaseIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
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

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
