import cn.czyx007.bean.Emp;
import cn.czyx007.mapper.EmpMapper;
import cn.czyx007.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/16 - 14:14
 */
public class TestDemo {
    @Test
    public void testGetAll(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        empMapper.getAll().forEach(System.out::println);
    }

    @Test
    public void testInsertEmp(){
        Emp emp = new Emp();
        emp.setEname("test1");
        emp.setEsex("男");
        emp.setEstartime(new Date());
        EmpMapper empMapper = SqlSessionUtil.getSqlSession().getMapper(EmpMapper.class);
        System.out.println(empMapper.insertEmp(emp));
    }

    @Test
    public void testDelete(){
        EmpMapper empMapper = SqlSessionUtil.getSqlSession().getMapper(EmpMapper.class);
        System.out.println(empMapper.deleteEmp(43));
    }
}
