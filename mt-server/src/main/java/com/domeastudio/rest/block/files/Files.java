package com.domeastudio.rest.block.files;
import com.domeastudio.data.pojo.Beans;
import com.domeastudio.dto.resultset.ReadWriteFileOutputParams;
import com.domeastudio.dto.resultset.LogLevel;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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

    @GET
    @Path("/searchFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileSearch(){
        Beans beans =new Beans();
        beans.setAge("15");
        beans.setName("DomeA");
        return readWriteFileOutputParams.outputResult(beans, LogLevel.INFO,"","mpg_00000");
    }

    @POST
    @Path("/addFile")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String fileAdd(){
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
