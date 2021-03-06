package com.toutiao.router.register.core

import org.gradle.api.Project
class AutoRegisterConfig {

    public ArrayList<Map<String, Object>> registerInfo = []

    ArrayList<RegisterInfo> infoList = new ArrayList<>()

    Project project

    AutoRegisterConfig(){}

    void convertConfig() {
        registerInfo.each { map ->
            RegisterInfo info = new RegisterInfo()
            info.interfaceName = map.get('scanInterface')
            def superClasses = map.get('scanSuperClasses')
            if (!superClasses) {
                superClasses = new ArrayList<String>()
            } else if (superClasses instanceof String) {
                ArrayList<String> superList = new ArrayList<>()
                superList.add(superClasses)
                superClasses = superList
            }
            info.superClassNames = superClasses
            info.initClassName = map.get('codeInsertToClassName') //代码注入的类
            info.initMethodName = map.get('codeInsertToMethodName') //代码注入的方法（默认为static块）
            info.registerMethodName = map.get('registerMethodName') //生成的代码所调用的方法
            info.registerClassName = map.get('registerClassName') //注册方法所在的类
            info.include = map.get('include')
            info.exclude = map.get('exclude')
            info.init()
            if (info.validate())
                infoList.add(info)
            else {
                LogUtil.e('register config error: scanInterface, codeInsertToClassName and ' +
                        'registerMethodName should not be null\n' + info.toString())
            }

        }
    }

    void reset() {
        infoList.each { info ->
            info.reset()
        }
    }

    @Override
    String toString() {
        StringBuilder sb = new StringBuilder(RegisterPlugin.EXT_NAME).append(' [\n')
        def size = infoList.size()
        for (int i = 0; i < size; i++) {
            sb.append('\t' + infoList.get(i).toString().replaceAll('\n', '\n\t'))
            if (i < size - 1)
                sb.append(',\n')
        }
        sb.append('\n]')
        return sb.toString()
    }
}