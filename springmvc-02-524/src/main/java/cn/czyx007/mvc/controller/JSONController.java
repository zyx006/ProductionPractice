package cn.czyx007.mvc.controller;

import cn.czyx007.mvc.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/24 - 10:52
 */
//@Controller
@RestController
public class JSONController {

//    @ResponseBody
    @GetMapping("/json")
    public String showJson(){
        return "hello,json!!!";
    }

    @GetMapping("/json2")
//    @ResponseBody
    public Boolean showJson2(){
        return true;
    }

    @GetMapping("/getUser")
//    @ResponseBody
    public User getUSer(){
        return new User(1006, "迪丽热巴", "rb@163.com");
    }

    @GetMapping("/getUserList")
//    @ResponseBody
    public List<User> getUserList(){
        List<User> users = Arrays.asList(
                new User(1003, "柳岩", "ly@163.com"),
                new User(1004, "柳岩2", "ly2@163.com"),
                new User(1005, "柳岩3", "ly3@163.com")
        );
        return users;
    }

    /**
     * data：封装数据 List<User>
     * msg：数据返回成功/失败
     * code：200/500
     * Map自动转换为JSON格式
     */
    @GetMapping("/getUserMap")
//    @ResponseBody
    public Map<String,Object> getUserMap(){
        Map<String,Object> map = null;
        try {
            map = new HashMap<>();
            List<User> users = Arrays.asList(
                    new User(1003, "柳岩", "ly@163.com"),
                    new User(1004, "柳岩2", "ly2@163.com"),
                    new User(1005, "柳岩3", "ly3@163.com")
            );
            map.put("data", users);
            map.put("msg", "数据返回成功");
            map.put("code", 200);
        } catch (Exception e){
            e.printStackTrace();
            map.put("data", null);
            map.put("msg", "数据返回失败");
            map.put("code", 500);
        }
        return map;
    }

    @PostMapping("/getUserJson")
    public String getUserJson(@RequestBody User user){
        System.out.println("user = " + user);
        return "ok";
    }
}
