package com.domeastudio.util;

import com.domeastudio.config.faultcode.SystemCode;
import com.domeastudio.util.gis.GeometryFormateHelper;
import com.domeastudio.util.gis.SpatialOperationHelper;
import com.vividsolutions.jts.geom.Geometry;
import org.springframework.stereotype.Component;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by domea on 16-4-16.
 */
public class JarClassLoader extends URLClassLoader {
    public JarClassLoader(URL[] urls) {
        super(urls);
    }
    public JarClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }
    public void addJar(String jarName) throws MalformedURLException {
        URL url=(new File(getPath(jarName))).toURI().toURL();
        this.addURL(url);
    }
    private String getPath(String jarName){
        //JarClassLoader.class .getClassLoader().getResource("").getFile();
        return this.getClass().getResource("/").getPath().replace("classes","lib")+jarName;
    }


    public static void main(String [] args){
        URL[] urls = new URL[] {};
        JarClassLoader jarClassLoader=new JarClassLoader(urls,Thread.currentThread().getContextClassLoader());
        try {
            Geometry geometrySource= GeometryFormateHelper.getGeometry("POLYGON((1 1,3 4,6 7,10 45,1 1))");
            Geometry geometryTarget=GeometryFormateHelper.getGeometry("POINT(1 1)");
            //String path=jarClassLoader.getPath("lib/utility-1.0-SNAPSHOT.jar");
            jarClassLoader.addJar("utility-1.0-SNAPSHOT.jar");
            Class<?> clazz = jarClassLoader.loadClass("com.domeastudio.util.gis.SpatialOperationHelper");
            Class[] parameterTypes = new Class[]{
                    Geometry.class,
                    Geometry.class
            };
            Method method = clazz.getMethod("touches",parameterTypes);
            Boolean f=(Boolean)method.invoke(null,geometrySource,geometryTarget);
            System.out.println(f);
            jarClassLoader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       // System.out.println("null:" + readWriteLicense.getLicenseName());
        // System.out.println("空字符" + StringHelper.isEmptyAndBlank(""));
        //System.out.println("空格字符" + StringHelper.isEmptyAndBlank(" "));
    }
}
