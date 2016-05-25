package com.domeastudio.data.service.MServices;

import com.domeastudio.data.dao.MDAO.FileDAO;
import com.domeastudio.data.pojo.files.FileEntity;
import com.domeastudio.data.service.MongoDBBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by domea on 16-4-21.
 */
@Service
@Component("FileService")
public class FileService extends MongoDBBaseService<FileEntity> {
    @Autowired
    private FileDAO fileDAO;

    public FileService(){
        super();
    }

    public FileDAO getFileDAO() {
        return fileDAO;
    }

    @Autowired
    public void setFileDAO(FileDAO fileDAO) {
        super.setMongoDBBaseDAO(fileDAO);
        this.fileDAO = fileDAO;
    }
}
