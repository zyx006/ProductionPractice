package cn.czyx007.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/23 - 15:18
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/getUser")
    public String getUser(){
        return "show";
    }
}
