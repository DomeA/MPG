package com.domeastudio.data.dao.MDAO;

import com.domeastudio.data.dao.MongoDBBaseDAO;
import com.domeastudio.data.pojo.files.FileEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by domea on 16-4-21.
 */
@Repository
@Component("FileDAO")
public class FileDAO extends MongoDBBaseDAO<FileEntity> {

}
