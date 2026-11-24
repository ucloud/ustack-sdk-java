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

public class CreateAdminResponse extends Response {

    /** 成员ID，创建成功后返回的管理员账号标识 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** API私钥，管理员私钥，仅在本次创建响应中返回一次，请立即妥善保存；后续查询接口不返回 */
    @SerializedName("PrivateKey")
    private String privateKeyParam;

    /** API公钥，管理员公钥，仅在本次创建响应中返回 */
    @SerializedName("PublicKey")
    private String publicKeyParam;


    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getPrivateKey() {
        return privateKeyParam;
    }

    public void setPrivateKey(String privateKeyParam) {
        this.privateKeyParam = privateKeyParam;
    }

    public String getPublicKey() {
        return publicKeyParam;
    }

    public void setPublicKey(String publicKeyParam) {
        this.publicKeyParam = publicKeyParam;
    }

}
