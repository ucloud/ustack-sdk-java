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

public class DescribeMemberRequest extends Request {

    /** 租户ID，用于限定查询的租户范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 账号邮箱，用于按邮箱筛选账号 */
    
    @UCloudStackParam("Email")
    private String emailParam;

    /** 关键词，用于按名称或邮箱模糊检索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，控制单次返回数量 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 成员ID列表，筛选指定账号的查询条件，为空则不过滤 */
    
    @UCloudStackParam("MemberIDs")
    private List<Integer> memberIDsParam;

    /** 账号公钥，用于按公钥筛选账号 */
    
    @UCloudStackParam("MemberPubKey")
    private String memberPubKeyParam;

    /** 分页偏移量，用于分页起点 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public List<Integer> getMemberIDs() {
        return memberIDsParam;
    }

    public void setMemberIDs(List<Integer> memberIDsParam) {
        this.memberIDsParam = memberIDsParam;
    }

    public String getMemberPubKey() {
        return memberPubKeyParam;
    }

    public void setMemberPubKey(String memberPubKeyParam) {
        this.memberPubKeyParam = memberPubKeyParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

}
