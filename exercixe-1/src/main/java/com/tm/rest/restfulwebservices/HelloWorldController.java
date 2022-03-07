package com.tm.rest.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    //method to return "hellow world"
    //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){


        return "Hello To Spring-Boot";
    }
}
