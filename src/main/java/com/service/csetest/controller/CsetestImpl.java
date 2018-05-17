package com.service.csetest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-17T02:59:55.536Z")

@RestSchema(schemaId = "csetest")
@RequestMapping(path = "/cseTest", produces = MediaType.APPLICATION_JSON)
public class CsetestImpl {

    @Autowired
    private CsetestDelegate userCsetestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsetestDelegate.helloworld(name);
    }

}
