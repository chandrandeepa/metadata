package com.metadata.vo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Deepa on 8/17/2017.
 */
@Entity
public class FileInfo {

    @Id
    private String fileid;
    private String fileName;
    private byte[] fileContent;
    @OneToMany(mappedBy = "fileInfo", cascade = CascadeType.ALL)
    private List<FileMetadata> metadataList;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
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
