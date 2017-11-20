package study.Hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import study.entity.User;
import study.mapper.UserMapper;

/**
 * Created by banma-317 on 2017/11/15.
 */
@Component
public class UserHystrix implements UserMapper {
    @Override
    public User findUserByName(@RequestParam(value = "name") String name) {
        User user = new User();
        user.setName("NOT EXIST");
        return user;
    }

    @Override
    public User findUserById(@RequestParam(value = "id") int id) {
        User user = new User();
        user.setName("NOT EXIST");
        return user;
    }
}
