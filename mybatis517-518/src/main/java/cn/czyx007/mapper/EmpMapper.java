package cn.czyx007.mapper;

import cn.czyx007.bean.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/16 - 11:17
 */
public interface EmpMapper {
    //查询所有数据
    List<Emp> getAll();

    //根据id查询
    @Select("select * from person_info.emp where eid = #{eid}")
    Emp getEmpById(Integer eid);

    //插入一条数据
    int insertEmp(Emp emp);

    //根据eid删除一条数据
    @Delete("delete from person_info.emp where eid = #{eid}")
    int deleteEmp(Integer eid);

    //排序查询
    @Select("select * from person_info.emp order by estartime ${o}")
    List<Emp> selectEmpByOrder(String o);

    //根据名字模糊，工资范围查询
    @Select("select * from person_info.emp where ename like concat('%',#{ename},'%') and epay >= #{startPay} and epay <= #{endPay}")
    List<Emp> selectEmpBySome(@Param("ename") String ename, @Param("startPay") double startPay, @Param("endPay") double endPay);

    //根据id修改
    @Update("update person_info.emp set ename = #{ename}, esex = #{esex}, epay = #{epay} where eid = #{eid}")
    int updateEmpById(Map<String, Object> map);
}
