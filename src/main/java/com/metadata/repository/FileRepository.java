package com.metadata.repository;

import com.metadata.vo.FileInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deepa on 8/17/2017.
 */
@Repository
public interface FileRepository extends CrudRepository<FileInfo,String>{
}
