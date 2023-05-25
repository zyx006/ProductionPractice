package cn.czyx007.service;

import cn.czyx007.bean.User;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/25 - 15:46
 */
public interface UserService {
    List<User> findUser();
}
