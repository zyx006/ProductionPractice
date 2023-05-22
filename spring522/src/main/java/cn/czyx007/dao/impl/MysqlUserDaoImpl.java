package cn.czyx007.dao.impl;

import cn.czyx007.bean.User;
import cn.czyx007.dao.UserDao;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:36
 */
public class MysqlUserDaoImpl implements UserDao {

    @Override
    public User getUser(String id) {
        System.out.println("通过MySQl查询用户信息成功");
        return null;
    }
}
