package study.mapper;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.Hystrix.UserHystrix;
import study.entity.User;

/**
 * Created by banma-317 on 2017/11/14.
 */
@FeignClient(name="spring-cloud-producer", fallback = UserHystrix.class)
public interface UserMapper {
    @RequestMapping(value = "/user/name")
    public User findUserByName(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/user/id")
    public User findUserById(@RequestParam(value = "id") int id);
}
