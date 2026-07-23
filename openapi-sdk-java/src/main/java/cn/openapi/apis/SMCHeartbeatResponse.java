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

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class SMCHeartbeatResponse extends Response {

    /** 带宽限速，单位Mbps，0表示不限速 */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 是否启用校验和验证，确保数据完整性 */
    @SerializedName("Checksum")
    private Boolean checksumParam;

    /** 是否启用压缩传输，节省网络带宽 */
    @SerializedName("CompressLevel")
    private Boolean compressLevelParam;

    /** 磁盘映射关系列表，仅包含已配置MappingDiskID的磁盘信息 */
    @SerializedName("DiskMappings")
    private List<DiskMapping> diskMappingsParam;

    /** 传输IP地址，目标VM的内网IP，用于SSH数据传输 */
    @SerializedName("Host")
    private String hostParam;

    /** 目标虚拟机SSH密码，已使用AES-ECB加密存储，使用VMID作为密钥 */
    @SerializedName("Password")
    private String passwordParam;

    /** 传输端口，固定为22（SSH协议） */
    @SerializedName("Port")
    private Integer portParam;

    /** SMC任务唯一标识ID */
    @SerializedName("SMCID")
    private String sMCIDParam;

    /** 当前任务状态，由任务引擎根据迁移进度返回 */
    @SerializedName("State")
    private String stateParam;

    /** 目标虚拟机SSH用户名，用于数据传输认证 */
    @SerializedName("User")
    private String userParam;

    /** 目标传输虚拟机ID，接收迁移数据的目标VM */
    @SerializedName("VMID")
    private String vMIDParam;

    /** 是否传输全量文件，否则仅传输增量部分 */
    @SerializedName("WholeFile")
    private Boolean wholeFileParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public Boolean getChecksum() {
        return checksumParam;
    }

    public void setChecksum(Boolean checksumParam) {
        this.checksumParam = checksumParam;
    }

    public Boolean getCompressLevel() {
        return compressLevelParam;
    }

    public void setCompressLevel(Boolean compressLevelParam) {
        this.compressLevelParam = compressLevelParam;
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

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getSMCID() {
        return sMCIDParam;
    }

    public void setSMCID(String sMCIDParam) {
        this.sMCIDParam = sMCIDParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
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

    public Boolean getWholeFile() {
        return wholeFileParam;
    }

    public void setWholeFile(Boolean wholeFileParam) {
        this.wholeFileParam = wholeFileParam;
    }

}
