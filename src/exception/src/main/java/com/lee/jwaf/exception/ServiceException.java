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
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String formatedMessage, Object... vars) {
        super(formatedMessage, vars);
    }

    /**
     * Create a new instance of ServiceException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String formatedMessage, Throwable cause, Object... vars) {
        super(formatedMessage, cause, vars);
    }

    /**
     * Create a new instance of ServiceException. <br>
     * {@code errLevel = ErrLevel.ERR}
     * 
     * @param code error code string which will be managed by message.properties
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String code, String formatedMessage, Object... vars) {
        super(code, formatedMessage, vars);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String code, String formatedMessage, Throwable cause, Object... vars) {
        super(code, formatedMessage, cause, vars);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String code, ErrLevel level, String formatedMessage, Object... vars) {
        super(code, level, formatedMessage, vars);
    }

    /**
     * Create a new instance of ServiceException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public ServiceException(String code, ErrLevel level, String formatedMessage, Throwable cause, Object... vars) {
        super(code, level, formatedMessage, cause, vars);
    }
}
