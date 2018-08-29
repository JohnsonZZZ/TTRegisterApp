package com.toutiao.router.register.core

import org.gradle.api.Project
import org.gradle.api.logging.Logger

public class LogUtil{
    static Logger logger

    static void initLogger(Project project) {
        if (project) {
            logger = project.getLogger()
        }
    }
    static void i(String info) {
        if (logger) {
            logger.info("TTRouter>>> " + info)
        }
    }

    static void e(String error) {
        if (logger) {
            logger.error("TTRouter>>> " + error)
        }
    }
}