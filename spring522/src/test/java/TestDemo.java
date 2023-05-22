import cn.czyx007.bean.Dog;
import cn.czyx007.bean.User;
import cn.czyx007.service.impl.OracleUserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:31
 */
public class TestDemo {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Dog dog = app.getBean("dog", Dog.class);
        dog.eat();
        Dog dog1 = app.getBean("dog", Dog.class);
        System.out.println("是否是同一个对象 " + (dog == dog1));
    }

    //要注意交给spring管理后不能再自己new
    @Test
    public void test2(){
        OracleUserServiceImpl userService = new OracleUserServiceImpl();
        User user = userService.findUserById("1");
        System.out.println("user = " + user);
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        OracleUserServiceImpl userService = app.getBean("oracleUserService", OracleUserServiceImpl.class);
        User user = userService.findUserById("1");
        System.out.println("user = " + user);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        User user = app.getBean("user", User.class);
        System.out.println("user = " + user);
    }
}
