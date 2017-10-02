package com.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 配置文件中的属性配置项解析工具类
 */
public class PropsUtil {
    private  static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载配置文件
     * @param filename
     * @return
     */
    public static Properties loadProps(String filename){
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
            if(inputStream == null)
                throw new FileNotFoundException(filename + "can not find this file");
            properties = new Properties();
            properties.load(inputStream);
        }catch (IOException e){
            LOGGER.error("load properties file failure", e);
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return  properties;
    }

    /**
     * 获取配置项的具体信息，如果配置项不存在，使用默认值
     * @param properties
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties properties, String key, String defaultValue){
        String value = defaultValue;
        if(properties.contains(key)){
            value = properties.getProperty(key);
        }
        return value;
    }

    /**
     * 获取配置项的具体信息
     * @param properties
     * @param key
     * @return
     */
    public static String getString(Properties properties, String key){
        return getString(properties, key, "");
    }
}
