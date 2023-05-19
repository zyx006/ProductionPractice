package cn.czyx007.mapper;

import cn.czyx007.bean.Wife;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

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

//    List<Wife> getHusbandWifeInfo();

    @Select("select * from person_info.wife")
    @Results(id = "wifeLazyMap", value = {
            @Result(id = true, column = "wife_id", property = "wifeId"),
            @Result(column = "wife_name", property = "wifeName"),
            @Result(column = "hid", property = "hId"),
            @Result(column = "hid", property = "husband",
                    one = @One(select = "cn.czyx007.mapper.HusbandMapper.getHusbandById", fetchType = FetchType.LAZY))
    })
    List<Wife> getWifeAll();
}
