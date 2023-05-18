import cn.czyx007.mapper.StudentMapper;
import cn.czyx007.mapper.UsersMapper;
import cn.czyx007.utils.SqlSessionUtil;
import org.junit.Test;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/18 - 10:04
 */
public class TestUsers {
    @Test
    public void test(){
        UsersMapper usersMapper = SqlSessionUtil.getSqlSession().getMapper(UsersMapper.class);
        usersMapper.getUsersAndOrders().forEach(System.out::println);
    }
    @Test
    public void test1(){
        StudentMapper studentMapper = SqlSessionUtil.getSqlSession().getMapper(StudentMapper.class);
        studentMapper.getStudent().forEach(System.out::println);
    }
}
