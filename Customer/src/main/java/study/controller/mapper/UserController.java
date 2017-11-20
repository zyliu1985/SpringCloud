package study.controller.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.entity.User;
import study.mapper.UserMapper;
import study.service.UserService;

/**
 * Created by banma-317 on 2017/11/14.
 */
@RestController
public class UserController {
    static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    //UserMapper userMapper;

    @RequestMapping("/user/name/{name}")
    public User getName(@PathVariable("name") String name) {
        logger.trace("this is a trace message.");
        logger.debug("this is a debug message.");
        logger.info("this is a info message.");
        logger.warn("this is a warn message.");
        logger.error("this is a error message.");
        return userService.findUserByName(name);
    }

    @RequestMapping("/user/id/{id}")
    public User getName(@PathVariable("id") int id) {
        return userService.findUserById(id);
    }
}
