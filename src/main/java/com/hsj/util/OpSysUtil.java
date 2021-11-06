package com.hsj.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hsj
 * @description:
 * @date 2021/8/24 17:24
 */
@Slf4j
public final class OpSysUtil {
   public static boolean isWindows(){
       String os = System.getProperty("os.name");
       if(os.toLowerCase().startsWith("win")){
          return true;
       }
       return false;
   }

    public static void main(String[] args) {
        log.info("{}",isWindows());
    }
}
