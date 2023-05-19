package cn.czyx007.mapper;

import cn.czyx007.bean.Brand;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 14:16
 */
//开启二级缓存
@CacheNamespace
public interface BrandMapper {
    //查询所有品牌
    @Select("select * from person_info.tb_brand")
    List<Brand> getBrandAll();

    @Update("update  person_info.tb_brand set brand_name = #{brandName} where id = #{id}")
    int updateBrandById(Brand brand);
}
