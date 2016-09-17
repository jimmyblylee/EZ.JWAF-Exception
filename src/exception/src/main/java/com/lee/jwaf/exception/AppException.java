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

    private final String CNS_DEFAULT_ERR_CODE = "ERR-UNKNOWN-01";
    private String errCode = CNS_DEFAULT_ERR_CODE;
    private ErrLevel errLevel = ErrLevel.ERR;
    private Object[] vars;

    /**
     * Create a new instance of AppException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String formatedMessage, Object... vars) {
        super(formatedMessage);
        this.vars = vars;
    }

    /**
     * Create a new instance of AppException. <br>
     * {@code errCode = "ERR-UNKNOWN-01" and errLevel = ErrLevel.ERR}
     * 
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String formatedMessage, Throwable cause, Object... vars) {
        super(formatedMessage, cause);
        this.vars = vars;
    }

    /**
     * Create a new instance of AppException. <br>
     * {@code errLevel = ErrLevel.ERR}
     * 
     * @param code error code string which will be managed by message.properties
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String code, String formatedMessage, Object... vars) {
        super(formatedMessage);
        this.errCode = code;
        this.vars = vars;
    }

    /**
     * Create a new instance of AppException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String code, String formatedMessage, Throwable cause, Object... vars) {
        super(formatedMessage, cause);
        this.errCode = code;
        this.vars = vars;
    }

    /**
     * Create a new instance of AppException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String code, ErrLevel level, String formatedMessage, Object... vars) {
        super(formatedMessage);
        this.errCode = code;
        this.errLevel = level;
        this.vars = vars;
    }

    /**
     * Create a new instance of AppException.
     * 
     * @param code error code string which will be managed by message.properties
     * @param level error level by enum {@link ErrLevel#WARN} or {@link ErrLevel#ERR}
     * @param formatedMessage messages formated with "{}" to fill with given parameter
     * @param cause error cause
     * @param vars vars for formated error message. " this {} should be {} ", e.g.
     */
    public AppException(String code, ErrLevel level, String formatedMessage, Throwable cause, Object... vars) {
        super(formatedMessage, cause);
        this.errCode = code;
        this.errLevel = level;
        this.vars = vars;
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
     * @return the errorLevel
     */
    public ErrLevel getErrLevel() {
        return errLevel;
    }

    /**
     * @param level the level to set
     */
    public void setErrLevel(ErrLevel level) {
        this.errLevel = level;
    }

    /**
     * Description : return the formated message replaced with given vars by "{}" <br>
     * Create Time : Apr 12, 2016 <br>
     * Create by : xiangyu_li@asdc.com.cn <br>
     * 
     * @return formated string by replaced the {} with vars
     */
    @Override
    public String getMessage() {
        String msg = super.getMessage();
        if (vars != null && vars.length > 0) {
            for (Object var : vars) {
                if (var != null) {
                    msg = msg.replaceFirst("\\{\\}", var.toString());
                }
            }
        }
        return msg;
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
