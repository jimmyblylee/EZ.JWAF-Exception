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
     * 
     * @param message the message
     */
    public WarnException(String message) {
        super(message);
    }
}
