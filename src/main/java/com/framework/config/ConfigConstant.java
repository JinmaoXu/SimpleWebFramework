package com.framework.config;

/**
 * 配置文件的配置项常量类
 * @author jinmaoxu
 * @since 1.0.0
 */
public interface ConfigConstant {
    String CONFIG_FILE = "SimpleWebFramework.properties";

    String JDBC_DRIVER = "SimpleWebFramework.framework.jdbc.driver";
    String JDBC_URL = "SimpleWebFramework.framework.jdbc.url";
    String JDBC_USERNAME = "SimpleWebFramework.framework.jdbc_username";
    String JDBC_PASSWORD = "SimpleWebFramework.framework.password";
    // 项目的基础包名
    String APP_BASE_PACKAGE = "SimpleWebFramework.framework.app.base_package";
    // JSP基础路径
    String APP_JSP_PATH = "SimpleWebFramework.framework.app.jsp_path";
    // 静态资源文件的基础路径
    String APP_ASSET_PATH = "SimpleWebFramework.framework.app.asset_path";
}
