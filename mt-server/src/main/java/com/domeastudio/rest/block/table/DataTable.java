package com.domeastudio.rest.block.table;

import com.domeastudio.dto.UserOperationParams;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domea on 16-5-25.
 */
@Path("/block/dataTable")
@Component
@Singleton
public class DataTable {
    private static Logger logger = Logger.getLogger(DataTable.class);

    @GET
    @Path("/tables")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getTables(UserOperationParams userOperationParams){
        return null;
    }

    @GET
    @Path("/table/{ttid}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getTable(@PathParam("ttid") String ttid){
        return null;
    }

    @POST
    @Path("/addTable")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addTable(@FormParam("tableName") String tableName){
        return null;
    }

}
