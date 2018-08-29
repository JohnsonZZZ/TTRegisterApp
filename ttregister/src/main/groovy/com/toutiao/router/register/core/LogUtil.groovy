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

    static void q(String quiet) {
        if (logger) {
            logger.quiet("TTRouter>>> " + quiet)
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

    static void w(String warn) {
        if (logger) {
            logger.warn("TTRouter>>> " + warn)
        }
    }

}