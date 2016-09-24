/**
 * Project Name : jwaf-exception <br>
 * File Name : DaoException.java <br>
 * Package Name : com.lee.jwaf.exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.exception;

/**
 * ClassName : DaoException <br>
 * Description : DAO Layer Exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com
 */
public class DaoException extends ServiceException {

    private static final long serialVersionUID = -8337205069248093424L;

    /**
     * Create a new instance of DaoException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param message the message
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Create a new instance of DaoException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param message the message
     * @param cause error cause
     */
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new instance of DaoException. <br>
     * {@code errLevel = ErrLevel.ERR}
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     */
    public DaoException(String code, String message) {
        super(code, message);
    }

    /**
     * Create a new instance of DaoException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     * @param cause error cause
     */
    public DaoException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    /**
     * Create a new instance of DaoException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param message the message
     */
    public DaoException(String code, ErrLevel level, String message) {
        super(code, level, message);
    }

    /**
     * Create a new instance of DaoException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param message the message
     * @param cause error cause
     */
    public DaoException(String code, ErrLevel level, String message, Throwable cause) {
        super(code, level, message, cause);
    }
}
