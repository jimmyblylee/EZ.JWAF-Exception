/**
 * Project Name : jwaf-exception <br>
 * File Name : AppException.java <br>
 * Package Name : com.lee.jwaf.exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * ClassName : AppException <br>
 * Description : Application Exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com
 */
public class AppException extends Throwable {

    private static final long serialVersionUID = 4998100661136469807L;

    private final String CNS_DEFAULT_ERR_CODE = "ERR-UNKNOWN-001";
    private String errCode = CNS_DEFAULT_ERR_CODE;

    /**
     * Create a new instance of AppException. <br>
     * {@code errCode = "ERR-UNKNOWN-001"}
     * 
     * @param message the message
     */
    public AppException(String message) {
        super(message);
    }

    /**
     * Create a new instance of AppException. <br>
     * {@code errCode = "ERR-UNKNOWN-001"}
     * 
     * @param message the message
     * @param cause error cause
     */
    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new instance of AppException. <br>
     * 
     * @param code error code string which will be managed by message.properties
     * @param messages the message
     */
    public AppException(String code, String messages) {
        super(messages);
        this.errCode = code;
    }

    /**
     * Create a new instance of AppException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param message the message
     * @param cause error cause
     */
    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.errCode = code;
    }

    /**
     * @return the errorCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * @param errCode the errorCode to set
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * Description : get strack string from exception trace <br>
     * Create Time: 2016-09-17 <br>
     * Create by : jimmyblylee@126.com <br>
     *
     * @return exception stack as one single string
     */
    public String getStackString() {
        String exceptionStack = "";
        if (this.getCause() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            try {
                this.printStackTrace(pw);
                exceptionStack = sw.toString();
            } finally {
                try {
                    sw.close();
                    pw.close();
                } catch (Exception e) {
                    // ignore
                }
            }
        }
        return exceptionStack;
    }
}
