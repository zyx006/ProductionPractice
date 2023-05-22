package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String id;
    //注意是spring包下的，不是lombok的
    @Value("xxx")
    private String userName;
    private String address;
    private Integer age;
}
