package com.metadata.repository;

import com.metadata.vo.FileMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deepa on 8/17/2017.
 */
@Repository
public interface FileMetadataRepository extends CrudRepository<FileMetadata,String> {
}
