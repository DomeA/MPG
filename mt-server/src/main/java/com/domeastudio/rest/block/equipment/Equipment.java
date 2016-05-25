package com.domeastudio.rest.block.equipment;

import com.domeastudio.dto.EquipmentOperationParams;
import com.domeastudio.dto.UserOperationParams;
import com.sun.jersey.spi.resource.Singleton;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domea on 16-5-25.
 */
@Path("/block/equipment")
@Component
@Singleton
public class Equipment {
    @POST
    @Path("/location")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String location(UserOperationParams userOperationParams){
        return null;
    }

    @POST
    @Path("/history")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String historyLocation(UserOperationParams userOperationParams){
        return null;
    }

    @POST
    @Path("/getEquipment")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getEquipment(UserOperationParams userOperationParams){
        return null;
    }

    @GET
    @Path("/getEquipments")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getEquipments(){
        return null;
    }

    @POST
    @Path("/getUsers")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getUsers(EquipmentOperationParams equipmentOperationParams){
        return null;
    }
}
