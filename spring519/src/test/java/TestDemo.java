import cn.czyx007.bean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/19 - 16:00
 */
public class TestDemo {
    @Test
    public void test1(){
        Dog dog = new Dog("xxx");
        dog.eat();
    }

    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Dog dog = app.getBean("dog", Dog.class);
//        dog.setName("xxx");
        dog.eat();
    }
}
