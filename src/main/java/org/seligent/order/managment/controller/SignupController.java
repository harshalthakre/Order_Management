package org.seligent.order.managment.controller;
import org.seligent.order.managment.bean.User;
import org.seligent.order.managment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignupController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,value = "/signup")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
