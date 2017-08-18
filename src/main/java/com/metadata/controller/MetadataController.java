package com.metadata.controller;

import com.metadata.repository.FileRepository;
import com.metadata.vo.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
