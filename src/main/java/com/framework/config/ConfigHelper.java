package com.framework.config;

import com.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 获取配置文件的配置项信息
 * @author jinmaoxu
 * @since 1.0.0
 */
public class ConfigHelper {
    // 加载配置文件
    private  static final Properties CONFIG_PROPERTIES = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);
    // 默认的JSP路径
    private static String DEFAULT_JSP_PATH = "/WEB-INF/view/";
    private static String DEFAULT_APP_ASSET_PATH = "/asset/";

    /**
     * 从配置文件中获取JDBD驱动
     * @return
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPERTIES,ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 从配置文件中获取URL
     * @return
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_URL);
    }

    /**
     * 从配置文件中获取数据库用户名
     * @return
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 从配置文件中获取数据库的密码
     * @return
     */
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用JSP路径
     * @return
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_BASE_PACKAGE, DEFAULT_JSP_PATH);
    }

    /**
     * 获取应用静态资源路径
     * @return
     */
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_BASE_PACKAGE, DEFAULT_APP_ASSET_PATH);
    }

}
