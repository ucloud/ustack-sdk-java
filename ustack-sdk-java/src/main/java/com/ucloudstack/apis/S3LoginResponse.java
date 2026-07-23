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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class S3LoginResponse extends Response {

    /** 密钥ID，用于S3访问认证 */
    @SerializedName("AccessKey")
    private String accessKeyParam;

    /** 桶名称，最终登录的S3桶，Scenes=ImageUpload 固定为 mirror，Scenes=OSS 返回请求指定的桶 */
    @SerializedName("Bucket")
    private String bucketParam;

    /** 访问地址，S3访问端点 */
    @SerializedName("Endpoint")
    private String endpointParam;

    /** 密钥，用于S3访问认证 */
    @SerializedName("SecretKey")
    private String secretKeyParam;

    /** S3会话认证信息，用于后续请求鉴权 */
    @SerializedName("SessionID")
    private String sessionIDParam;


    public String getAccessKey() {
        return accessKeyParam;
    }

    public void setAccessKey(String accessKeyParam) {
        this.accessKeyParam = accessKeyParam;
    }

    public String getBucket() {
        return bucketParam;
    }

    public void setBucket(String bucketParam) {
        this.bucketParam = bucketParam;
    }

    public String getEndpoint() {
        return endpointParam;
    }

    public void setEndpoint(String endpointParam) {
        this.endpointParam = endpointParam;
    }

    public String getSecretKey() {
        return secretKeyParam;
    }

    public void setSecretKey(String secretKeyParam) {
        this.secretKeyParam = secretKeyParam;
    }

    public String getSessionID() {
        return sessionIDParam;
    }

    public void setSessionID(String sessionIDParam) {
        this.sessionIDParam = sessionIDParam;
    }

}
