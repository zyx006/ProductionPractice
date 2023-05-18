package cn.czyx007.mapper;

import cn.czyx007.bean.Emp;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/16 - 11:17
 */
public interface EmpMapper {
    //查询所有数据
    List<Emp> getAll();

    //插入一条数据
    int insertEmp(Emp emp);

    //根据eid删除一条数据
    int deleteEmp(Integer eid);
}
