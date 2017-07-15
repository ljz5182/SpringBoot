package com.ljz.controller;

import com.ljz.common.ResultGenerator;
import com.ljz.domain.User;
import com.ljz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liangjiazhang on 2017/7/13.
 */

@RestController

@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    LoginService loginService;



    @RequestMapping(value = "/search", method = { RequestMethod.GET, RequestMethod.POST })

    public User searchUserInfo (@RequestParam(value = "userName", required = true) String cityName) {

        return loginService.findUserByUserName("userName");

    }



    @RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST})
    public String registerUser (@RequestBody User user) {

        if (null != user) {

            return registerWithParam(user.getUserName(), user.getUserPassWord());
        } else  {

            return "error";
        }


    }

    @RequestMapping(value = "/update", method = { RequestMethod.GET, RequestMethod.POST} )
    public void  updateInfo (@RequestBody User user) {

        if (null != user) {

             loginService.updatePasswordWithUserPassWord(user);
        } else  {

        }
    }



    /**
     *  用户注册方法
     * @param name
     * @param password
     * @return
     */
    private String registerWithParam (String name, String password) {

        if (null != name && null != password) {
            User user = new User();
            user.setUserName(name);
            user.setUserPassWord(password);
            user.setCreateBy(name);

            // 再注册时，先检查本地，这个号码有没有注册过。如注册过，则不可以注册
            User oldUser = loginService.findUserByUserName(name);

            if (null==oldUser) {

                return ResultGenerator.genSuccessResult("该号码已注册").toString() ;
            } else  {
                loginService.addWithUser(user);

                return ResultGenerator.genSuccessResult("注册成功").toString();
            }

        } else  {

            return  ResultGenerator.genFailResult("失败").toString();
        }
    }


}
