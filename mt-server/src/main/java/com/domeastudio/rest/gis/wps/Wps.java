package com.domeastudio.rest.gis.wps;

import com.domeastudio.dto.SpatialOperationParams;
import com.domeastudio.util.JacksonHelper;
import com.domeastudio.util.StringHelper;
import com.domeastudio.util.gis.CoordinateTransformationHelper;
import com.domeastudio.util.gis.GeometryFormateHelper;
import com.domeastudio.util.gis.SpatialOperationHelper;
import com.sun.jersey.spi.resource.Singleton;
import com.vividsolutions.jts.geom.Geometry;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domea on 16-4-10.
 */
@Path("/gis/wps")
@Component
@Singleton
public class Wps {
    private static Logger logger = Logger.getLogger(Wps.class);
    @POST
    @Path("/intersects")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String intersects(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("intersects process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.intersects(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.intersects(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("intersects process is failed",e);
            throw new RuntimeException("intersects process is failed");
        }
    }

    @POST
    @Path("/touches")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String touches(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("touches process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.touches(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.touches(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("touches process is failed",e);
            throw new RuntimeException("touches process is failed");
        }
    }

    @POST
    @Path("/contains")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String contains(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("contains process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.contains(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.contains(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("contains process is failed",e);
            throw new RuntimeException("contains process is failed");
        }
    }

    @POST
    @Path("/crosses")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String crosses(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("crosses process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.crosses(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.crosses(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("crosses process is failed",e);
            throw new RuntimeException("crosses process is failed");
        }
    }

    @POST
    @Path("/equals")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String equals(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("equals process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.equals(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.equals(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("equals process is failed",e);
            throw new RuntimeException("equals process is failed");
        }
    }

    @POST
    @Path("/difference")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String difference(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("difference process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.difference(geometrySource,geometryTarget).toText());
            return SpatialOperationHelper.difference(geometrySource,geometryTarget).toText();
        }catch (Exception e){
            logger.error("difference process is failed",e);
            throw new RuntimeException("difference process is failed");
        }
    }

    @POST
    @Path("/intersection")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String intersection(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("intersection process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.intersection(geometrySource,geometryTarget).toText());
            return SpatialOperationHelper.intersection(geometrySource,geometryTarget).toText();
        }catch (Exception e){
            logger.error("intersection process is failed",e);
            throw new RuntimeException("intersection process is failed");
        }
    }

    @POST
    @Path("/union")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String union(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("union process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.union(geometrySource,geometryTarget).toText());
            return SpatialOperationHelper.union(geometrySource,geometryTarget).toText();
        }catch (Exception e){
            logger.error("union process is failed",e);
            throw new RuntimeException("union process is failed");
        }
    }

    @POST
    @Path("/disjoint")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String disjoint(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("disjoint process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.disjoint(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.disjoint(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("disjoint process is failed",e);
            throw new RuntimeException("disjoint process is failed");
        }
    }

    @POST
    @Path("/overlaps")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String overlaps(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("overlaps process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.overlaps(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.overlaps(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("overlaps process is failed",e);
            throw new RuntimeException("overlaps process is failed");
        }
    }

    @POST
    @Path("/within")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String within(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("within process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.within(geometrySource,geometryTarget).toString());
            return SpatialOperationHelper.within(geometrySource,geometryTarget).toString();
        }catch (Exception e){
            logger.error("within process is failed",e);
            throw new RuntimeException("within process is failed");
        }
    }

    @POST
    @Path("/distance")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String distance(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("distance process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Geometry geometryTarget=GeometryFormateHelper.getGeometry(spatialOperationParams.getTargetWKT());
            logger.info("result:"+SpatialOperationHelper.distance(geometrySource,geometryTarget));
            return java.lang.String.valueOf(SpatialOperationHelper.distance(geometrySource,geometryTarget));
        }catch (Exception e){
            logger.error("distance process is failed",e);
            throw new RuntimeException("distance process is failed");
        }
    }

    @POST
    @Path("/area")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String area(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("area process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            logger.info("result:"+SpatialOperationHelper.area(geometrySource));
            return String.valueOf(SpatialOperationHelper.area(geometrySource)) ;
        }catch (Exception e){
            logger.error("area process is failed",e);
            throw new RuntimeException("area process is failed");
        }
    }

    @POST
    @Path("/length")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String length(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("length process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            logger.info("result:"+SpatialOperationHelper.length(geometrySource));
            return String.valueOf(SpatialOperationHelper.length(geometrySource)) ;
        }catch (Exception e){
            logger.error("length process is failed",e);
            throw new RuntimeException("length process is failed");
        }
    }

    @POST
    @Path("/buffer")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String buffer(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("buffer process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Double radius=spatialOperationParams.getRadius();
            logger.info("result:"+SpatialOperationHelper.buffer(geometrySource,radius).toText());
            return SpatialOperationHelper.buffer(geometrySource,radius).toText();
        }catch (Exception e){
            logger.error("buffer process is failed",e);
            throw new RuntimeException("buffer process is failed");
        }
    }

    @POST
    @Path("/transform")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String transform(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("transform process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            Integer sourceEpsg=spatialOperationParams.getSourceEpsg();
            Integer targetEpsg=spatialOperationParams.getTargetEpsg();
            if(sourceEpsg!=null&&targetEpsg!=null&&sourceEpsg!=0&&targetEpsg!=0){
                logger.info("result:"+CoordinateTransformationHelper.transform(geometrySource,sourceEpsg,targetEpsg).toText());
                return CoordinateTransformationHelper.transform(geometrySource,sourceEpsg,targetEpsg).toText();
            }else {
                logger.error("epsg code is invalid");
                throw new RuntimeException("epsg code is invalid");
            }
        }catch (Exception e){
            logger.error("transform process is failed",e);
            throw new RuntimeException("transform process is failed");
        }
    }

    @POST
    @Path("/transform4WKT")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String transform4WKT(SpatialOperationParams spatialOperationParams){
        try{
            logger.info("transform process is start:");
            logger.info("params:"+ JacksonHelper.buildNormalBinder().toJson(spatialOperationParams));
            Geometry geometrySource=GeometryFormateHelper.getGeometry(spatialOperationParams.getSourceWKT());
            String sourceCRS=spatialOperationParams.getSourceCRS();
            String targetCRS=spatialOperationParams.getTargetCRS();
            if(!StringHelper.isEmptyAndBlank(sourceCRS)&&!StringHelper.isEmptyAndBlank(targetCRS)){
                logger.info("result:"+CoordinateTransformationHelper.transform(geometrySource,sourceCRS,targetCRS).toText());
                return CoordinateTransformationHelper.transform(geometrySource,sourceCRS,targetCRS).toText();
            }else {
                logger.error("CRS wkt string is invalid");
                throw new RuntimeException("CRS wkt string is invalid");
            }
        }catch (Exception e){
            logger.error("transform process is failed",e);
            throw new RuntimeException("transform process is failed");
        }
    }
}
