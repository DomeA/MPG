package com.domeastudio.rest.gis.map;

import com.domeastudio.dto.MapOperationParams;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domea on 16-5-25.
 */
@Path("/gis/map")
@Component
@Singleton
public class Map {
    private static Logger logger = Logger.getLogger(Map.class);
    @GET
    @Path("/maps")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getMaps(){
        return null;
    }

    @POST
    @Path("/map")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getMap(MapOperationParams mapOperationParams){
        return null;
    }

    @DELETE
    @Path("/delmap")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String delMap(MapOperationParams mapOperationParams){
        return null;
    }

}
