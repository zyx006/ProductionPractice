package cn.czyx007.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/25 - 14:57
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String userName;
    private String password;
    private String address;
    private Integer age;
    private String email;
}
