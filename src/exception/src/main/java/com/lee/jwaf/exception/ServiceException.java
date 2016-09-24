/**
 * Project Name : jwaf-exception <br>
 * File Name : ServiceException.java <br>
 * Package Name : com.lee.jwaf.exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.exception;

/**
 * ClassName : ServiceException <br>
 * Description : Service Layer Exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com
 */
public class ServiceException extends AppException {

    private static final long serialVersionUID = 5850704921792051901L;

    /**
     * Create a new instance of ServiceException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param message the message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Create a new instance of ServiceException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param message the message
     * @param cause error cause
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new instance of ServiceException. <br>
     * {@code errLevel = ErrLevel.ERR}
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     */
    public ServiceException(String code, String message) {
        super(code, message);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param message messages formated with "{}" to fill with given parameter
     * @param cause error cause
     */
    public ServiceException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param message the message
     */
    public ServiceException(String code, ErrLevel level, String message) {
        super(code, level, message);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param message the message
     * @param cause error cause
     */
    public ServiceException(String code, ErrLevel level, String message, Throwable cause) {
        super(code, level, message, cause);
    }
}
