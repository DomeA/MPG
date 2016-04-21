package com.domeastudio.rest.license;

import com.domeastudio.util.IpHostHelper;
import com.domeastudio.util.PropertyHelper;

/**
 * Created by domea on 16-4-15.
 */
public class ReadWriteLicense {
    private IpHostHelper ipHostHelper;
    private String host ;
    private String ip ;

    public String getKey() {
        return PropertyHelper.getProperty(getPath("/license/license.lic"), "Customer_key");
    }

    public void setKey(String key) {
        PropertyHelper.setProperty(getPath("/license/license.lic"), "Customer_key",key);
    }

    public String getNumber() {
        return PropertyHelper.getProperty(getPath("/license/license.lic"), "License_number");
    }

    public void setNumber(String number) {
        PropertyHelper.setProperty(getPath("/license/license.lic"), "License_number",number);
    }

    private static class SingletonHolder {
        private static final ReadWriteLicense INSTANCE = new ReadWriteLicense();
    }
    private ReadWriteLicense (){
        ipHostHelper = IpHostHelper.getInstance();
        host=ipHostHelper.getHostName();
        ip=ipHostHelper.getHostIp();
    }

    /**
     * 获取当前实例
     * @return 获取当前对象的实例，是线程安全的
     */
    public static final ReadWriteLicense getInstance() {
        return ReadWriteLicense.SingletonHolder.INSTANCE;
    }



    public String getLicenseName() {
        if (!PropertyHelper.getProperty(getPath("/license/license.lic"), "Server").equals(host) && !PropertyHelper.getProperty(getPath("/license/license.lic"), "Server").equals(ip)) {
            setLicenseName();
        }
        return PropertyHelper.getProperty(getPath("/license/license.lic"), "Server");
    }

    private String getPath(String path){
        return getClass().getResource(path).getPath();
    }
    private void setLicenseName() {
        PropertyHelper.setProperty(getPath("/license/license.lic"), "Server", host);
    }


    public static void main(String [] args){
        ReadWriteLicense readWriteLicense=ReadWriteLicense.getInstance();
        System.out.println("null:" + readWriteLicense.getLicenseName());
       // System.out.println("空字符" + StringHelper.isEmptyAndBlank(""));
        //System.out.println("空格字符" + StringHelper.isEmptyAndBlank(" "));
    }
}
