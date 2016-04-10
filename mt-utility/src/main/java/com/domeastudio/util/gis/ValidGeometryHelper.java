package com.domeastudio.util.gis;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;

/**
 * Created by domea on 16-4-2.
 */
public class ValidGeometryHelper {
    public static Boolean isValidAndNotEmpty(Geometry geometry){
        return !geometry.isEmpty()&&geometry.isValid();
    }

    public static Boolean isGeometryCollection(Geometry geometry){
        return geometry.getClass().equals(GeometryCollection.class);
    }
}
