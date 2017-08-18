package com.metadata.vo;

import javax.persistence.*;

/**
 * Created by Deepa on 8/17/2017.
 */
@Entity
@Table(name = "FILE_METADATA")
public class FileMetadata {

    @Id
    @Column(name = "METADATA_ID")
    private String metadataId;
    @Column(name = "KEY")
    private String key;
    @Column(name = "VALUE")
    private String value;
    @ManyToOne
    @JoinColumn(name = "FILE_ID")
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
