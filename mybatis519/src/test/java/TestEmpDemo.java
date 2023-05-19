import cn.czyx007.bean.Emp;
import cn.czyx007.mapper.EmpMapper;
import cn.czyx007.utils.SqlSessionUtil;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 9:09
 */
@Log4j
public class TestEmpDemo {
    static EmpMapper empMapper = SqlSessionUtil.getSqlSession().getMapper(EmpMapper.class);

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setEname("123");
        emp.setEsex("123");
        emp.setEstartime(new Date());
        System.out.println(empMapper.insertEmp(emp));
    }
}
