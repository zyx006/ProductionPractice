import cn.czyx007.bean.TbBrand;
import cn.czyx007.service.TbBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 16:02
 */
@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class TestDemo {
    @Autowired
    TbBrandService brandService;

    @Test
    public void test1(){
        TbBrand tbBrand = brandService.queryById(5);
        System.out.println("tbBrand = " + tbBrand);
    }
}
