package com.tm.rest.restfulwebservices;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {


    //method to return "hellow world"
    //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){


        return new HelloWorldBean("Hello to Spring-Boot");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){


        return new HelloWorldBean(String.format("Hello to Spring-Boot, %s ",name));
    }

}
