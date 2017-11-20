package study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.entity.Customer;
import study.mapper.CustomerMapper;

/**
 * Created by banma-317 on 2017/11/14.
 */
@Service
public class CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    public String hello(String name) {
        return customerMapper.hello(name);
    }
}
