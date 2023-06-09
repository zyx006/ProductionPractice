import cn.czyx007.bean.Brand;
import cn.czyx007.bean.Computers;
import cn.czyx007.mapper.BrandMapper;
import cn.czyx007.mapper.ComputersMapper;
import cn.czyx007.utils.SqlSessionUtil;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
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
    //缓存
    @Test
    public void test03(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.getBrandAll().forEach(System.out::println);

        //一级缓存，SqlSession级别
        //更新操作会导致缓存失效
//        Brand brand = new Brand();
//        brand.setId(1);
//        brand.setBrandName("华为");
//        System.out.println(mapper.updateBrandById(brand));
        //也可以手动清除缓存
//        sqlSession.clearCache();

        System.out.println("=============");
        BrandMapper mapper1 = sqlSession.getMapper(BrandMapper.class);
        mapper1.getBrandAll().forEach(System.out::println);
    }

    //如果不是同一个SqlSession，一级缓存失效
    //如果不是同一个SqlSession，二级缓存有效，mapper级别
    @Test
    public void test04(){
        //第一次
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.getBrandAll().forEach(System.out::println);
        //SqlSession关闭，缓存数据
        sqlSession.close();
        //第二次
        System.out.println("+===========");
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        BrandMapper mapper1 = sqlSession1.getMapper(BrandMapper.class);
        mapper1.getBrandAll().forEach(System.out::println);
    }

    @Test
    public void test05(){
        //第一次
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.getBrandAll().forEach(System.out::println);
        //更新操作
        Brand brand = new Brand();
        brand.setId(88);
        brand.setBrandName("小花88");
        mapper.updateBrandById(brand);
        //SqlSession关闭，缓存数据
        sqlSession.close();
        //第二次
        System.out.println("+===========");
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        BrandMapper mapper1 = sqlSession1.getMapper(BrandMapper.class);
        mapper1.getBrandAll().forEach(System.out::println);
    }

}
