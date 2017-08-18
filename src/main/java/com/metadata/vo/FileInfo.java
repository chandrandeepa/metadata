package com.metadata.vo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Deepa on 8/17/2017.
 */
@Entity
@Table(name = "FILE_INFO")
public class FileInfo {

    @Id
    @Column(name = "FILE_ID")
    private String fileId;
    @Column(name = "FILE_NAME")
    private String fileName;
    @Column(name = "FILE_CONTENT")
    private byte[] fileContent;
    @OneToMany(mappedBy = "fileInfo", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<FileMetadata> metadataList;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public List<FileMetadata> getMetadataList() {
        return metadataList;
    }

    public void setMetadataList(List<FileMetadata> metadataList) {
        this.metadataList = metadataList;
    }
}
