package com.domeastudio.rest.block.equipment;

import com.domeastudio.dto.EquipmentOperationParams;
import com.domeastudio.dto.UserOperationParams;
import com.sun.jersey.spi.resource.Singleton;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
/**
 * Created by domea on 16-5-25.
 */
@Path("/block/equipment")
@Component
@Singleton
public class Equipment {
    private static Logger logger = Logger.getLogger(Equipment.class);
    /**
     * 根据用户信息，查询此用户当前位置信息
     * @param userOperationParams
     * @return
     */
    @POST
    @Path("/location")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String location(UserOperationParams userOperationParams){
        return null;
    }

    /**
     * 根据用户信息，查询此用户的历史轨迹点
     * @param userOperationParams
     * @return
     */
    @POST
    @Path("/history")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String historyLocation(UserOperationParams userOperationParams){
        return null;
    }

    /**
     * 根据用户信息，查询此用户使用过的设备
     * @param userOperationParams
     * @return
     */
    @POST
    @Path("/getEquipment")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getEquipment(UserOperationParams userOperationParams){
        return null;
    }

    /**
     * 获取所有设备信息
     * @return
     */
    @GET
    @Path("/getEquipments")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getEquipments(){
        return null;
    }

    /**
     * 根据设备信息，查询使用过此设备的用户
     * @param equipmentOperationParams
     * @return
     */
    @POST
    @Path("/getUsers")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getUsers(EquipmentOperationParams equipmentOperationParams){
        return null;
    }
}
