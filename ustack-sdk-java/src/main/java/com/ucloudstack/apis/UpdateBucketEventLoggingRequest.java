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

public class UpdateBucketEventLoggingRequest extends Request {

    /** 桶名称，存储桶名称 */
    @NotEmpty
    @OpenAPIParam("Bucket")
    private String bucketParam;

    /** 事件日志开关，取值范围：on/off */
    @NotEmpty
    @OpenAPIParam("EventLoggingSwitch")
    private String eventLoggingSwitchParam;

    /** 对象存储ID，对象存储实例标识 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getBucket() {
        return bucketParam;
    }

    public void setBucket(String bucketParam) {
        this.bucketParam = bucketParam;
    }

    public String getEventLoggingSwitch() {
        return eventLoggingSwitchParam;
    }

    public void setEventLoggingSwitch(String eventLoggingSwitchParam) {
        this.eventLoggingSwitchParam = eventLoggingSwitchParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
