package cn.czyx007.service.impl;

import cn.czyx007.bean.User;
import cn.czyx007.dao.UserDao;
import cn.czyx007.service.UserService;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:41
 */
public class MysqlUserServiceImpl implements UserService {
    //高耦合，换用spring解耦合
//    UserDao userDao = new MysqlUserDaoImpl();
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(String id) {
        return userDao.getUser(id);
    }
}
