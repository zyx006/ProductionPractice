package cn.czyx007.service;

import cn.czyx007.bean.User;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 9:40
 */
public interface UserService {
    User findUserById(String id);
}
