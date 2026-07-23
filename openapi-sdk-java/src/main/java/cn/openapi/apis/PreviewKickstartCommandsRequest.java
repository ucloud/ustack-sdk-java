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

public class PreviewKickstartCommandsRequest extends Request {

    /** 分区配置（与TemplateID二选一） */
    
    @OpenAPIParam("Config")
    private String configParam;

    /** 磁盘设备名 */
    
    @OpenAPIParam("DiskDevice")
    private String diskDeviceParam;

    /** 磁盘大小(GB)，用于计算自动分区 */
    
    @OpenAPIParam("DiskSizeGB")
    private Integer diskSizeGBParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 使用现有模板ID（与Config二选一） */
    
    @OpenAPIParam("TemplateID")
    private String templateIDParam;


    public String getConfig() {
        return configParam;
    }

    public void setConfig(String configParam) {
        this.configParam = configParam;
    }

    public String getDiskDevice() {
        return diskDeviceParam;
    }

    public void setDiskDevice(String diskDeviceParam) {
        this.diskDeviceParam = diskDeviceParam;
    }

    public Integer getDiskSizeGB() {
        return diskSizeGBParam;
    }

    public void setDiskSizeGB(Integer diskSizeGBParam) {
        this.diskSizeGBParam = diskSizeGBParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

}
