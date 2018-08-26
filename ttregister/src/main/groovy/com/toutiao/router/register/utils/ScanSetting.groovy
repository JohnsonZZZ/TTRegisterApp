package com.toutiao.router.register.utils
/**
 * register setting
 * @author billy.qi email: qiyilike@163.com
 * @since 17/3/28 11:48
 */
class ScanSetting {
    static final String PLUGIN_NAME = "com.toutiao.router"
    /**
     * The register code is generated into this class
     */
    static final String GENERATE_TO_CLASS_NAME = 'johnson/github/com/ttregisterapp/H5PageCenter'
    /**
     * you know. this is the class file(or entry in jar file) name
     */
    static final String GENERATE_TO_CLASS_FILE_NAME = GENERATE_TO_CLASS_NAME + '.class'
    /**
     * The register code is generated into this method
     */
    static final String GENERATE_TO_METHOD_NAME = 'register'
    /**
     * The package name of the class generated by the annotationProcessor
     */
    static final String ROUTER_CLASS_PACKAGE_NAME = 'johnson/github/com/ttregisterapp/'
    /**
     * The package name of the interfaces
     */
    private static final INTERFACE_PACKAGE_NAME = 'johnson/github/com/ttregisterapp/'

    /**
     * register method name in class: {@link #GENERATE_TO_CLASS_NAME}
     */
    static final String REGISTER_METHOD_NAME = 'register'
    /**
     * scan for classes which implements this interface
     */
    String interfaceName = ''

    /**
     * jar file which contains class: {@link #GENERATE_TO_CLASS_NAME}
     */
    File fileContainsInitClass
    /**
     * scan result for {@link #interfaceName}
     * class names in this list
     */
    ArrayList<String> classList = new ArrayList<>()

    /**
     * constructor for arouter-auto-register settings
     * @param interfaceName interface to scan
     */
    ScanSetting(String interfaceName){
        this.interfaceName = INTERFACE_PACKAGE_NAME + interfaceName
    }

}