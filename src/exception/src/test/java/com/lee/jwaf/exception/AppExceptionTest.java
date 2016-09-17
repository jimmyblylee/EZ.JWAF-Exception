/**
 * Project Name : jwaf-exception <br>
 * File Name : AppExceptionTest.java <br>
 * Package Name : com.lee.jwaf.exception <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.exception;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * ClassName : AppExceptionTest <br>
 * Description : unit test for AppException <br>
 * Create Time : 2016-09-17 <br>
 * Create by : jimmyblylee@126.com
 */
public class AppExceptionTest {

    @Test
    public void testGetMessage() {
        assertThat(new AppException("{} should be a {}.", 123, "number").getMessage(), is("123 should be a number."));
        assertThat(new AppException("{} should be a {}.", 123).getMessage(), is("123 should be a {}."));
        assertThat(new AppException("{} should be a Integer.", 123, "number").getMessage(), not("123 should be a number."));
        assertThat(new AppException("{} should be a Integer.", 123, "number").getMessage(), is("123 should be a Integer."));
    }
}
