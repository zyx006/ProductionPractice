import cn.czyx007.bean.Computers;
import cn.czyx007.mapper.ComputersMapper;
import cn.czyx007.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/18 - 15:01
 */
public class TestComputers {
    @Test
    public void test1(){
        ComputersMapper computersMapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setBrand("联想");
        computers.setStartPrice(5000F);
        computersMapper.queryByConditionIf(computers).forEach(System.out::println);
    }

    @Test
    public void test2(){
        ComputersMapper computersMapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setPrice(12000F);
        computers.setId(2L);
        System.out.println(computersMapper.updateByConditionSet(computers));
    }

    @Test
    public void test3(){
        ComputersMapper computersMapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setBrand("联想");
        computers.setEndPrice(10000f);
        computersMapper.queryByConditionChoose(computers).forEach(System.out::println);
    }
    @Test
    public void test4(){
        ComputersMapper computersMapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setBrand("联想");
        computers.setStartPrice(5000f);
        computersMapper.queryByConditionTrim(computers).forEach(System.out::println);
    }
    @Test
    public void test5(){
        ComputersMapper computersMapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setPrice(16000f);
        computers.setId(2L);
        System.out.println(computersMapper.updateByConditionTrim(computers));
    }
}
