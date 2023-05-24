package cn.czyx007.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/24 - 15:47
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot!!!";
    }

    @GetMapping("/good")
    public String good(){
        return "good,springboot!";
    }
}
