package com.ljz.service.impl;

import com.ljz.dao.UserDao;
import com.ljz.domain.User;
import com.ljz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 *
 * 用户逻辑业务实现类   这个类里必须实现完 接口类里的方法
 *
 * Created by liangjiazhang on 2017/7/14.
 */

@Service

public class LoginServiceImpl implements LoginService  {


    @Autowired
    UserDao userDao;


    /**
     *
     * @param userName
     * @return
     */
    public User findUserByUserName(String userName) {
        return  userDao.findByUserName(userName);
    }

    /**
     *
     * @param id
     * @return
     */
    public User findUserByUserId(Long id) {

        return userDao.findById(id);
    }


    public void updatePasswordWithUserPassWord(User user) {

        userDao.updateUserPassword(user);

    }


    /**
     * 添加用户信息到表里
     * @param user
     * @return
     */
    public void addWithUser(User user) {

         userDao.insertUserData(user);
    }
}
