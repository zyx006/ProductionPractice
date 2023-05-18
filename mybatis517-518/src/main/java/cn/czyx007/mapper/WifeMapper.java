package cn.czyx007.mapper;

import cn.czyx007.bean.Wife;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 15:58
 */
public interface WifeMapper {
    //查询老公和老婆的信息
    @Select("select * from person_info.husband h inner join person_info.wife w on h.hus_id = w.hid")
    List<Map<String, Object>> getHusAndWife();

    List<Wife> getHusbandWifeInfo();

    List<Wife> getWifeAll();
}
