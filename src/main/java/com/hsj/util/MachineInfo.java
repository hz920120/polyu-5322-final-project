package com.hsj.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hsj
 * @description:本机信息
 * @date 2021/8/13 16:54
 */
@Slf4j
public class MachineInfo {
    /**
     * @Description:获取本机ip地址
     * @author HeShengjin 2356899074@qq.com
     * @date 2021/8/13 16:55
     */
    public static String getLocalHostIp(){
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return StringUtils.EMPTY;
        }
        return addr.getHostAddress();
    }

}
