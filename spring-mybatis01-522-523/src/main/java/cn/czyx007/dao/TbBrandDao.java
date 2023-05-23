package cn.czyx007.dao;

import cn.czyx007.bean.TbBrand;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;

/**
 * (TbBrand)表数据库访问层
 *
 * @author 张宇轩
 * @since 2023-05-22 15:33:50
 */
public interface TbBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbBrand queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param tbBrand  查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<TbBrand> queryAllByLimit(TbBrand tbBrand, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tbBrand 查询条件
     * @return 总行数
     */
    long count(TbBrand tbBrand);

    /**
     * 新增数据
     *
     * @param tbBrand 实例对象
     * @return 影响行数
     */
    int insert(TbBrand tbBrand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbBrand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbBrand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbBrand> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbBrand> entities);

    /**
     * 修改数据
     *
     * @param tbBrand 实例对象
     * @return 影响行数
     */
    int update(TbBrand tbBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

