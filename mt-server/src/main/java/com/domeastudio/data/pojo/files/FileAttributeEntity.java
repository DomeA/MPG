package com.domeastudio.data.pojo.files;

import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.Date;

/**
 * Created by domea on 16-4-21.
 */
@JsonRootName("fileAttribute")
public class FileAttributeEntity {
    //private String
    private FileType fileType;
    private Date createTime;
    private Date storageTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }
}
