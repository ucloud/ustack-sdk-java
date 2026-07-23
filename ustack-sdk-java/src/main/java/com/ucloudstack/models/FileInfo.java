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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class FileInfo {

    /** 文件路径，文件或目录的绝对路径 */
    @SerializedName("FilePath")
    private String filePathParam;

    /** 是否为目录，用于区分文件与目录 */
    @SerializedName("IsDir")
    private Boolean isDirParam;

    /** 文件修改时间，Unix 时间戳（秒级） */
    @SerializedName("ModTime")
    private Integer modTimeParam;

    /** 文件名，文件或目录的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 文件大小，单位：字节 */
    @SerializedName("Size")
    private Integer sizeParam;


    public String getFilePath() {
        return filePathParam;
    }

    public void setFilePath(String filePathParam) {
        this.filePathParam = filePathParam;
    }

    public Boolean getIsDir() {
        return isDirParam;
    }

    public void setIsDir(Boolean isDirParam) {
        this.isDirParam = isDirParam;
    }

    public Integer getModTime() {
        return modTimeParam;
    }

    public void setModTime(Integer modTimeParam) {
        this.modTimeParam = modTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

}
