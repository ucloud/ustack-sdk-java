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

public class DescribeNodeRequest extends Request {

    /** 节点ID列表，用于精确筛选指定节点 */
    
    @UCloudStackParam("HostIDs")
    private List<String> hostIDsParam;

    /** 关键词，用于模糊匹配节点名或IP地址 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 节点类型，用于筛选指定类型的节点 */
    
    @UCloudStackParam("NodeType")
    private String nodeTypeParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 地域ID，用于筛选节点所属地域；为空时查询所有地域 */
    
    @UCloudStackParam("Region")
    private String regionParam;

    /** 计算集群ID，用于筛选指定集群下的节点 */
    
    @UCloudStackParam("SetID")
    private String setIDParam;

    /** 排序方向，取值Ascending或Descending */
    
    @UCloudStackParam("Sort")
    private String sortParam;

    /** 排序字段，目前仅支持NodeIP */
    
    @UCloudStackParam("SortBy")
    private String sortByParam;


    public List<String> getHostIDs() {
        return hostIDsParam;
    }

    public void setHostIDs(List<String> hostIDsParam) {
        this.hostIDsParam = hostIDsParam;
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

    public String getNodeType() {
        return nodeTypeParam;
    }

    public void setNodeType(String nodeTypeParam) {
        this.nodeTypeParam = nodeTypeParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSort() {
        return sortParam;
    }

    public void setSort(String sortParam) {
        this.sortParam = sortParam;
    }

    public String getSortBy() {
        return sortByParam;
    }

    public void setSortBy(String sortByParam) {
        this.sortByParam = sortByParam;
    }

}
