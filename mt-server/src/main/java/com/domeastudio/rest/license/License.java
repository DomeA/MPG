package com.domeastudio.rest.license;

import com.domeastudio.dto.FileOperationParams;
import com.domeastudio.dto.resultset.LogLevel;
import com.domeastudio.dto.resultset.ReadWriteFileOutputParams;
import com.domeastudio.rest.block.files.Files;
import com.domeastudio.util.JacksonHelper;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by domea on 16-4-15.
 */
@Path("/license")
@Component
@Singleton
public class License {
    private static Logger logger = Logger.getLogger(Files.class);
    @Autowired
    private ReadWriteFileOutputParams readWriteFileOutputParams;

    private ReadWriteLicense readWriteLicense=ReadWriteLicense.getInstance();
    @GET
    @Path("/getLic")
    @Produces(MediaType.APPLICATION_JSON + ";charset=" + "UTF-8")
    @Consumes({ "application/json;charset=utf-8" })
    public String getLicenseHost(){
        try {
            logger.info("search host name process is start.");
            List<String> stringList=new ArrayList<String>();
            stringList.add(readWriteLicense.getLicenseName());
            stringList.add(readWriteLicense.getKey());
            stringList.add(readWriteLicense.getNumber());
            return readWriteFileOutputParams.outputResult(stringList,LogLevel.INFO,"计算机名::公钥::加密字符串","mpg_00000");
        } catch (Exception e) {
            logger.error("search host name process is failed",e);
            throw new RuntimeException("search host name process is failed");
        }
    }
}
