package com.domeastudio.util;

import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by domea on 16-4-15.
 */
public class IpHostHelper {
    private static Logger logger = Logger.getLogger(IpHostHelper.class);
    private static InetAddress inetAddress;
    private static class SingletonHolder {
        private static final IpHostHelper INSTANCE = new IpHostHelper();
    }
    private IpHostHelper (){
        inetAddress=getInetAddress();
    }
    /**
     * 获取当前实例
     * @return 获取当前对象的实例，是线程安全的
     */
    public static final IpHostHelper getInstance() {
        return IpHostHelper.SingletonHolder.INSTANCE;
    }

    private InetAddress getInetAddress(){
        try{
            return InetAddress.getLocalHost();
        }catch(UnknownHostException e){
            logger.error("get inetaddress failed.",e);
            throw new RuntimeException("get inetaddress failed.");
        }
    }

    public String getHostIp(){
        if(null == inetAddress){
            return null;
        }
        String ip = inetAddress.getHostAddress(); //get the ip address
        return ip;
    }

    public String getHostName(){
        if(null == inetAddress){
            return null;
        }
        String name = inetAddress.getHostName(); //get the host address
        return name;
    }

    public static void main(String [] args){
        IpHostHelper ipHostHelper=IpHostHelper.getInstance();
        System.out.println("host ip:" + ipHostHelper.getHostIp());
        System.out.println("host name:" + ipHostHelper.getHostName());
    }
}
