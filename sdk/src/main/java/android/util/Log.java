package android.util;

import org.slf4j.LoggerFactory;

public final class Log {

    public static void d(String tag, String message) {
        LoggerFactory.getLogger(tag).debug(message);
    }

    public static void i(String tag, String message) {
        LoggerFactory.getLogger(tag).info(message);
    }

    public static void w(String tag, String message) {
        LoggerFactory.getLogger(tag).warn(message);
    }

    public static void e(String tag, String message) {
        LoggerFactory.getLogger(tag).warn(message);
    }

    public static void wtf(String tag, String message, Exception e) {
        LoggerFactory.getLogger(tag).error(message, e);
    }

}
