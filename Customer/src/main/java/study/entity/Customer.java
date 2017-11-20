package study.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by banma-317 on 2017/11/14.
 */
@EntityScan
public class Customer {
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
