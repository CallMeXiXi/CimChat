package com.satan.cimchat.app;

/**
 * @version 1.0
 */
public interface Constant {

    // 服务端web地址
    public static final String SERVER_URL = "http://192.168.255.109:8080/ichat-server";
    // 服务端IP地址
    public static final String CIM_SERVER_HOST = "192.168.255.109";

    // 注意，这里的端口不是tomcat的端口，CIM端口在服务端spring-cim.xml中配置的，没改动就使用默认的23456
    public static final int CIM_SERVER_PORT = 8088;

    public static interface MessageType {

        // 用户之间的普通消息
        public static final String TYPE_0 = "0";

        //系统向用户发送的普通消息
        public static final String TYPE_2 = "2";

        // 下线类型
        String TYPE_999 = "999";
    }

    public static interface MessageStatus {

        // 消息未读
        public static final String STATUS_0 = "0";
        // 消息已经读取
        public static final String STATUS_1 = "1";
    }

}
