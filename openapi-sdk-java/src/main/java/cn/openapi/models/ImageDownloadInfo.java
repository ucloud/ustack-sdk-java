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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ImageDownloadInfo {

    /** 下载Query，已做URL编码，需要拼接当前地域S3地址获取完整下载链接，例如http://s3.example.com/download?{DownloadQuery} */
    @SerializedName("DownloadQuery")
    private String downloadQueryParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpiredTime")
    private Integer expiredTimeParam;


    public String getDownloadQuery() {
        return downloadQueryParam;
    }

    public void setDownloadQuery(String downloadQueryParam) {
        this.downloadQueryParam = downloadQueryParam;
    }

    public Integer getExpiredTime() {
        return expiredTimeParam;
    }

    public void setExpiredTime(Integer expiredTimeParam) {
        this.expiredTimeParam = expiredTimeParam;
    }

}
