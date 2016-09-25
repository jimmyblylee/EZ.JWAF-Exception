/**
 * Project Name : jwaf-exception <br>
 * File Name : WarnException.java <br>
 * Package Name : com.lee.jwaf.exception <br>
 * Create Time : 2016-09-24 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.exception;

/**
 * ClassName : WarnException <br>
 * Description : warning exception <br>
 * Create Time : 2016-09-24 <br>
 * Create by : jimmyblylee@126.com
 */
public class WarnException extends AppException {

    private static final long serialVersionUID = 3209727266691050224L;

    /**
     * Create a new instance of WarnException. <br>
     * {@code errCode = "ERR-UNKNOWN-001"}
     * 
     * @param message the message
     */
    public WarnException(String message) {
        super(message);
    }

    /**
     * Create a new instance of WarnException. <br>
     * {@code errCode = "ERR-UNKNOWN-001"}
     * 
     * @param message the message
     * @param cause error cause
     */
    public WarnException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new instance of WarnException. <br>
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     */
    public WarnException(String code, String message) {
        super(code, message);
    }

    /**
     * Create a new instance of WarnException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     * @param cause error cause
     */
    public WarnException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
