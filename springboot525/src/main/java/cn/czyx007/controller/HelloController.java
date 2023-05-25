package cn.czyx007.controller;

import cn.czyx007.bean.Person;
import cn.czyx007.bean.User;
import cn.czyx007.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/25 - 14:55
 */
@RestController
public class HelloController {
    @Value("${person.username}")
    private String userName;

    @Autowired
    private Person person;

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<User> getUser(){
        return userService.findUser();
    }

    @GetMapping("/good")
    private String good(){
        System.out.println("userName = " + userName);
        return "good,springboot!!!";
    }

    @GetMapping("/person")
    public String person(){
        System.out.println("person = " + person);
        return "person";
    }
}
