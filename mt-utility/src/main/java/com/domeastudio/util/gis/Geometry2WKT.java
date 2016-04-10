package com.domeastudio.util.gis;

import com.vividsolutions.jts.geom.Geometry;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式，几何对象转WKT字符串
 * Created by domea on 16-4-2.
 */
public class Geometry2WKT {
    private static Logger logger = Logger.getLogger(Geometry2WKT.class);
    private static class SingletonHolder {
        private static final Geometry2WKT INSTANCE = new Geometry2WKT();
    }
    private Geometry2WKT (){}

    /**
     * 获取当前实例
     * @return 获取当前对象的实例，是线程安全的
     */
    public static final Geometry2WKT getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 获取几何对象的WKT字符串
     * @param geometry 几何对象
     * @return 返回WKT字符串
     */
    public String getWKT(Geometry geometry){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            return geometry.toText();
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 获取几何对象的EWKT字符串
     * @param geometry 几何对象
     * @param epsg Epsg坐标系代号
     * @return 返回WKT字符串
     */
    public String getEWKT(Geometry geometry,Integer epsg){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            Integer srid=(geometry.getSRID()==0)?epsg:geometry.getSRID();
            return "SRID="+srid+";"+geometry.toText();
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 获取几何对象的EWKT字符串
     * @param geometry 几何对象
     * @return 返回WKT字符串
     */
    public String getEWKT(Geometry geometry){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            return "SRID="+geometry.getSRID()+";"+geometry.toText();
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 获取几何对象的类型
     * @param geometry 几何对象
     * @return 返回几何类型
     */
    public GeometryType getGeometryType(Geometry geometry){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            return GeometryType.valueOf(geometry.getGeometryType().toUpperCase());
        }else {
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 拆分复杂几何对象成简单几何对象
     * @param geometry 几何对象
     * @return 返回WKT字符串列表
     */
    public List<String> geometrySplit(Geometry geometry){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            List<String> stringList=new ArrayList<String>();
            for(int i=0;i<geometry.getNumGeometries();i++){
                stringList.add(getEWKT(geometry.getGeometryN(i)));
            }
            return stringList;
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 拆分复杂几何对象成简单几何对象
     * @param geometry 几何对象
     * @return 返回WKT字符串列表
     */
    public List<String> geometrySplit4WKT(Geometry geometry){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            List<String> stringList=new ArrayList<String>();
            for(int i=0;i<geometry.getNumGeometries();i++){
                stringList.add(getWKT(geometry.getGeometryN(i)));
            }
            return stringList;
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }

    /**
     * 拆分复杂几何对象成简单几何对象
     * @param geometry 几何对象
     * @param epsg Epsg坐标系代号
     * @return 返回WKT字符串列表
     */
    public List<String> geometrySplit(Geometry geometry,Integer epsg){
        if(ValidGeometryHelper.isValidAndNotEmpty(geometry)){
            List<String> stringList=new ArrayList<String>();
            for(int i=0;i<geometry.getNumGeometries();i++){
                stringList.add(getEWKT(geometry.getGeometryN(i),epsg));
            }
            return stringList;
        }else{
            logger.error("geometry is empty or invalid");
            throw new RuntimeException("geometry is empty or invalid");
        }
    }
    /**
     * 合并多个几何对象成一个几何集合
     * @return 返回WKT字符串
     */
    public String geometryMerge(List<Geometry> geometryList){

        return null;
    }
}
