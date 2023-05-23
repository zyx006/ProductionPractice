package cn.czyx007.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/23 - 11:40
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/user")
    public ModelAndView showUser(){
        //接收器群
        System.out.println("成功接收到请求");
        //处理请求-不处理-将来要处理
        System.out.println("处理请求...不处理-将来要处理");
        //返回响应
        //ModelAndView封装数据和视图
        ModelAndView modelAndView = new ModelAndView();
        //1.封装数据
        modelAndView.addObject("userName", "blue");
        //2.封装视图
        modelAndView.setViewName("index");
        return modelAndView;
    }

//    @RequestMapping("/getUser")
    @GetMapping({"/getUser", "/findUser", "/user01"})
    public String getUser(Model model){
        model.addAttribute("address", "北京");
        return "show";
    }

    @GetMapping("/show")
    public String show(
            @RequestParam(value = "user", required = false, defaultValue = "liuyan") String userName,
            @RequestParam(value = "age", required = false, defaultValue = "20") Integer age,
            @RequestParam(value = "address", required = true) String address
    ){
        System.out.println("userName = " + userName);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
        return "index";
    }

    @PostMapping ("/showPost")
    public String showPost(
            @RequestParam(value = "user", required = false, defaultValue = "liuyan") String userName,
            @RequestParam(value = "age", required = false, defaultValue = "20") Integer age,
            @RequestParam(value = "address", required = true) String address
    ){
        System.out.println("userName = " + userName);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
        return "index";
    }

}
