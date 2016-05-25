package com.domeastudio.data.pojo.files;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by domea on 16-4-21.
 */
@JsonRootName("file")
@Component("FileEntity")
public class FileEntity implements Serializable {
    private String content;
    private String fileName;
    private FileAttributeEntity fileAttribute;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileAttributeEntity getFileAttribute() {
        return fileAttribute;
    }

    public void setFileAttribute(FileAttributeEntity fileAttribute) {
        this.fileAttribute = fileAttribute;
    }
}
