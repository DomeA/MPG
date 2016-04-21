package com.domeastudio.util;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


/**
 * Created by domea on 16-4-15.
 */
public class PropertyHelper {
    private static Logger logger = Logger.getLogger(PropertyHelper.class);

    private static File isExists(String path) {
        File file = new File(path);
        try {
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e) {
            logger.error("property file is not exist.'" + path + "' is not exist", e);
            return null;
        }
    }

    public static String getProperty(String path, String key) {
        try {
            File file = isExists(path);
            if (null != file && !StringHelper.isEmptyAndBlank(key)) {
                Properties props = new Properties();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                props.load(in);
                String value = props.getProperty(key);
                return value;
            }
            return null;
        } catch (Exception e) {
            logger.error("failed to find " + key + " value from '" + path + "'", e);
            return null;
        }
    }

    public static Boolean setProperty(String path, String key, String value) {
        try {
            File file = isExists(path);
            if (null != file && !StringHelper.isEmptyAndBlank(key) && !StringHelper.isEmptyAndBlank(value)) {
                Properties props = new Properties();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                props.load(in);

                OutputStream fos = new FileOutputStream(file);
                props.setProperty(key, value);
                props.store(fos, "Update '" + key + "' value");
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.error("update '" + key + "'='" + value + "' failed to '" + path + "'", e);
            return false;
        }
    }

    public static Boolean setProperties(String path, Map<String, String> property) {
        try {
            File file = isExists(path);
            if (null != file && null != property && property.size() > 0) {
                Properties props = new Properties();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                props.load(in);
                OutputStream fos = new FileOutputStream(file);
                Iterator<Map.Entry<String, String>> iterator = property.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                    props.setProperty(entry.getKey(), entry.getValue());
                    props.store(fos, "Update '" + entry.getKey() + "' value");
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.error("failed to update the property map collection in the '" + path + "'", e);
            return false;
        }
    }

    public static Boolean removeProperty(String path, String key) {
        try {
            File file = isExists(path);
            if (null != file && !StringHelper.isEmptyAndBlank(key)) {
                Properties props = new Properties();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                props.load(in);
                OutputStream fos = new FileOutputStream(file);
                props.remove(key);
                props.store(fos, "remove '" + key + "' value");
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.error("failed to remvoe " + key + " value from '" + path + "'", e);
            return false;
        }
    }
}
