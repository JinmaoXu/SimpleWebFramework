package com.framework.config;

import com.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 获取配置文件的配置项信息
 * @author jinmaoxu
 * @since 1.0.0
 */
public class ConfigHelper {
    //加载配置文件
    private  static final Properties CONFIG_PROPERTIES = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBD驱动
     * @return
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPERTIES,ConfigConstant.JDBC_DRIVER);
    }
}
