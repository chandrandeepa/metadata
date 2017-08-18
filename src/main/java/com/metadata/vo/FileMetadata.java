package com.metadata.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Deepa on 8/17/2017.
 */
@Entity
public class FileMetadata {

    @Id
    private String metadataId;
    private String key;
    private String value;
    @ManyToOne
    @JoinColumn(name = "fileid")
    @JsonIgnore
    private FileInfo fileInfo;

    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
