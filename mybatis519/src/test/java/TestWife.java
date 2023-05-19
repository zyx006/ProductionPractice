import cn.czyx007.mapper.WifeMapper;
import cn.czyx007.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/19 - 10:34
 */
public class TestWife {
    @Test
    public void test1(){
        WifeMapper mapper = SqlSessionUtil.getSqlSession().getMapper(WifeMapper.class);
        mapper.getWifeAll().forEach(System.out::println);
    }
}
