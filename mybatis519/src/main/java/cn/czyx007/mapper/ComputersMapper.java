package cn.czyx007.mapper;

import cn.czyx007.bean.Computers;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/18 - 14:55
 */
public interface ComputersMapper {
    List<Computers> getComputers();

    @Select("<script>" +
            "select * from person_info.computers\n" +
            "        <where>\n" +
            "            <if test=\"brand!=null and brand != ''\">\n" +
            "                and brand like concat('%',#{brand},'%')\n" +
            "            </if>\n" +
            "            <if test=\"startPrice!=null\">\n" +
            "                and price &gt;= #{startPrice}\n" +
            "            </if>\n" +
            "            <if test=\"endPrice!=null\">\n" +
            "                and price &lt;= #{endPrice}\n" +
            "            </if>\n" +
            "            <if test=\"runmem!=null\">\n" +
            "                and runmem = #{runmem}\n" +
            "            </if>\n" +
            "            <if test=\"cpu!=null and cpu!=''\">\n" +
            "                and cpu = #{cpu}\n" +
            "            </if>\n" +
            "            <if test=\"xianka!=null\">\n" +
            "                and xianka = #{xianka}\n" +
            "            </if>\n" +
            "        </where>" +
            "</script>")
    List<Computers> queryByConditionIf(Computers computers);

    int updateByConditionSet(Computers computers);
    List<Computers> queryByConditionChoose(Computers computers);
    List<Computers> queryByConditionTrim(Computers computers);
    int updateByConditionTrim(Computers computers);

    List<Computers> queryByForEach(long[] ids);
}