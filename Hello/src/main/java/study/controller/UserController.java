package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.Entity.User;
import study.service.UserService;


/**
 * Created by banma-317 on 2017/11/14.
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/user/id")
    public User findUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/user/name")
    public User findUserByName(@RequestParam("name") String  name) {
        return userService.findUserByName(name);
    }

}
