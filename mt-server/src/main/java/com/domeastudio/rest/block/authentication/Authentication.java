package com.domeastudio.rest.block.authentication;

import com.domeastudio.dto.UserOperationParams;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domea on 16-4-10.
 */
@Path("/block/authentication")
@Component
@Singleton
public class Authentication {
    private static Logger logger = Logger.getLogger(Authentication.class);
    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String login(UserOperationParams userOperationParams){
        try{

        }catch (Exception e){
            logger.error("login failed:",e);
        }
        return null;
    }

    @GET
    @Path("/logs")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getLogs(){
        try{

        }catch (Exception e){
            logger.error("login failed:",e);
        }
        return null;
    }

    @POST
    @Path("/log")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getLog(UserOperationParams userOperationParams){
        try{

        }catch (Exception e){
            logger.error("login failed:",e);
        }
        return null;
    }
}
