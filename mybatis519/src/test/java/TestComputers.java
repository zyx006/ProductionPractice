import cn.czyx007.bean.Brand;
import cn.czyx007.bean.Computers;
import cn.czyx007.mapper.BrandMapper;
import cn.czyx007.mapper.ComputersMapper;
import cn.czyx007.utils.SqlSessionUtil;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/19 - 8:53
 */
public class TestComputers {
    @Test
    public void test1(){
        ComputersMapper mapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        mapper.queryByForEach(new long[]{1,2}).forEach(System.out::println);
    }

    @Test
    public void test2(){
        int pageNum=1;
        int pageSize=3;
        com.github.pagehelper.PageHelper.startPage(pageNum, pageSize);
        BrandMapper brandMapper = SqlSessionUtil.getSqlSession().getMapper(BrandMapper.class);
        List<Brand> brandList = brandMapper.getBrandAll();
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        System.out.println("总页数： " + pageInfo.getPages());
        System.out.println("总条数： " + pageInfo.getTotal());
        System.out.println("分页数据： " + pageInfo.getList());
    }

    @Test
    public void testQueryByConditionIf(){
        ComputersMapper mapper = SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        Computers computers = new Computers();
        computers.setBrand("联想");
        computers.setStartPrice(5000F);
        mapper.queryByConditionIf(computers).forEach(System.out::println);
    }
}
