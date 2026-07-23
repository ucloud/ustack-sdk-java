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

public class SetupSMCRequest extends Request {

    /** 带宽限速，单位Mbps，用于控制迁移数据传输的网络带宽，0表示不限速，null时不做限制 */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 磁盘映射关系列表，指定源端磁盘与目标云硬盘的映射关系，每个源端磁盘分区必须映射到一个目标云硬盘 */
    @NotEmpty
    @OpenAPIParam("DiskMappings")
    private List<DiskMapping> diskMappingsParam;

    /** 传输IP地址，目标虚拟机的IP地址或网络接口地址，用于数据传输的网络连接目标 */
    @NotEmpty
    @OpenAPIParam("Host")
    private String hostParam;

    /** 目标虚拟机SSH密码（明文），用于传输数据通道的认证，若不指定，则系统自动从虚拟机获取root用户凭证，输入的密码将使用VMID作为密钥进行AES-ECB加密存储 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 地域ID，指定SMC任务所属的物理区域，与SMCID对应的区域必须相同 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SMC任务唯一标识ID，标识要配置的迁移任务，任务必须处于ONLINE或SYNCED状态 */
    @NotEmpty
    @OpenAPIParam("SMCID")
    private String sMCIDParam;

    /** 目标虚拟机SSH用户名，用于传输数据通道的认证，若不指定且未提供Password，则系统自动从虚拟机获取root用户凭证；当Password不为空时必填 */
    
    @OpenAPIParam("User")
    private String userParam;

    /** 目标传输虚拟机ID，用于接收源端迁移数据，虚拟机必须运行且网络可通 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public List<DiskMapping> getDiskMappings() {
        return diskMappingsParam;
    }

    public void setDiskMappings(List<DiskMapping> diskMappingsParam) {
        this.diskMappingsParam = diskMappingsParam;
    }

    public String getHost() {
        return hostParam;
    }

    public void setHost(String hostParam) {
        this.hostParam = hostParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSMCID() {
        return sMCIDParam;
    }

    public void setSMCID(String sMCIDParam) {
        this.sMCIDParam = sMCIDParam;
    }

    public String getUser() {
        return userParam;
    }

    public void setUser(String userParam) {
        this.userParam = userParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
