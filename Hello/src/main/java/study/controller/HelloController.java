package study.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by banma-317 on 2017/11/14.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello " + name + ", this is first message.";
    }
}
