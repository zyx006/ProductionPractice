package cn.czyx007.mvc.controller;

import cn.czyx007.mvc.bean.Condition;
import cn.czyx007.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

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


    @PostMapping("/showCondition")
    public String showCondition(Condition condition){
        System.out.println("codnition = " + condition);
        return "index";
    }

    @PostMapping("/showMap")
    public String showMap(@RequestParam Map<String,Object> map){
        Set<Map.Entry<String,Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        return "index";
    }

    //Restful风格传递数据
    @GetMapping("/showRestful/{id}/{userName}")
    public String showRestful(@PathVariable("id") Integer id,
                              @PathVariable("userName") String name){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        return "index";
    }

    @GetMapping("/showView")
    public String showView(Model model){
        User user = new User(1003, "柳岩", "ly@163.com");
        model.addAttribute("user", user);
        return "showUser";
    }

    @GetMapping("/showViewList")
    public String showViewList(Model model){
        List<User> users = Arrays.asList(
                new User(1003, "柳岩", "ly@163.com"),
                new User(1004, "柳岩2", "ly2@163.com"),
                new User(1005, "柳岩3", "ly3@163.com")
        );
        model.addAttribute("userList", users);
        return "showUserList";
    }

    @GetMapping("/showServlet")
    public String showServlet(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpSession session,
                              ServletContext context,
                              PageContext pageContext){
        return "show";
    }

    @GetMapping("/showViewMap")
    public String showViewMap(Map<String,Object> map){
        User user = new User(1003, "柳岩-map", "ly@163.com");
        map.put("user", user);
        return "showUser";
    }
}
