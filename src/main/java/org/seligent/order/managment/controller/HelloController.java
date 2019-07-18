package org.seligent.order.managment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// when spring starts up it start scan in classpath and find controllers
// the request controller is registered
@RestController
@RequestMapping("/secure")
public class HelloController {

    @RequestMapping("/hello") // maps by default to GET method
    public String greet(){
         return "hello";
    }
}
