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

public class DeleteOSMediaV2Request extends Request {

    /** 系统镜像ID，需要先通过CreateOSMediaV2/ListOSMediaV2获取，删除时会先清理Kunlun镜像再删除Taishan资源 */
    @NotEmpty
    @OpenAPIParam("MediaID")
    private String mediaIDParam;

    /** 地域ID，指定要删除系统镜像所在地域，系统会在该地域的Kunlun及Taishan中执行删除 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getMediaID() {
        return mediaIDParam;
    }

    public void setMediaID(String mediaIDParam) {
        this.mediaIDParam = mediaIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
