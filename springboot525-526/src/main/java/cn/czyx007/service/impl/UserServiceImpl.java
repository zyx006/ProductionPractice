package cn.czyx007.service.impl;

import cn.czyx007.bean.User;
import cn.czyx007.mapper.UserMapper;
import cn.czyx007.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/25 - 15:47
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
        return userMapper.getUser();
    }
}
