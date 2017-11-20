package study.mapper;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.entity.User;

/**
 * Created by banma-317 on 2017/11/14.
 */

@FeignClient(name= "spring-cloud-producer")
public interface CustomerMapper {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
