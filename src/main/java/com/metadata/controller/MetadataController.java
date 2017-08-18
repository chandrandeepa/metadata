package com.metadata.controller;

import com.metadata.repository.FileRepository;
import com.metadata.vo.FileInfo;
import com.metadata.vo.FileMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Created by Deepa on 8/18/2017.
 */
@RestController
@RequestMapping(value="/metadata", produces = MediaType.APPLICATION_JSON_VALUE)
public class MetadataController {

    @Autowired
    private FileRepository fileRepository;

    @RequestMapping
    public Iterable<FileInfo> files(){
        return fileRepository.findAll();
    }

    @RequestMapping(value="/{fileId}")
    public Iterable<FileMetadata> metadata(@PathVariable("fileId") String fileId){
        List<FileMetadata> metadataList = null;
        Optional<FileInfo> fileInfo = Optional.of(fileRepository.findOne(fileId));
        if (fileInfo.isPresent()){
          metadataList =  fileInfo.get().getMetadataList();
        }else{
            metadataList = new ArrayList<>();
        }
        return metadataList;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<FileInfo> upload(@RequestBody FileInfo fileInfo){
        if(fileInfo.getMetadataList() !=null && !fileInfo.getMetadataList().isEmpty()) {
            fileInfo.getMetadataList().stream().forEach(fileMetadata -> fileMetadata.setFileInfo(fileInfo));
        }
        FileInfo newFileInfo = fileRepository.save(fileInfo);
        return new ResponseEntity<FileInfo>(newFileInfo, HttpStatus.CREATED);
    }

}
