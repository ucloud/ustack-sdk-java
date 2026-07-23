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

public class DescribeOrderRequest extends Request {

    /** 查询起始时间，订单创建时间的起始时间戳，单位为秒，必须小于结束时间 */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 查询结束时间，订单创建时间的结束时间戳，单位为秒，必须大于起始时间 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，指定每页返回的订单记录数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条记录开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，保留字段，当前接口不会根据项目进行过滤；传空字符串时表示筛选未归属项目组数据 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定订单资源所属的物理区域，传入all或空值表示查询所有地域的订单 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 租户唯一标识ID，用于标识资源所属的租户，实现多租户环境下的资源隔离和权限控制，根据此租户ID查询所有订单 */
    
    @OpenAPIParam("UserAccountID")
    private Integer userAccountIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
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

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getUserAccountID() {
        return userAccountIDParam;
    }

    public void setUserAccountID(Integer userAccountIDParam) {
        this.userAccountIDParam = userAccountIDParam;
    }

}
