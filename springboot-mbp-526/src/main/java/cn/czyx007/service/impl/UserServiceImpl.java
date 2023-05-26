package cn.czyx007.service.impl;

import cn.czyx007.bean.User;
import cn.czyx007.mapper.UserMapper;
import cn.czyx007.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/26 - 11:38
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
