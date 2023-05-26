package cn.czyx007.mapper;

import cn.czyx007.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/25 - 15:30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
