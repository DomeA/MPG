package com.domeastudio.rest.block.files;
import com.domeastudio.data.pojo.files.FileAttributeEntity;
import com.domeastudio.data.pojo.files.FileEntity;
import com.domeastudio.data.pojo.files.FileType;
import com.domeastudio.data.service.MServices.FileService;
import com.domeastudio.dto.FileOperationParams;
import com.domeastudio.dto.resultset.ReadWriteFileOutputParams;
import com.domeastudio.dto.resultset.LogLevel;
import com.domeastudio.util.JacksonHelper;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by domea on 16-4-10.
 */
@Path("/block/files")
@Component
@Singleton
public class Files {
    private static Logger logger = Logger.getLogger(Files.class);
    @Autowired
    private ReadWriteFileOutputParams readWriteFileOutputParams;

    @Autowired
    private FileService fileService;

    @POST
    @Path("/searchFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileSearch(FileOperationParams fileOperationParams){
        try {
            logger.info("file search process is start.");
            logger.info("params:"+ JacksonHelper.buildNonNullBinder().toJson(fileOperationParams));
            String fileName=fileOperationParams.getFileName();
            return readWriteFileOutputParams.outputResult(fileService.get(fileName,FileEntity.class.getName()), LogLevel.INFO,"","mpg_00000");
        } catch (Exception e) {
            logger.error("file search process is failed",e);
            throw new RuntimeException("file search process is failed");
        }
    }

    @POST
    @Path("/addFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileAdd(){
        FileEntity fileEntity=new FileEntity();
        fileEntity.setFileName("abc");
        fileEntity.setContent("123456adbfasldfjasl");
        FileAttributeEntity fileAttributeEntity=new FileAttributeEntity();
        fileAttributeEntity.setCreateTime(new Date());
        fileAttributeEntity.setStorageTime(new Date());
        fileAttributeEntity.setFileType(FileType.word);
        fileEntity.setFileAttribute(fileAttributeEntity);
        fileService.insert(fileEntity,FileEntity.class.getName());
        return null;
    }

    @POST
    @Path("/deleteFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileDelete(){
        return null;
    }

    @POST
    @Path("/updateFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileUpdate(){
        return null;
    }

    @POST
    @Path("/regularFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileRegular(){
        return null;
    }

}
