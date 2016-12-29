package com.zkw.exception.implementdemo;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class LogConfigurationException extends RuntimeException {
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    public LogConfigurationException(Throwable cause) {
        super(cause);
    }

    public LogConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogConfigurationException(String message) {
        super(message);
    }

    public LogConfigurationException() {
        super();
    }
}
