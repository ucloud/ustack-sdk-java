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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class DOSToken {

    /** 公钥，用于S3访问认证 */
    @SerializedName("AccessKey")
    private String accessKeyParam;

    /** 授权的桶，允许访问的桶列表 */
    @SerializedName("AllowBuckets")
    private List<String> allowBucketsParam;

    /** 授权的对象前缀，仅允许 "*" 或不含 "*" 的前缀 */
    @SerializedName("AllowObjectPrefix")
    private String allowObjectPrefixParam;

    /** 允许的操作，允许的S3操作列表 */
    @SerializedName("AllowOps")
    private List<String> allowOpsParam;

    /** IP黑名单，格式需包含 "/" 前缀长度 */
    @SerializedName("BlackIPs")
    private List<String> blackIPsParam;

    /** 过期时间，Unix 时间戳（毫秒） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 令牌名称，令牌展示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 私钥，用于S3访问认证 */
    @SerializedName("SecretKey")
    private String secretKeyParam;

    /** IP白名单，格式需包含 "/" 前缀长度 */
    @SerializedName("WhiteIPs")
    private List<String> whiteIPsParam;


    public String getAccessKey() {
        return accessKeyParam;
    }

    public void setAccessKey(String accessKeyParam) {
        this.accessKeyParam = accessKeyParam;
    }

    public List<String> getAllowBuckets() {
        return allowBucketsParam;
    }

    public void setAllowBuckets(List<String> allowBucketsParam) {
        this.allowBucketsParam = allowBucketsParam;
    }

    public String getAllowObjectPrefix() {
        return allowObjectPrefixParam;
    }

    public void setAllowObjectPrefix(String allowObjectPrefixParam) {
        this.allowObjectPrefixParam = allowObjectPrefixParam;
    }

    public List<String> getAllowOps() {
        return allowOpsParam;
    }

    public void setAllowOps(List<String> allowOpsParam) {
        this.allowOpsParam = allowOpsParam;
    }

    public List<String> getBlackIPs() {
        return blackIPsParam;
    }

    public void setBlackIPs(List<String> blackIPsParam) {
        this.blackIPsParam = blackIPsParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getSecretKey() {
        return secretKeyParam;
    }

    public void setSecretKey(String secretKeyParam) {
        this.secretKeyParam = secretKeyParam;
    }

    public List<String> getWhiteIPs() {
        return whiteIPsParam;
    }

    public void setWhiteIPs(List<String> whiteIPsParam) {
        this.whiteIPsParam = whiteIPsParam;
    }

}
