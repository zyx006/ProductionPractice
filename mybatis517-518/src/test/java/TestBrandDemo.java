import cn.czyx007.mapper.BrandMapper;
import cn.czyx007.utils.SqlSessionUtil;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 14:22
 */
@Log4j
public class TestBrandDemo {
    static BrandMapper brandMapper = SqlSessionUtil.getSqlSession().getMapper(BrandMapper.class);

    @Test
    public void testGetAll(){
        brandMapper.getBrandAll().forEach(System.out::println);
    }
}
