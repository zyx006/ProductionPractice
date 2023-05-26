package cn.czyx007;

import cn.czyx007.bean.User;
import cn.czyx007.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        //开启分页查询
        PageHelper.startPage(1,2);
        //查询数据
        List<User> user = userService.findUser();
        PageInfo<User> pageInfo = new PageInfo<>(user);
        List<User> list = pageInfo.getList();
        list.forEach(System.out::println);

        System.out.println("页数 = " + pageInfo.getPages());
    }

}
