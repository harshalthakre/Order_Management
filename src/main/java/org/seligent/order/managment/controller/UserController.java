package org.seligent.order.managment.controller;

import org.seligent.order.managment.bean.User;
import org.seligent.order.managment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secure")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/users")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user/{userId}")
    @PreAuthorize("hasAuthority('user'+#userId)")
    public User getUserById(@PathVariable @Param("userId") int userId){
        return userService.getUser(userId);
    }
}
