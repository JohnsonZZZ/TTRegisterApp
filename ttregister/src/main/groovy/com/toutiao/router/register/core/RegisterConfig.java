package com.toutiao.router.register.core;

import java.io.File;
import java.util.ArrayList;

public class RegisterConfig {
    File fileContainsInitClass; //initClassName的class文件或含有initClassName类的jar文件
    ArrayList<String> classList = new ArrayList<>();
    String interfaceName;
    ArrayList<RegisterConfig> configList = new ArrayList<>();

    /**
     *插件名称
     */
    static final String PLUGIN_NAME = "com.toutiao.router";
    /**
     * 基础包目录
     */
    static final String GENERATE_PACKAGE_INTERFACE = "com/toutiao/router/register/baselib/";
    /**
     * 代码注册管理类
     */
    static final String GENERATE_REGISTER_CLASS= "com/toutiao/router/register/baselib/H5RegisterManager";

    RegisterConfig(String interfaceName) {
        this.interfaceName = GENERATE_PACKAGE_INTERFACE + interfaceName;
    }


}
