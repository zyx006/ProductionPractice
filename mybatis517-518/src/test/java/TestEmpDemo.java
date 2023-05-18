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

    @Test
    public void testDelete(){
//        EmpMapper empMapper = SqlSessionUtil.getSqlSession().getMapper(EmpMapper.class);
        System.out.println(empMapper.deleteEmp(22));
    }

    @Test
    public void testGetAll(){
//        EmpMapper empMapper = SqlSessionUtil.getSqlSession().getMapper(EmpMapper.class);
        log.debug("Test");
        empMapper.getAll().forEach(System.out::println);
    }

    @Test
    public void testGetById(){
        System.out.println(empMapper.getEmpById(1));
    }

    @Test
    public void testGetByOrder(){
        empMapper.selectEmpByOrder("desc").forEach(System.out::println);
    }

    @Test
    public void testSelectEmpBySome(){
        empMapper.selectEmpBySome("b", 2000d, 9000d).forEach(System.out::println);
    }

    @Test
    public void testUpdate(){
        Map<String, Object> map = new HashMap<>();
        map.put("eid", 20);
        map.put("ename", "地理热哈");
        map.put("esex", "女");
        map.put("epay", 9000);
        System.out.println(empMapper.updateEmpById(map));
    }
}
