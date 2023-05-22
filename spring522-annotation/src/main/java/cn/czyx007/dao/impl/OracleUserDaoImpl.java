package cn.czyx007.dao.impl;

import cn.czyx007.bean.User;
import cn.czyx007.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:37
 */
@Repository(value = "oracleUserDao")
public class OracleUserDaoImpl implements UserDao {
    @Override
    public User getUser(String id) {
        System.out.println("通过Oracle查询用户信息成功");
        return null;
    }
}
