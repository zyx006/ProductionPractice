package cn.czyx007.service.impl;

import cn.czyx007.bean.User;
import cn.czyx007.dao.UserDao;
import cn.czyx007.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:41
 */
//若使用注解方式，则不需要主动提供sette方法
@Service("userService")
public class UserServiceImpl implements UserService {
    //自动注入
    @Autowired
    //指定使用哪一个dao
    @Qualifier("mysqlUserDaoImpl")
//    @Resource
    UserDao userDao;

    @Override
    public User findUserById(String id) {
        return userDao.getUser(id);
    }
}
