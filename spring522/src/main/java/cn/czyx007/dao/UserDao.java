package cn.czyx007.dao;

import cn.czyx007.bean.User;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:35
 */
public interface UserDao {
    //根据id查询用户信息
    User getUser(String id);
}
