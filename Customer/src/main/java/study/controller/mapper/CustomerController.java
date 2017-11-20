package study.controller.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.entity.Customer;
import study.service.CustomerService;

/**
 * Created by banma-317 on 2017/11/14.
 */

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name) {
        return customerService.hello(name);
    }
}
