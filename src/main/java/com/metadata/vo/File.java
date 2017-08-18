package com.metadata.vo;

import java.util.List;

/**
 * Created by Deepa on 8/17/2017.
 */
public class File {

    private String fileId;
    private String fileName;
    private byte[] fileContent;
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
