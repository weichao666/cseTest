package com.service.csetest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsetest {

        CsetestDelegate csetestDelegate = new CsetestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csetestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}