package study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.entity.User;
import study.mapper.UserMapper;

/**
 * Created by banma-317 on 2017/11/14.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
