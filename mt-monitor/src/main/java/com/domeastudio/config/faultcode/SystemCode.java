package com.domeastudio.config.faultcode;

import org.apache.log4j.Logger;
import java.io.*;
import java.util.Properties;

/**
 * Created by domea on 16-4-10.
 */
public final class SystemCode implements Serializable {
    private static Logger logger = Logger.getLogger(SystemCode.class);
    private String message;
    private String code;

    public SystemCode getSystemCode(String code) {
        Properties properties = new Properties();
        try {

            String filePath=getFilePath();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"utf-8");
            //noinspection Since15
            properties.load(inputStreamReader);
            String value = properties.getProperty(code);
            SystemCode systemCode=new SystemCode();
            systemCode.setCode(code);
            systemCode.setMessage(value);
            inputStreamReader.close();
            return systemCode;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private String getFilePath(){
        String filePath = SystemCode.class.getResource("/").getPath()+"system_code.properties";
                //SystemCode.class.getClassLoader().getResource("system_code.properties").getFile();
        //getClass().getResource("system_code.properties");
        return filePath;
    }
    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code+":"+message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void main(String[] args){
        SystemCode systemCode=new SystemCode();
        SystemCode d=systemCode.getSystemCode("mpg_10000");
        System.out.print(d.toString());
    }
}
