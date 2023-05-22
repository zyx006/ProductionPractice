import cn.czyx007.bean.User;
import cn.czyx007.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 11:44
 */
public class TestDemo {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        UserServiceImpl userService = app.getBean("userService", UserServiceImpl.class);
        User user = userService.findUserById("1");
        System.out.println("user = " + user);
    }
}
