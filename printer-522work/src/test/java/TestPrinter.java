import cn.czyx007.bean.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 18:23
 */
public class TestPrinter {
    @Test
    public void test(){
        //在spring配置文件spring.xml中通过依赖注入组装打印机
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Printer printer = context.getBean("printer", Printer.class);
        printer.printDocument();
    }
}
