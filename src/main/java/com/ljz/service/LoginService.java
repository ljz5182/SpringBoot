package com.ljz.service;

import com.ljz.domain.User;
import org.springframework.stereotype.Service;

/**
 *
 *  用户业务逻辑接口类
 * Created by liangjiazhang on 2017/7/13.
 */

public interface LoginService {

    /**
     *  根椐用户名查询用户信息
     * @param userName
     * @return
     */
    User findUserByUserName(String userName);


    /**
     *  根椐用户id 来查询用户信息
     * @param id
     * @return
     */
    User findUserByUserId(Long id);


    /**
     *  更新用户密码， 相当于用户修改密码
     * @param user
     * @return
     */
    void updatePasswordWithUserPassWord(User user);


    /**
     * 添加用户
     * @param user
     * @return
     */
    void addWithUser(User user);
}
