package cn.czyx007.mapper;

import cn.czyx007.bean.Computers;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/18 - 14:55
 */
public interface ComputersMapper {
    List<Computers> getComputers();
    List<Computers> queryByConditionIf(Computers computers);
    int updateByConditionSet(Computers computers);
    List<Computers> queryByConditionChoose(Computers computers);
    List<Computers> queryByConditionTrim(Computers computers);
    int updateByConditionTrim(Computers computers);
}